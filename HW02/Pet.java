package HW02;

import java.time.LocalDate;

public abstract class Pet extends Animal{
    protected String name;
    protected String breed;
    protected String vaccination;
    protected String coatColor;
    protected LocalDate dateBirth;


    public Pet(int growth, int weight, String eyeColor, String name, String breed, String vaccination, String coatColor, LocalDate dateBirth) {
        super(growth, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.coatColor = coatColor;
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("кличка: %s, порода: %s, наличие прививок: %s, цвет шерсти: %s, дата рождения: %s, ", name, breed, vaccination, coatColor, dateBirth);
    }

}