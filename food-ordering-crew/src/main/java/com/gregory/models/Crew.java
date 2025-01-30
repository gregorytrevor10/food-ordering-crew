package com.gregory.models;

import java.util.ArrayList;

public class Crew {
    private String crewName;
    private ArrayList<User> members;

    public Crew(String crewName, ArrayList<User> members) {
        this.crewName = crewName;
        this.members = members;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public String getcrewName() {
        return this.crewName;
    }

    public ArrayList<User> getMemberList(ArrayList<User> members) {
        return this.members;
    }

}