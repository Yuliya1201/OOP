package com.javacource.Transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class CarPart2<Insurance> {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private final String color;
    private final String bodyType;
    private boolean isSummerRubber;

    private String transmission;
    private String number;
    private final int seatCount;
    private double enginePower;

    private Key key;
    private Insurance insurance;


    public String remoteStart;
    public String keylessAccess;
    public static String substitution;


    public CarPart2(String brand, String model, Integer year, String country, String color, String bodyType,
                    boolean isSummerRubber, String transmission, String number, int seatCount, double enginePower) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.year = validateYear(year);
        this.country = validateCountry(country);
        this.color = validateColor(color);
        this.bodyType = validateCarParameters(bodyType);
        this.isSummerRubber = isSummerRubber;
        this.transmission = validateTransmission(transmission);
        this.number = validateCarNumber(number);
        this.seatCount = validateSeatCount(seatCount);
        this.enginePower = validateEngine(enginePower);
    }

    public String toString() {
        return "Car {" + "brend ='" + brand + '\'' + ", model = '" + model + '\'' +
                ", country= '" + country + '\'' + ", color ='" + color + '\'' + ", bodyType='"
                + bodyType + '\'' + ", isSummerRubber=" + isSummerRubber + ",transmission='" +
                transmission + '\'' + ", number='" + number + '\'' + ", seatCount=" + seatCount +
                ",enginePower=" + enginePower + ",key=" + key + ",insurance=" + insurance + '}';
    }


    public static String validateCountry(String value) {
        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;
    }

    public static String validateColor(String value) {
        return validateColor("желтый");
    }

    public static String validateCarParameters(String value) {
        return value == null ? "default" : value;
    }

    public static String validateTransmission(String value) {
        return validateTransmission("автомат");
    }

    public static Integer validateYear(Integer value) {
        return value <= 1900 ? 2000 : value;
    }

    public static String validateCarNumber(String number) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", number)) {
            return number;
        } else {
            System.out.println("номер некорректный");
            return "неверный номер";
        }
    }

    public static int validateSeatCount(int seaCount) {
        return seaCount <= 0 ? 4 : seaCount;
    }

    public static double validateEngine(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = validateCarNumber(number);
    }

    public int getSeaCount() {
        return seatCount;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = validateEngine(enginePower);
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void switchRubber() {
        setSummerRubber(!this.isSummerRubber);
    }

    public class Key {
        private final Boolean remoteStart;
        private final Boolean keylessAccess;

        public Key(Boolean remoteStart, Boolean keylessAccess) {
            this.remoteStart = validateBoolean(remoteStart);
            this.keylessAccess = validateBoolean(keylessAccess);
        }

        public String toString() {
            return "Key{" + "remoteStart='" + remoteStart + '\'' + ",keylessAccess='" + keylessAccess + '\'' + '}';
        }


        public Boolean validateBoolean(Boolean value) {
            return value == null && value;
        }
    }


    public class Insurance {
        private final LocalDate duration;
        private final double cost;
        private final String number;


        public Insurance(LocalDate duration, double cost, String number) {
            this.duration = checkDuration(duration);
            this.cost = validateCost(cost);
            this.number = isValidSerialNumber(number) ? number : "invalid number";
        }


        public String toString() {
            return "Insurance{" + "duration='" + duration + ",cost=" + cost + ",number='" +
                    number + '\'' + '}';
        }
    }

    public double validateCost(double value) {
        return value <= 0 ? 1000 : value;
    }

    private boolean isValidSerialNumber(String number) {
        if (Pattern.matches("[а-яА-Яa-zA-Z0-9]{9}", number)) {
            return true;
        } else {
            System.out.println("номер не корректен");
            return false;
        }
    }

    public LocalDate checkDuration(LocalDate duration) {
        if (LocalDate.now().isAfter(duration)) {
            System.out.println("страховка просрочена.Оформите новую");
            return LocalDate.now();
        } else {
            return duration;
        }
    }
}

