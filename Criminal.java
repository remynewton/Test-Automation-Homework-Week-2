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
}