import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class Beast {
    public String name;
    public ArrayList<Integer> DOB;
    public boolean furry;

    public Beast(String name, String DOB, boolean furry) {
        this.name = name;
        setDOB(DOB);
        this.furry = furry;
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
}