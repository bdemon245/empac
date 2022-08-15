package com.example.empaccollegev002;

public class userFeedBackModel {
    private int id;
    private int roll;
    private String name;
    private String tech;
    private String contact;
    private String description;
    //Creating constructor to use in other activity
    public userFeedBackModel(int id, int roll, String name, String tech, String contact, String description) {
        this.id = id;
        this.roll = roll;
        this.name = name;
        this.tech = tech;
        this.contact = contact;
        this.description = description;
    }
    //Create an empty Constructor to use in other activity
    public userFeedBackModel() {
    }
    //toString for accessing toString() method like userFeedBackModel.toString();
    @Override
    public String toString() {
        return "ID = "+ id +
                ", Name=\t" + name +
                ", Roll=\t" + roll +
                ",\nTechnology= " + tech +
                ", Description= " + description +
                ",\nContact= "+ contact + "\n";
    }


    //Getters & Setters for accessing the variables

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
