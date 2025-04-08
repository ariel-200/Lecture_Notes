package Week7;

public class Pool {

    // instance variables
    private String name; // field, or a variable
    private double length; // another field


    public Pool(String n, double l){
        this.name = n;
        this.length = l;
    }

    // instance method
    // A Pool object is an instance of the Pool class
    public double distanceForLaps(int laps) {
        // 10 laps of pool of length 50, that's 500 meters
        return laps * this.length;
    }

    @Override
    public String toString(){
        return (this.name + " pool is " + this.length + " meters long.");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0 || length > 1000){
            return;
        }
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
