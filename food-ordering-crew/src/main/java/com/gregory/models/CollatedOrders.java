package com.gregory.models;

import java.util.ArrayList;

public class CollatedOrders {
    private Crew crew;
    private ArrayList<Order> orders;

    public CollatedOrders(Crew crew, ArrayList<Order> orders) {
        this.crew = crew;
        this.orders = orders;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public Crew getCrew() {
        return this.crew;
    }

    public ArrayList<Order> getOrders() {
        return this.orders;
    }
}
