package formosTest;

public class Sugar implements SmoothieSolidIngredients {

    private int weight;
    
    public Sugar(int weight) {
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
