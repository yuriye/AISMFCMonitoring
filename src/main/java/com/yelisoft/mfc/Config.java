package com.yelisoft.mfc;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.yelisoft.mfc.model.Affiliate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eliseev on 29.05.2017.
 */
public class Config {
    private List<Affiliate> affiliates = new ArrayList<>();
    private String url;
    private static Config instance = null;

    private Config() {}



    public static synchronized Config getInstance() {
        if (instance == null) {
            Reader reader = null;
            try {
                reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource("properties.json").getPath());
                JsonReader jsonReader = new JsonReader(reader);
                Gson gson = new Gson();
                instance = gson.fromJson(jsonReader, Config.class);
                System.out.println(instance);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public void setAffiliates(List<Affiliate> affiliates) {
        this.affiliates = affiliates;
    }

    public List<Affiliate> getAffiliates() {
        return affiliates;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Config{" +
                "affiliates=" + affiliates +
                ", url='" + url + '\'' +
                '}';
    }
}
