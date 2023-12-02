package com.example.demo4.Cart;

import com.example.demo4.home.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private static ShoppingCart INSTANCE;

    public static ShoppingCart getINSTANCE(){
        if(INSTANCE == null){
           INSTANCE = new ShoppingCart();
        }
        return INSTANCE;
    }

    private Map<String,CartEntry> entries;

    public ShoppingCart(){
        this.entries = new HashMap<>();
    }
    public void addProduct(String productName){
        CartEntry productEntry = entries.get(productName.toUpperCase());
        if(productEntry!=null){
            productEntry.increaseQuantity();
        }else{
            Product product = Product.valueOf(productName);
            CartEntry entry = new CartEntry(product, 1);
            entries.put(productName.toUpperCase(),entry);
        }
    }
    public void reomveProduct(String productName){
        CartEntry productEntry =  entries.get(productName.toUpperCase());
        if(productEntry != null){
            productEntry.decreaseQuantity();
        }
    }
    public int getQuantity(String productName){
        CartEntry entry = entries.get(productName.toUpperCase());
        if(entry != null){
            return entry.getQuantiity();
        }
        return 0;
    }
    public float calculateTotal(){
        float total = 0;
        for(CartEntry entry:entries.values()){
            float entryCost = entry.getProduct().getPrice()*entry.getQuantiity();
            total = total + entryCost;
        }
        return total;
    }
    public List<CartEntry> getEntries(){
        return new ArrayList<>(entries.values());
    }
}
