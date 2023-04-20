# Test-Automation-Homework-Week-2

For the first part of week 2 homework, this was the prompt:

(Practice) Create a class hierarchy. Topic for your hierarchy will be provided by your mentors. please request it in your chat with a mentor.
Requirements:
 - At least 10 classes
 - All classes must contain properties (minimum 1)
 - At least 5 private properties (in total, in any classes)
 - All private variables must have getters and setters.
 - All classes should have at least one custom constructor
 - Create separate class with main() which will instantiate objects of implemented classes.
 
 The topic I was assigned by my mentor was "police station".
 
 Each class has it's own file. The following is my code for PoliceStation.java, which contains the main function:

```
import java.util.ArrayList;
import java.util.StringJoiner;

class PoliceStation {
    public static void main(String[] args) {
        Officer officer1 = new Officer("John Doe", "06/12/1981", "123 Main St", 12345, "Patrol");
        Criminal criminal1 = new Criminal("Andrei Trukhanovich", "07/17/1991", "456 Elm St", "9876");
        Victim victim1 = new Victim("Remy Newton", "05/22/1997", "789 Oak Ave", "9876");
        Case case1 = new Case("repeated Java instruction", officer1, criminal1, victim1, false);
        Jail jail1 = new Jail(50);

        System.out.println("Officer " + officer1.getName() + " from " + officer1.getDepartment() + " department is investigating a case of " + case1.getDescription() + ".");
        System.out.println("The victim of the crime is " + victim1.getName() + ".");
        System.out.println("The officer has apprehended the criminal. His name is " + criminal1.getName() + " and his age is " + criminal1.getAge() + ".");
        jail1.addInmate(criminal1);
        String verb;
        if (jail1.getInmates().size() > 1) {
            verb = "are";

        } else {
            verb = "is";
        }
        System.out.println("There " + verb + " now " + jail1.getInmates().size() + " inmate(s) in the jail.");
    }
}
```
After my mentor suggested, I decided to use DOB instead of Age and implemented some pretty nice functionality for it, so that someone can enter a date of birth as a string when creating an object and then later call the getAge method to get the age calculated and returned. Here's my code for Person.java, as an example:

```
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
```
