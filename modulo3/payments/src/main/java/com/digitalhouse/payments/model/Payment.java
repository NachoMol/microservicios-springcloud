package com.digitalhouse.payments.model;

public class Payment {

private String id;
private float amount;
private String clientId;
private String ownerId;

    public Payment(String id, float amount, String clientId, String ownerId) {
        this.id = id;
        this.amount = amount;
        this.clientId = clientId;
        this.ownerId = ownerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
