package com.hpmtutorial.hpmalopedi.model;

public class Child implements ItemType{

    private String id;
    private String name;
    private String dateOfBirth;
    private String createdAt;
    private String updatedAt;
    private String[] alergies;

    public Child() {
    }

    public Child(String id, String name, String dateOfBirth, String createdAt, String updatedAt, String[] alergies) {
        super();
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.alergies = alergies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String[] getAlergies() {
        return alergies;
    }

    public void setAlergies(String[] alergies) {
        this.alergies = alergies;
    }

    @Override
    public int getType() {
        return 101;
    }
}