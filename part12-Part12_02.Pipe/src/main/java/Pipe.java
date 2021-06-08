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

public class Pipe<T> {
    
    private List<T> pipeList;
    
    public Pipe() {
        this.pipeList = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipeList.add(value);
    }
    
    public T takeFromPipe() {
        if (this.pipeList.isEmpty()) {
            return null;
        }
        T taken = this.pipeList.get(0);
        this.pipeList.remove(0);
        return taken;
    }
    
    public boolean isInPipe() {
        if (this.pipeList.isEmpty()) {
            return false;
        }
        return true;
    }
}
