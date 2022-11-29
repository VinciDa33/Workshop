import java.util.UUID;

public class Actuator extends Unit{
    private double value;

    public Actuator(String name, UUID id) {
        super(name, id);
    }

    public void setValue() {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
