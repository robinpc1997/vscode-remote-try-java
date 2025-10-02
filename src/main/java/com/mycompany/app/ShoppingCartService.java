
package com.mycompany.app;

import java.util.List;

public class ShoppingCartService {

    public Integer getTotalCostOfShoppingCart(String shoppingCartContent){
        Integer result = 0;
        InventoryService inventoryService = new InventoryService();
        List<InventoryPosition> inventoryPosition =  inventoryService.getAllProductsInInventory();
        for(InventoryPosition current: inventoryPosition){
            result += getCostForInventoryPositionInShoppingCart(current, shoppingCartContent);
        }
        return result;
    }
    
    private Integer getCostForInventoryPositionInShoppingCart(InventoryPosition currentInventoryPosition, String shoppingCartContent){
       return getAmountOfItemInShoppingCart(shoppingCartContent,currentInventoryPosition.getIdentifier()) * currentInventoryPosition.getPrice();
    }

    private Integer getAmountOfItemInShoppingCart(String shoppingCartContent, char productIdentifier){
        return shoppingCartContent.split(productIdentifier+"", -1).length-1;
    }
}
