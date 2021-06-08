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

public abstract class Hideout<T> implements List<T> { // Had to be abstract to implement List
    
    // Model Solution much cleaner: https://tmc.mooc.fi/exercises/87751/solution
    
    private List<T> hideoutList;
    
    public Hideout() {
        this.hideoutList = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        if (!hideoutList.isEmpty()) {
            hideoutList.clear();
        }
        this.hideoutList.add(toHide);
    }
    
    public T takeFromHideout() {
        T taken = this.hideoutList.get(0);
        this.hideoutList.clear();
        return taken;
    }
    
    public boolean isInHideout() {
        if (this.hideoutList.isEmpty()) {
            return false;
        }
        return true;
    }
}
