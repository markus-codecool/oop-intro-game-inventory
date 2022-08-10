package com.codecool;

import com.codecool.item.Inventory;
import com.codecool.item.Item;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        addItemToInventory(inventory, "Sword");
        addItemToInventory(inventory, "Sword");
        addItemToInventory(inventory, "Sword");
        addItemToInventory(inventory, "Sword");
        System.out.println(inventory);
        addItemToInventory(inventory, "Rope");
        System.out.println(inventory);
    }

    private static void addItemToInventory(Inventory inventory, String name) {
        Item item = new Item(name);
        inventory.add(item);
    }
}