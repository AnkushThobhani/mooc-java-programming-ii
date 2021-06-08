/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    
    private List<Movable> herdList;
    
    public Herd() {
        this.herdList = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String newString = "";

        for (Movable mov : herdList) {
            newString += mov.toString().trim() + "\n";
        }
        
        return newString;
    }

    
    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable organism : herdList) {
            organism.move(dx, dy);
        }
    }
}
