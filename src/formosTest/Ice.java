package formosTest;

public class Ice implements SmoothieLiquiqIngredients {

    private int volume;
    
    public Ice(int volume) {
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
