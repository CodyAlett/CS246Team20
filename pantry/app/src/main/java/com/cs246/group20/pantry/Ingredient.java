package com.cs246.group20.pantry;

/**
 * Created by wel12 on 5/30/2017.
 */

public class Ingredient {
    private String name;
    private String category;
    private Integer quantity;

    public Ingredient() {
        name = null;
        category = null;
        quantity = null;
    }
    public Ingredient(String n) {
        name = n;
        category = null;
        quantity = null;
    }
    public Ingredient(String n, String c) {
        name = n;
        category = c;
        quantity = null;
    }
    public Ingredient(String n, int q) {
        name = n;
        category = null;
        quantity = q;
    }
    public Ingredient(String n, String c, int q) {
        name = n;
        category = c;
        quantity = q;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
