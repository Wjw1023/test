package com.wang.day04;

public class Test {
    private String Name;
    private String Id;
    private Double Price;
    private int Number;

    public Test(){}

    public Test(String name, String id, Double price,int number) {
        this.Name = name ; this.Id = id; this.Price = price; this.Number = number;
    }

    public int getNumer() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    }





