package com.yelisoft.mfc.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by eliseev on 29.05.2017.
 */
public class Ticket {
        private int clientNum;
		private String prefix;
		private int cabNum;
		private int failedTimes;
		private int queueLength;
		private long spendTime;
		private long startTime;
		private int putAsideTime;
		private int putAsideTimeRemaining;
		private int putAsideStartTime;
		private int deletedTime;
		private long waitTime;
		private long duration;
		private boolean remoteReg;
		private Date regTime;
		private String serviceName;
		private String queueUuid;
		private String cabnumsList;
		private String floorSetString;
		private String SID;
		private String LID;
		private Status status;
		private Priority priority;
		private String[] history;
		private AdditionalInfo additionalInfo;
		private String queueName;
		private String uuid;
		private boolean blocking;
		private String quality;
		private String serviceNodeUuid;
		private InputAdditionalInfo inputAdditionalInfo;


    public enum Priority {

        PRIMARY("PRIMARY", 5),
        HIGHEST("HIGHEST", 4),
        HIGH("HIGH", 3),
        MEDIUM("MEDIUM", 2),
        LOW("LOW", 1),
        LOWEST("LOWEST", 0);
        private final String priority;
        private final int priorityValue;

        private Priority(String priority, int priorityValue) {
            this.priority = priority;
            this.priorityValue = priorityValue;
        }

        public int getPriorityValue() {
            return priorityValue;
        }

        @Override
        public String toString() {
            if (priority.equals("PRIMARY")) {
                return "Наивысший";
            } else if (priority.equals("HIGHEST")) {
                return "Самый высокий";
            } else if (priority.equals("HIGH")) {
                return "Высокий";
            } else if (priority.equals("MEDIUM")) {
                return "Средний";
            } else if (priority.equals("LOW")) {
                return "Низкий";
            } else if (priority.equals("LOWEST")) {
                return "Самый низкий";
            }
            return priority;
        }
    }

    public enum Status {

        WAIT("WAIT", "Ожидает"),
        CALL("CALL", "Вызывается"),
        HASBEENCALLED("HASBEENCALLED", "Вызван"),
        RECALL("RECALL", "Повторный вызов"),
        PUTASIDE("PUTASIDE", "Отложен"),
        SERVED("SERVED", "Обслуживается"),
        FINISHED("FINISHED", "Завершен"),
        REDIRECT("REDIRECT", "Перенаправлен"),
        DELETED("DELETED", "Удален");
        private final String status;
        private final String translate;

        private Status(final String status, final String translate) {
            this.status = status;
            this.translate = translate;
        }

        public String translate() {
            return translate;
        }

        @Override
        public String toString() {
            return status;
        }
    }






    public int getClientNum() {
        return clientNum;
    }

    public void setClientNum(int clientNum) {
        this.clientNum = clientNum;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getCabNum() {
        return cabNum;
    }

    public void setCabNum(int cabNum) {
        this.cabNum = cabNum;
    }

    public int getFailedTimes() {
        return failedTimes;
    }

    public void setFailedTimes(int failedTimes) {
        this.failedTimes = failedTimes;
    }

    public int getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(int queueLength) {
        this.queueLength = queueLength;
    }

    public long getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(long spendTime) {
        this.spendTime = spendTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getPutAsideTime() {
        return putAsideTime;
    }

    public void setPutAsideTime(int putAsideTime) {
        this.putAsideTime = putAsideTime;
    }

    public int getPutAsideTimeRemaining() {
        return putAsideTimeRemaining;
    }

    public void setPutAsideTimeRemaining(int putAsideTimeRemaining) {
        this.putAsideTimeRemaining = putAsideTimeRemaining;
    }

    public int getPutAsideStartTime() {
        return putAsideStartTime;
    }

    public void setPutAsideStartTime(int putAsideStartTime) {
        this.putAsideStartTime = putAsideStartTime;
    }

    public int getDeletedTime() {
        return deletedTime;
    }

    public void setDeletedTime(int deletedTime) {
        this.deletedTime = deletedTime;
    }

    public long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(long waitTime) {
        this.waitTime = waitTime;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public boolean isRemoteReg() {
        return remoteReg;
    }

    public void setRemoteReg(boolean remoteReg) {
        this.remoteReg = remoteReg;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getQueueUuid() {
        return queueUuid;
    }

    public void setQueueUuid(String queueUuid) {
        this.queueUuid = queueUuid;
    }

    public String getCabnumsList() {
        return cabnumsList;
    }

    public void setCabnumsList(String cabnumsList) {
        this.cabnumsList = cabnumsList;
    }

    public String getFloorSetString() {
        return floorSetString;
    }

    public void setFloorSetString(String floorSetString) {
        this.floorSetString = floorSetString;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getLID() {
        return LID;
    }

    public void setLID(String LID) {
        this.LID = LID;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String[] getHistory() {
        return history;
    }

    public void setHistory(String[] history) {
        this.history = history;
    }

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getServiceNodeUuid() {
        return serviceNodeUuid;
    }

    public void setServiceNodeUuid(String serviceNodeUuid) {
        this.serviceNodeUuid = serviceNodeUuid;
    }

    public InputAdditionalInfo getInputAdditionalInfo() {
        return inputAdditionalInfo;
    }

    public void setInputAdditionalInfo(InputAdditionalInfo inputAdditionalInfo) {
        this.inputAdditionalInfo = inputAdditionalInfo;
    }
}
