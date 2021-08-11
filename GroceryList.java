package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    //CREATE an item for the grocery list
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //READ the item(s) in the grocery list
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0;i< groceryList.size();i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //UPDATE an item in the grocery list
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    //DESTROY an item in the grocery list
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position>=0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    //QUERY the grocery list to see if there is a particular item in the list
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position>=0) {
            return true;
        }
        return false;
    }
}