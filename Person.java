import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private ArrayList<Integer> DOB;
    private String address;

    public Person(String name, String DOB, String address) {
        this.name = name;
        setDOB(DOB);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(DOB.get(2), DOB.get(0), DOB.get(1));
        Period age = Period.between(birthDate, currentDate);
        return age.getYears();
    }

    public ArrayList<Integer> getDOB() {
        return DOB;
    }

    public void setDOB(String inputDOB) {
        ArrayList<Integer> newDOB = new ArrayList<Integer>();
        String[] dobArray = inputDOB.split("/");
        for (String dobPart : dobArray) {
            newDOB.add(Integer.parseInt(dobPart));
        }
        this.DOB = newDOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
