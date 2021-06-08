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
import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> averages;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.averages = new ArrayList<>();
    }
    
    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }
    
    @Override
    public boolean isOn() {
        
        boolean isOn = false;
        
        for (Sensor s : this.sensors) {
            if (s.isOn() == true) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }
        }
        return isOn;
    }
    
    @Override
    public void setOn() {
        this.sensors.stream()
                .forEach(s -> s.setOn());
    }
    
    @Override
    public void setOff() {
        this.sensors.stream()
                .forEach(s -> s.setOff());
    }
    
    @Override
    public int read() {
        int sum = 0;
        
        if (isOn() && !sensors.isEmpty()) {
            for (Sensor s : this.sensors) {
                sum += s.read();
            }
            
            int avg = sum / sensors.size();
            this.averages.add(avg);
            return avg;
        } else {
            throw new IllegalStateException("Error getting average of sensors");
        }
    }
    
    public List<Integer> readings() {
        return this.averages;
    }
}
