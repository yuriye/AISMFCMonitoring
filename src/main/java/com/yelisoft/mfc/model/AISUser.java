package com.yelisoft.mfc.model;

/**
 * Created by eliseev on 05.06.2017.
 */
public class AISUser {
    private long id;
    private String username;
    private Affiliate affiliate;

    public AISUser(long id, String name) {
        this.id = id;
        this.username = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Affiliate getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(Affiliate affiliate) {
        this.affiliate = affiliate;
    }
}
