public class Multiplier {
    private int value;
    
    public Multiplier (int initValue) {
        this.value = initValue;
    }

    public int multiply (int value) {
        this.value *= value;
        return this.value;
    }
}
