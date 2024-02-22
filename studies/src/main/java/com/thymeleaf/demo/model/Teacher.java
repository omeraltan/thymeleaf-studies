package com.thymeleaf.demo.model;

import java.io.Serializable;

public class Teacher{
    private String gender;
    private boolean isActive;
    private String courses;
    private String additionalSkills;
    private int age;

    public Teacher(String gender, boolean isActive, String courses, String additionalSkills, int age) {
        this.gender = gender;
        this.isActive = isActive;
        this.courses = courses;
        this.additionalSkills = additionalSkills;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getAdditionalSkills() {
        return additionalSkills;
    }

    public void setAdditionalSkills(String additionalSkills) {
        this.additionalSkills = additionalSkills;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
