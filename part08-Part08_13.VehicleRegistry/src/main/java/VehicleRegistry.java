/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.get(licensePlate) == null) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        if (registry.get(licensePlate) == null) {
            return null;
        }
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (registry.get(licensePlate) == null) {
            return false;
        }
        registry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate);
        } 
    }
    
    public void printOwners() {
        
        ArrayList<String> owners = new ArrayList<>();
        
        for (String owner : registry.values()) {
            if (!(owners.contains(owner))) {
                owners.add(owner);
            }
        }
        
        for (String o : owners) {
            System.out.println(o);
        }
    }
}
