/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author ankushthobhani
 */
import java.util.Random;

public class TemperatureSensor implements Sensor {
    
    private boolean isOn;
    
    public TemperatureSensor() {
        this.isOn = false;
    }
    
    @Override
    public boolean isOn() {
        return this.isOn;
    }
    
    @Override
    public void setOn() {
        this.isOn = true;
    }
    
    @Override
    public void setOff() {
        this.isOn = false;
    }
    
    @Override
    public int read() {
       
        if (isOn()) {
            Random randomTemp = new Random();
            int range = randomTemp.nextInt(30 - (-30) + 1) + (-30);
            
            return range;
        } else {
            throw new IllegalStateException("");
        }
    }
    
}
