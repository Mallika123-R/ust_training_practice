package com;

public class Car {

    private int id;
    private String model;
    private String Company;
    private double price;
    private Wheel mrf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Wheel getMrf() {
        return mrf;
    }

    public void setMrf(Wheel mrf) {
        this.mrf = mrf;
    }
}
