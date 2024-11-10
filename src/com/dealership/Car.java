package com.dealership;

public class Car {
    private int id;
    private String model;
    private int year;
    private double price;
    private String imageUrl;

    // Constructor
    public Car(int id, String model, int year, double price, String imageUrl) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Getters and setters for all properties
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
