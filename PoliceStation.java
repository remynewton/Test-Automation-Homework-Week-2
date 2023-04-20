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
        System.out.println("The officer has apprehended the criminal. His name is " + criminal1.getName() + ".");
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