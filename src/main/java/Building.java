import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Building extends Unit{

    private List<Sensor> sensor = new ArrayList<>();
    private List<Actuator> actuator = new ArrayList<>();


    Building(String name, UUID id){
        super(name, id);
    }

    public List<Sensor> getSensors(){
        return sensor;
    }

    public List<Actuator> getActuator(){
        return actuator;
    }

    public UUID addTempSensor(String name){
        UUID id = UUID.randomUUID();
        TemperatureSensor ts = new TemperatureSensor(name, id);
        sensor.add(ts);
        return id;
    }
    public UUID addCO2Sensor(String name){
        UUID id = UUID.randomUUID();
        CO2Sensor co2Sensor = new CO2Sensor(name, id);
        sensor.add(co2Sensor);
        return id;
    }
    public void removeSensor(UUID id){
        for(int i = 0;i < sensor.size(); i++){
            if (sensor.get(i).getID() == id){
                sensor.remove(i);
            }
        }
    }
    public UUID addVentilator(String name){
        UUID id = UUID.randomUUID();
        VentilationActuator va = new VentilationActuator(name, id);
        actuator.add(va);
        return id;
    }
    public void removeActuator(UUID id){
        for(int i = 0; i < actuator.size(); i++){
            if (actuator.get(i).getID() == id){
                actuator.remove(i);
            }
        }
    }
}
