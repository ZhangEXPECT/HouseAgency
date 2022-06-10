package com.example.groupproject.entity;

import java.io.Serializable;

public class Client implements Serializable {
    private Integer clientId;
    private String clientAccount;
    private String clientPassword;
    private String clientPhone;
    private String clientName;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientAccount='" + clientAccount + '\'' +
                ", clientPassword='" + clientPassword + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
