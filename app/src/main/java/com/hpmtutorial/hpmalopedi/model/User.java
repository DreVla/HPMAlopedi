package com.hpmtutorial.hpmalopedi.model;


public class User {

    private String id;
    private String name;
    private Boolean superUser;
    private Boolean auth;
    private String phone;
    private Boolean termsAndConditions;
    private Boolean gDPR;
    private Boolean createdAt;
    private Boolean updatedAt;

    public User() {
    }

    public User(String id, String name, Boolean superUser, Boolean auth, String phone, Boolean termsAndConditions, Boolean gDPR, Boolean createdAt, Boolean updatedAt) {
        super();
        this.id = id;
        this.name = name;
        this.superUser = superUser;
        this.auth = auth;
        this.phone = phone;
        this.termsAndConditions = termsAndConditions;
        this.gDPR = gDPR;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public Boolean getSuperUser() {
        return superUser;
    }

    public void setSuperUser(Boolean superUser) {
        this.superUser = superUser;
    }

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(Boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public Boolean getGDPR() {
        return gDPR;
    }

    public void setGDPR(Boolean gDPR) {
        this.gDPR = gDPR;
    }

    public Boolean getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Boolean createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Boolean updatedAt) {
        this.updatedAt = updatedAt;
    }

}