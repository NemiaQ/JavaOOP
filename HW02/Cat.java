package HW02;

import java.time.LocalDate;

public class Cat extends Pet implements Caress{
    private String wool;

    public Cat(int growth, int weight, String eyeColor, String name, String breed, String vaccination, String coatColor, LocalDate dateBirth, String wool) {
        super(growth, weight, eyeColor, name, breed, vaccination, coatColor, dateBirth);
        this.wool = wool;
    }

    public String getWool(){
        return wool;
    }

    @Override
    public String getSound() {
        return "Мяяу!";
    }

    @Override
    public String toString(){
       return super.toString() + String.format("наличие шерсти: %s", wool);
    }

    @Override
    public String caress(){
        return "муууррррр ❤️";
    }

}
