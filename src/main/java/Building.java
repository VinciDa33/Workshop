import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Building extends Unit{

    private List<Sensor> sensor = new ArrayList<>();
    private List<Actuator> actuator = new ArrayList<>();


    Building(String name){
        super(name);
    }

    public List<Sensor> getSensors(){
        return sensor;
    }

    public List<Actuator> getActuator(){
        return actuator;
    }

    public UUID addTempSensor(String name){
        TempSensor ts = new TempSensor(name);
        sensor.add(ts);
        UUID id = UUID.fromString(name);
        return id;
    }
    public UUID addCO2Sensor(String name){
        CO2Sensor co2Sensor = new CO2Sensor(name);
        sensor.add(co2Sensor);
        UUID id = UUID.fromString(name);
        return id;
    }
    public void removeSensor(UUID id){
        if (sensor.contains(id)){
            sensor.remove(id);
        }
    }
    public void removeActuator(UUID id){
        if (actuator.contains(id))
            actuator.remove(id);
    }
}
