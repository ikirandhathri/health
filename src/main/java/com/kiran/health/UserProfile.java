package com.kiran.health;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_PROFILE")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;
    private double currentWeight;
    private double targetWeight;
    private int dailyCalorieGoal;

    // Default constructor required by JPA
    public UserProfile() {}

    public UserProfile(int age, double currentWeight, double targetWeight, int dailyCalorieGoal) {
        this.age = age;
        this.currentWeight = currentWeight;
        this.targetWeight = targetWeight;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getCurrentWeight() { return currentWeight; }
    public void setCurrentWeight(double currentWeight) { this.currentWeight = currentWeight; }
    public double getTargetWeight() { return targetWeight; }
    public void setTargetWeight(double targetWeight) { this.targetWeight = targetWeight; }
    public int getDailyCalorieGoal() { return dailyCalorieGoal; }
    public void setDailyCalorieGoal(int dailyCalorieGoal) { this.dailyCalorieGoal = dailyCalorieGoal; }
}