package com.thymeleaf.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Trainee implements Serializable {

    private static final long serialVersionUID = -8434525235624245252L;

    @NotNull(message = "Trainee ID is required.")
    @Min(value = 1000, message = "Trainee ID must be at least 4 digits.")
    private Integer id;
    @NotNull(message = "Trainee name is required")
    private String name;
    @NotNull(message = "Trainee gender is required.")
    private Character gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    private Float percentage;

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

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}
