/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }
    
    public String history() {
        return this.changeHistory.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return amountTaken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n" +
                           "History: " + this.changeHistory + "\n" +
                           "Largest amount of product: " + this.changeHistory.maxValue() + "\n" +
                           "Smallest amount of product: " + this.changeHistory.minValue() + "\n" +
                           "Average: " + this.changeHistory.average());
    }
}
