package com.hpmtutorial.hpmalopedi.model;

import java.util.List;

public class Family implements ItemType {

    private String idFamily;
    private Object superUser;
    private List<Child> children = null;
    private List<User> users = null;


    public Family() {
    }

    public Family(String idFamily, Object superUser, List<Child> children, List<User> users) {
        super();
        this.idFamily = idFamily;
        this.superUser = superUser;
        this.children = children;
        this.users = users;
    }

    public String getIdFamily() {
        return idFamily;
    }

    public void setIdFamily(String idFamily) {
        this.idFamily = idFamily;
    }

    public Object getSuperUser() {
        return superUser;
    }

    public void setSuperUser(Object superUser) {
        this.superUser = superUser;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public void addChild(Child newChild){
        this.children.add(newChild);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User newUser){
        this.users.add(newUser);
    }

    @Override
    public int getType() {
        return 102;
    }
}