import java.util.regex.MatchResult;

/* Cafe Building for selling and buying cofeee */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    /** 
     * Sells one cups of coffeeand reduces coffee ounces, sugar packets, and creams accordingly
     * @param size size of coffee in relation to ounces
     * @param nSugarPackets number of sugar packets used
     * @param nCreams number of creams used
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -=1;

    }
    
    /** 
     * Restocks shop by adding specified amount of ingredients
     * @param nCoffeeOunces number of ounces of coffee to add
     * @param nSugarPackets number of sugar packets to add
     * @param nCreams number of creams to add
     * @param nCups number of cups to add
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    /** 
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
        new Cafe("Compass", "Nielson Drive",1,200,300,100,2);
    }
    
}