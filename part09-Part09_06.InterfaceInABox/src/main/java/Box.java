/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
import java.util.ArrayList;

public class Box implements Packable {
    
    private double capacity;
    private ArrayList<Packable> packables;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.packables = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if (weight() + packable.weight() <= this.capacity) {
            this.packables.add(packable);
        }
    }
    
    public double weight() {
        double totWeight = 0;
        
        for (Packable p : this.packables) {
            totWeight += p.weight();
        }
        return totWeight;
    }
    
    public String toString() {
        return "Box: " + this.packables.size() + " items, total weight "
                + weight() + " kg";
    }
}
