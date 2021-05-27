package com.rianputrarama.object;

public class Employee {

    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Employee() {
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

    public String replaceWordInText(String changeRole) {
        return role.replace(role, changeRole);
    }

    public boolean isWordInText(String word) {
        return name.contains(word);
    }
}
