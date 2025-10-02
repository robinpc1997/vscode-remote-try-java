package com.mycompany.app;

public class InventoryPosition {
    private char identifier;
    private Integer price;

    public InventoryPosition(char identifier, Integer price){
        this.identifier = identifier;
        this.price = price;
    }

    public char getIdentifier(){
        return identifier;
    }

    public Integer getPrice(){
        return price;
    }
}
