public class Victim extends Person {
    private String victimOf;

    public Victim(String name, String DOB, String address, String victimOf) {
        super(name, DOB, address);
        this.victimOf = victimOf;
    }

    public String getVictimOf() {
        return victimOf;
    }

    public void setVictimOf(String victimOf) {
        this.victimOf = victimOf;
    }

    @Override
    public String getProfile() {
        return (getName() + " is a victim of " + victimOf + ".");
    }
}