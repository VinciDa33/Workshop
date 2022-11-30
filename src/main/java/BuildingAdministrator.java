import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BuildingAdministrator {
    private ArrayList<Building> building = new ArrayList<>();

    BuildingAdministrator(){

    }
    public ArrayList<Building> getBuilding(){
        return building;
    }
    public UUID addBuilding(String name){
        UUID id = UUID.randomUUID();
        Building build = new Building(name, id);
        building.add(build);
        return id;
    }
    public void removeBuilding(UUID id){
        for(int i = 0; i < building.size(); i++){
            if (building.get(i).getID() == id){
                building.remove(i);
            }
        }
    }
}
