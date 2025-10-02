
package com.mycompany.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    public List<InventoryPosition> getAllProductsInInventory(){
        List<String> csvLines = readCsvFile("prices.csv");
        return transformCsvLinesToInventoryPosition(csvLines);
    }

    private List<InventoryPosition> transformCsvLinesToInventoryPosition(List<String> csvLines){
        List<InventoryPosition> currentInventory = new ArrayList<>();
        for(String current : csvLines){
            String[] splittedString = current.split(",");
            currentInventory.add(new InventoryPosition(removeWhitespacesFromString(splittedString[0]).charAt(0), Integer.parseInt(removeWhitespacesFromString(splittedString[1]))));
        }
        return currentInventory;
    }

    private String removeWhitespacesFromString(String input){
        return input.replaceAll("\\s+","");
    }

    private List<String> readCsvFile(String csvFilePath){
        List<String> csvLineList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                csvLineList.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvLineList;
    }
}
