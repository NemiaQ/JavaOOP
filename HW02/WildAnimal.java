package HW02;

import java.time.LocalDate;

public abstract class WildAnimal extends Animal{
    protected String habitat;
    protected LocalDate dateFound;
    public WildAnimal(int grown, int weight, String eyeColor, String habitat, LocalDate dateFound){
        super(grown, weight, eyeColor);
        this.habitat = habitat;
        this.dateFound = dateFound;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("место обитания: %s, дата нахождения: %s", habitat, dateFound);
    }

}
