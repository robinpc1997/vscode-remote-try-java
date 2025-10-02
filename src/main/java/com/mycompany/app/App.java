/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        // CodeKata: http://codekata.com/kata/kata09-back-to-the-checkout/
        ShoppingCartService service = new ShoppingCartService();
        System.out.println(service.getTotalCostOfShoppingCart("AABB").toString());
        System.out.println(service.getTotalCostOfShoppingCart("AAAABB").toString());
        System.out.println(service.getTotalCostOfShoppingCart("AAAABCCCCB").toString());
    }
}
