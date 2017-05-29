package com.yelisoft.mfc.model;

/**
 * Created by eliseev on 29.05.2017.
 */

public class Affiliate {
    private String name;
    private String deviceUuid;

    public Affiliate(String name, String deviceUuid) {
        this.name = name;
        this.deviceUuid = deviceUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceUuid() {
        return deviceUuid;
    }

    public void setDeviceUuid(String deviceUuid) {
        this.deviceUuid = deviceUuid;
    }

    @Override
    public String toString() {
        return "Affiliate{" +
                "name='" + name + '\'' +
                ", deviceUuid='" + deviceUuid + '\'' +
                '}';
    }
}
