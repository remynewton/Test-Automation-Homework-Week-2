import java.util.ArrayList;

public class Jail {
    private ArrayList<Criminal> inmates = new ArrayList<>();
    private int capacity;

    public Jail(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Criminal> getInmates() {
        return inmates;
    }

    public void setInmates(ArrayList<Criminal> inmates) {
        this.inmates = inmates;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean addInmate(Criminal criminal) {
        if (inmates.size() < capacity) {
            inmates.add(criminal);
            return true;
        }
        return false;
    }

    public boolean removeInmate(Criminal criminal) {
        return inmates.remove(criminal);
    }
}