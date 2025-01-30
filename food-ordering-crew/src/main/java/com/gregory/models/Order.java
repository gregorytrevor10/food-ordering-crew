package com.gregory.models;

import java.util.UUID;

public class Order {
    private String itemName;
    private double cost;
    Restaurant restaurant;
    private String notes;
    private UUID belongsToUserId;

    public Order(String itemName, double cost, Restaurant restaurant, String notes, UUID belongsToUserId) {
        this.itemName = itemName;
        this.cost = cost;
        this.restaurant = restaurant;
        this.notes = notes;
        this.belongsToUserId = belongsToUserId;
    }

    public void setItemName(String itemname) {
        this.itemName = itemname;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return this.notes;
    }

    public UUID getBelongsToUserId() {
        return this.belongsToUserId;
    }

}
