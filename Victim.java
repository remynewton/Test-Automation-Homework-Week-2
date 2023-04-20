import java.util.ArrayList;

public class Victim extends Person {
    public String victimOf;
    public Victim(String name, String DOB, String address, String victimOf) {
        super(name, DOB, address);
        this.victimOf = victimOf;
    }
}