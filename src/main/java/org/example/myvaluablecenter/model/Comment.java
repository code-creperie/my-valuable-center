package org.example.myvaluablecenter.model;

public class Comment {
    private int id;
    private String text;
    private String author;

    public Comment(int id, String text, String author) {
        this.id = id;
        this.text = text;
        this.author = author;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getText() { return text; }
    public String getAuthor() { return author; }
}