package com.yelisoft.mfc.model;

/**
 * Created by eliseev on 29.05.2017.
 */
public class InputAdditionalInfo {
	private boolean secondName;
    private boolean clientAddress;
    private boolean phone;
    private boolean countCases;
    private long serviceTime;

    public boolean isSecondName() {
        return secondName;
    }

    public void setSecondName(boolean secondName) {
        this.secondName = secondName;
    }

    public boolean isClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(boolean clientAddress) {
        this.clientAddress = clientAddress;
    }

    public boolean isPhone() {
        return phone;
    }

    public void setPhone(boolean phone) {
        this.phone = phone;
    }

    public boolean isCountCases() {
        return countCases;
    }

    public void setCountCases(boolean countCases) {
        this.countCases = countCases;
    }

    public long getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(long serviceTime) {
        this.serviceTime = serviceTime;
    }
}
