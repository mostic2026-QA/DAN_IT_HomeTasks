package java_hw_5_3;

public class Warehouse {
    private int weight;
    public Warehouse(int weight){
        this.weight = weight;}
    public void acceptMetal(int inputWeight) {
        if (inputWeight < 5) {
            System.out.println("We don't take metal less than 5 kilo");
        }
        else if (inputWeight > this.weight) {
            System.out.println("Not enough space! Available: " + this.weight);
        }
        else {
            this.weight = this.weight - inputWeight;
            System.out.println("Success! Left in warehouse: " + this.weight);
        }
    }
    public int getWeight() {
        return weight;
    }
}