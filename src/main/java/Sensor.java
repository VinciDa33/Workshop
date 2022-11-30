import java.util.UUID;

public class Sensor extends Unit{
    Sensor(String name, UUID id){
        super(name, id);
    }

    double value;
    public double getValue(){
        return value;
    }
}
