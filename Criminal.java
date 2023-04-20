import java.util.ArrayList;
import java.util.StringJoiner;

public class Criminal extends Person {
    private ArrayList<Integer> crimes;

    public Criminal(String name, String DOB, String address, String crimes) {
        super(name, DOB, address);
        this.crimes = new ArrayList<Integer>();
        setCrimes(crimes);
    }

    public String getCrimes() {
        StringJoiner joiner = new StringJoiner(", ");
        for (Integer crime : crimes) {
            joiner.add(crime.toString());
        }
        return joiner.toString();
    }

    public void setCrimes(String crimeIds) {
        ArrayList<Integer> crimeList = new ArrayList<>();
        String[] ids = crimeIds.split(", ");
        for (String id : ids) {
            crimeList.add(Integer.parseInt(id));
        }
        this.crimes = crimeList;
    }

    @Override
    public String toString() {
        return getProfile();
    }
    
    @Override
    public int hashCode() {
        return getProfile().hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Criminal) {
            Criminal otherCriminal = (Criminal) obj;
            return getProfile().equals(otherCriminal.getProfile());
        }
        return false;
    }
    
    @Override
    public String getProfile() {
        return "The criminal " + getName() + " has committed " + getCrimes() + ".";
    }
}