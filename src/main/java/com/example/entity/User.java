package com.example.entity;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String geder;

    public User(Integer id, String name, Integer age, String geder) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.geder = geder;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", geder='" + geder + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGeder() {
        return geder;
    }

    public void setGeder(String geder) {
        this.geder = geder;
    }
}
