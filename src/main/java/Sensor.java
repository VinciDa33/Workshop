import java.util.UUID;

public class Sensor extends Unit{
    private double value;
    Sensor(String name, UUID id){
        super(name, id);
    }

    public double getValue(){
        return value;
    }
}
