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
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;
    
    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productPrices.put(product, price);
        this.productStock.put(product, stock);
    }
    
    public int price(String product) {
        
        return this.productPrices.getOrDefault(product, -99);
        
        // if (this.productPrices.keySet().contains(product)) {
        //     return this.productPrices.get(product);
        // }
        // return -99;
    }
    
    public int stock(String product) {
        
        return this.productStock.getOrDefault(product, 0);

        // if (this.productStock.keySet().contains(product)) {
        //     return this.productStock.get(product);
        // }
        // return 0;
    }
    
    public boolean take(String product) {
        
        if (this.stock(product) > 0) {
            this.productStock.put(product, this.productStock.get(product) - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<>();
        
        for (String product : this.productStock.keySet()) {
            products.add(product);
        }
        return products;
    }
}
