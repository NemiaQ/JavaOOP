package HW02;

import java.time.LocalDate;

public class Wolf extends WildAnimal{
    private String leader;
    public Wolf(int grown, int weight, String eyeColor, String habitat, LocalDate dateFound, String leader) {
        super(grown, weight, eyeColor, habitat, dateFound);
        this.leader = leader;
    }

    public String getLeader(){
        return leader;
    }
    @Override
    public String toString(){
        return super.toString() + String.format(", вожак стаи: %s", leader);
    }
    @Override
    public String getSound() {
        return "Ауууу";
    }
}
