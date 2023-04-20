import java.util.ArrayList;

public class Officer extends Person {
    private int badgeNumber;
    private String department;

    public Officer(String name, String DOB, String address, int badgeNumber, String department) {
        super(name, DOB, address);
        this.badgeNumber = badgeNumber;
        this.department = department;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}