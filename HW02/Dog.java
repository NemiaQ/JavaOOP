package HW02;

import java.time.LocalDate;

public class Dog extends Pet implements Caress, Training{
    private String training;
    public Dog(int growth, int weight, String eyeColor, String name, String breed, String vaccination, String coatColor, LocalDate dateBirth, String training) {
        super(growth, weight, eyeColor, name, breed, vaccination, coatColor, dateBirth);
        this.training = training;
    }

    public String getTraining() {
        return training;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("наличие дрессировки: %s", training);
    }

    @Override
    public String getSound() {
        return "Гав!";
    }

    @Override
    public String caress(){
        return "*облизала хозяина";
    }

    @Override
    public String training() {
        return "Сижу, лежу, даю лапу";
    }
}
