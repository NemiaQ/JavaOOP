package HW02;

import java.time.LocalDate;

public class Tiger extends WildAnimal{
    public Tiger(int grown, int weight, String eyeColor, String habitat, LocalDate dateFound) {
        super(grown, weight, eyeColor, habitat, dateFound);
    }

    @Override
    public String getSound() {
        return "Рррррр";
    }
}
