package org.example.myvaluablecenter.model;

import java.util.List;
public class Product {
    private int id;
    private String name;
    private double price;
    private List<Comment> comments;

    public Product(int id, String name, String description, double price, List<Comment> comments) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.comments = comments;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public List<Comment> getComments() { return comments; }
}

