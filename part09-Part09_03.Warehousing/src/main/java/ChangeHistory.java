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

public class ChangeHistory {
    
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changeHistory.add(status);
    }
    
    public void clear() {
        this.changeHistory.clear();
    }
    
    public double maxValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double max = 0.0;
        for (Double d : this.changeHistory) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }
    
    public double minValue() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double min = this.changeHistory.get(0);
        for (Double d : this.changeHistory) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }
    
    public double average() {
        if (this.changeHistory.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        int counter = 0;
        
        for (Double d : this.changeHistory) {
            sum += d;
            counter ++;
        }
        return sum / counter;
    }
    
    public String toString() {
        return this.changeHistory.toString();
    }
}
