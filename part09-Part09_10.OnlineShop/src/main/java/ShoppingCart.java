/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>(); 
    }
    
    public void add(String product, int price) {
        if (this.cart.keySet().contains(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int sum = 0;
        
        for (Item i : this.cart.values()) {
            sum += i.price();
        }
        return sum;
    }
    
    public void print() {
        for (Item i : this.cart.values()) {
            System.out.println(i.toString());
        }
    }
    
}
