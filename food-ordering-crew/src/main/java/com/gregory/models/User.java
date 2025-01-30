package com.gregory.models;

import java.util.UUID;

public class User {
    private UUID userId;
    private String name;
    private String phoneNumber;

    public User(String name, String phoneNumber) {
        this.userId = UUID.randomUUID();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public UUID getUserId() {
        return this.userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
