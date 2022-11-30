import java.util.UUID;

public class CO2Sensor extends Sensor{

    public CO2Sensor(String name, UUID id) {
        super(name, id);
    }

    @Override
    public double getValue() {
        return super.value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
