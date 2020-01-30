package com.JPASetup.JPADB.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//create this class "user" as a table, need to make it an entity
@Entity
public class User {

    @Id//this is the primary key
    @GeneratedValue//this makes it a generated value
    private long id;

    private String name;

    private String role;

    protected User(){

    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
