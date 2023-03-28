package HW02;

public class Stork extends Bird{
    public Stork(int growth, int weight, String eyeColor, int flightAltitude) {
        super(growth, weight, eyeColor, flightAltitude);
    }

    @Override
    public String getSound() {
        return "Иии!";
    }

    @Override
    public String fly() {
        return "Лечуу";
    }
}
