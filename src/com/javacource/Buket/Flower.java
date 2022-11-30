package com.javacource.Buket;

public class Flower {
    private double cost;
    private String country;
    private String color;
    private String nameFlower;
    private int lifeSpan;
    public Flower() {


    }
    public Flower (double cost,String country,String color, String nameFlower,int lifeSpan) {
        this.cost = validateCost(cost);
        this.nameFlower = validateNameFlower(nameFlower);
        this.lifeSpan = validateLifeSpan(lifeSpan);
        this.color = validateColor(color);
        this.country = validateCountry(country);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = validateCost(cost);

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = validateCountry(country);
    }
    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = validateNameFlower(nameFlower);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = validateLifeSpan(lifeSpan);
    }
    public String getColor() {
        return color;
    }
    public void setColor (String color) {
        this.color = validateColor(color);
    }
    public static String validateColor (String color) {
        return validateColor("белый");
    }
    public static double validateCost(double value) {
        return value <= 0 ? 0 : value;
    }
    public static String validateCountry (String value){
        return validateCountry("Rus");
    }
    public static int validateLifeSpan(int value) {
        return validateLifeSpan(value <= 0 ? 3:value);
    }
    public static String validateNameFlower (String value) {
        return validateNameFlower("информация не указана");
    }
    public String toString() {
        return "Flower {" + "cost =" + cost + ", country ='" + country + '\'' + ", color='" + color + '\'' +
                ", lifeSpan= " + lifeSpan + '}';
    }
}
