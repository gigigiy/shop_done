package com.example.demo4.Cart;

import com.example.demo4.home.Product;

public class CartEntry {
    private Product product;
    private  int quantiity;

    public  CartEntry(Product product,int quantiity){
        this.product = product;
        this.quantiity = quantiity;

    }
    public Product getProduct(){
        return product;
    }
    public  int getQuantiity(){
        return quantiity;
    }
    public void increaseQuantity(){
        this.quantiity++;
    }
    public void decreaseQuantity(){
        if(this.quantiity>0){
            this.quantiity--;
        }
    }
}
