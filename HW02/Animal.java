package HW02;

public abstract class Animal{
    protected int growth;
    protected int weight;
    protected String eyeColor;

    public Animal(int growth, int weight, String eyeColor){
        this.growth = growth;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }
    @Override
    public String toString(){
        return String.format("Тип: %s, Рост: %d, вес: %d, цвет глаз: %s, ", this.getClass().getSimpleName(), growth, weight, eyeColor);
    }
    public abstract String getSound();


}
