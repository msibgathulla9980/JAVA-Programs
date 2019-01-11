package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.List;

public class InventoryList {

    private String inventoryName;
    
    List<Inventory> listOfInventories = new ArrayList<Inventory>();

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName)//used to set if the inventory name isn't present
    {
        this.inventoryName = inventoryName;
    }

    public List<Inventory> getListOfInventories() {
        return listOfInventories;
    }

    public void setListOfInventories(List<Inventory> listOfInventories) {
        this.listOfInventories = listOfInventories;
    }

}
