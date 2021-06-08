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

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> currentTranslations = this.dictionary.get(word);
        currentTranslations.add(translation);
        
        // this.dictionary.put(word, currentTranslations);
    }
    
    public ArrayList<String> translate(String word) {
        if (this.dictionary.get(word) == null) {
            return new ArrayList<>();
        }
        return this.dictionary.get(word);
    }
    
    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
