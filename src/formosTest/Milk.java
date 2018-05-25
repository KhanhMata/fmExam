package formosTest;

public class Milk implements SmoothieLiquiqIngredients {

    private int volume;
    
    public Milk(int volume) {
        this.setVolume(volume);
    }
    @Override
    public int getVolume() {
        // TODO Auto-generated method stub
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
