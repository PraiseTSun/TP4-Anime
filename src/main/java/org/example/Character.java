package org.example;

public class Character {
    private String name;
    private String role;


    public Character() {
        this.name = "";
        this.role = "";
    }

    public Character(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
