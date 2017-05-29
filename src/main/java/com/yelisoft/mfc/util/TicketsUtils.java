package com.yelisoft.mfc.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yelisoft.mfc.model.Ticket;
import com.yelisoft.mfc.Config;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * Created by eliseev on 29.05.2017.
 */
public class TicketsUtils {
    private static final Logger LOG = LoggerFactory.getLogger(TicketsUtils.class);

    /*
    ArrayList<Ticket> getAllTicketsForAffiliate(String deviceUuid) {
        String url = Config.getConfig().getUrl();
        url = url + "/getqueue/" + deviceUuid + "?queueUuid=all";


        return null;
    }*/

    public List<Ticket> getAllTicketsForAffiliate(String deviceUuid) {

        HttpClient httpClientForGetQueue;

        List<Ticket> result = new ArrayList<>();

        String str = Config.getConfig().getUrl() + "/getqueue/" + deviceUuid + "?queueUuid=all";
        httpClientForGetQueue = new HttpClient();
        LOG.info("getQueue url = {}", str);

        InputStreamReader isr;
        try {
            PostMethod getQueuePostMethod = new PostMethod(str);
            getQueuePostMethod.getParams().setContentCharset("utf-8");
            int statusCode = httpClientForGetQueue.executeMethod(getQueuePostMethod);

            if (statusCode != HttpStatus.SC_OK) {
                LOG.error("Method failed: " + getQueuePostMethod.getStatusLine());
                return Collections.EMPTY_LIST;
            }

            InputStream input = getQueuePostMethod.getResponseBodyAsStream();
            String encoding = getQueuePostMethod.getResponseCharSet();
            if (encoding == null) {
                encoding = "UTF-8";
//		log.info("encoding == null -> encoding = \"UTF-8\"");
            } else {
//		log.info("encoding: {}", encoding);
            }
            isr = new InputStreamReader(input, encoding);
            try {
                Type listClientModelType = new TypeToken<List<Ticket>>() {
                }.getType();
                Gson gson = new Gson();
                result = gson.fromJson(isr, listClientModelType);
            } finally {
                isr.close();
            }
        } catch (IOException ex) {
            LOG.info(ex.getMessage());
        }

        return result;
    }
}
