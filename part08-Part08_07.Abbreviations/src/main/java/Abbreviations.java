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

public class Abbreviations {
    private HashMap<String, String> directory;
    
    public Abbreviations() {
        this.directory = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizedString(abbreviation);
        
        if (this.directory.containsKey(abbreviation)) {
            System.out.println("Abbreviation already exists!");
        } else {
            this.directory.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        
        if (this.directory.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        
        if (this.directory.containsKey(abbreviation)) {
            return this.directory.get(abbreviation);
        } else {
            return null;
        }
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        
        string = string.toLowerCase().trim();
        return string;
    }
}
