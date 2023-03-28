package HW02;

public class Chicken extends Bird{
    public Chicken(int growth, int weight, String eyeColor, int flightAltitude) {
        super(growth, weight, eyeColor, flightAltitude);
    }


    @Override
    public String getSound() {
        return "Ко-ко-ко";
    }

    @Override
    public String fly() {
        return "когда-гибудь я полечу...";
    }
}
