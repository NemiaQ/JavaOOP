package HW02;

public abstract class Bird extends Animal implements Fly{
    protected int flightAltitude;

    public Bird(int growth, int weight, String eyeColor, int flightAltitude) {
        super(growth, weight, eyeColor);
        this.flightAltitude = flightAltitude;

    }
    @Override
    public String toString(){
        return super.toString() + String.format("Высота полета: %d", flightAltitude);
    }
}
