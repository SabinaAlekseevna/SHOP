package com.example.shop;

public class product {

    String product_name;
    String size;
    int id_size;
    int price_RUB;
    String colour;
    int quantity;
    String structure;

    public product(String product_name, String size, int id_size, int price_RUB, String colour, int quantity, String structure) {
        this.product_name = product_name;
        this.size = size;
        this.id_size = id_size;
        this.price_RUB = price_RUB;
        this.colour = colour;
        this.quantity = quantity;
        this.structure = structure;
    }


    public String getProduct_name() {
        return product_name;
    }

    public String getSize() {
        return size;
    }

    public int getId_size() {
        return id_size;
    }

    public int getPrice_RUB() {
        return price_RUB;
    }

    public String getColour() {
        return colour;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStructure() {
        return structure;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setId_size(int id_size) {
        this.id_size = id_size;
    }

    public void setPrice_RUB(int price_RUB) {
        this.price_RUB = price_RUB;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }


}
