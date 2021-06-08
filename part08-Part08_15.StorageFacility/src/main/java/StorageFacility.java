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

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> unit;
    
    public StorageFacility() {
        this.unit = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.unit.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> contents = this.unit.get(unit);
        contents.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.unit.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        return this.unit.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        ArrayList<String> items = this.unit.get(storageUnit);
        if (items.contains(item)) {
            items.remove(item);
        }
        if (items.isEmpty()) {
            this.unit.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.unit.keySet()) {
            if (this.unit.get(unit) == null) {
                continue;
            }
            units.add(unit);
        }
        return units;
    }
}
