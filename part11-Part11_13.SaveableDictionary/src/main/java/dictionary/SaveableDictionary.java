/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author ankushthobhani
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;


public class SaveableDictionary {
    
    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this(); // calls above constructor
        this.file = file;
    }
    
    public void add(String words, String translation) {
        
        if (!this.dictionary.keySet().contains(words)) {
            this.dictionary.put(words, translation);
        }
         
    }
    
    public String translate(String word) {
        
        if (this.dictionary.values().contains(word)) {
            for (String s : this.dictionary.keySet()) {
                if (this.dictionary.get(s).equals(word)) {
                    return s;
                }
            }
        }
        
        return (this.dictionary.getOrDefault(word, null)); // 2-way translations
        
    }
    
    public void delete(String word) {
        this.dictionary.remove(word);
        this.dictionary.values().remove(word);
    }
    
    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> add(parts[0], parts[1]));
            return true;
        } catch (IOException e) { // IOException as prompted with option+enter
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String s : this.dictionary.keySet()) {
                writer.println(s + ":" + this.dictionary.get(s));
            }
            writer.close();
        } catch (FileNotFoundException e) { // FileNotFoundException as prompted as above
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }
}
