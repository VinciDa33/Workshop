public class CO2Sensor extends Sensor{

    double value;
    public CO2Sensor(String name) {
        super(name);
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
