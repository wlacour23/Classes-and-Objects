package com.tts.Pets;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet() {
        name = "default name";
        age = 0;
        location = "location";
        type = "type";
    }


    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

}
