package formosTest;

public class Strawberries implements Fruit {

    private int weight;
    
    public Strawberries(int weight) {
        this.setWeight(weight);
    }
    
    @Override
    public int getWeight() {
        // TODO Auto-generated method stub
        return this.weight;
    }

    @Override
    public void setWeight(int weight) {
        // TODO Auto-generated method stub
        this.weight = weight;
    }
}
