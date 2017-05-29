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

    private static Config config;

    public void init() throws FileNotFoundException {
        Reader reader = new FileReader(Thread.currentThread().getContextClassLoader().getResource("properties.json").getPath());
        JsonReader jsonReader = new JsonReader(reader);
        Gson gson = new Gson();
        Config config = gson.fromJson(jsonReader, Config.class);
        System.out.println(config);
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

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }



    @Override
    public String toString() {
        return "Config{" +
                "affiliates=" + affiliates +
                ", url='" + url + '\'' +
                '}';
    }
}
