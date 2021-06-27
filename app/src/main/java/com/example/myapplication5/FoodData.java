package com.example.myapplication5;

public class FoodData {
    private String itemname;
  private String itemDescription;
    private String tvName;
    public int itemImage;

    public FoodData(String itemname, String itemDescription, String itemPrice, int itemImage) {
        this.itemname = itemname;
        this.itemDescription = itemDescription;
        this.tvName = itemPrice;
        this.itemImage = itemImage;
    }

    public String getItemname() {
        return itemname;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemPrice() {
        return tvName;
    }

    public int getItemImage() {
        return itemImage;
    }
}