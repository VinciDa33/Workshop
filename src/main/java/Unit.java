import java.util.UUID;

public class Unit {
    private String name;
    private UUID id;

    Unit(String name, UUID id){
        this.name = name;
        this.id = id;
    }
    public UUID getID(){
        return id;
    }
    public String getName(){
        return name;
    }
}
