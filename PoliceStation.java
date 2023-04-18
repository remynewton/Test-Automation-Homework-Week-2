import java.util.ArrayList;

class PoliceStation {
    public static void main(String[] args) {
        Officer officer1 = new Officer("John Doe", 42, "123 Main St", 12345, "Patrol");
        Criminal criminal1 = new Criminal("Andrei Trukhanovich", 30, "456 Elm St", 9876);
        Victim victim1 = new Victim("Remy Newton", 25, "789 Oak Ave");
        Case case1 = new Case("repeated Java instruction", officer1, criminal1, victim1);
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

class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Beast {
    public String name;
    public int age;
    public boolean isFurry;

    public Beast(String name, int age, boolean isFurry) {
        this.name = name;
        this.age = age;
        this.isFurry = true;
    }
}

class policeDog extends Beast {
    public String breed;
    
    public policeDog(String name, int age, boolean isFurry, String breed) {
        super(name, age, isFurry);
        this.breed = breed;
    }
}

class Officer extends Person {
    private int badgeNumber;
    private String department;

    public Officer(String name, int age, String address, int badgeNumber, String department) {
        super(name, age, address);
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

class Victim extends Person {
    public Victim(String name, int age, String address) {
        super(name, age, address);
    }
}

class Crime {
    public String description;
    public boolean isFelony;
    public String location;
    public String timeOfOccurence;

    public Crime (String description, boolean isFelony, String location, String timeOfOccurence) {
        this.description = description;
        this.isFelony = false;
        this.location = location;
        this.timeOfOccurence = timeOfOccurence;
    }
}

class Criminal extends Person {
    private int crime;

    public Criminal(String name, int age, String address, int crime) {
        super(name, age, address);
        this.crime = crime;
    }

    public int getCrime() {
        return crime;
    }

    public void setCrime(int crime) {
        this.crime = crime;
    }
}

class Case {
    private String description;
    private Officer assignedOfficer;
    private Criminal suspect;
    private Victim victim;
    public boolean isSolved;

    public Case(String description, Officer assignedOfficer, Criminal suspect, Victim victim) {
        this.description = description;
        this.assignedOfficer = assignedOfficer;
        this.suspect = suspect;
        this.isSolved = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Officer getAssignedOfficer() {
        return assignedOfficer;
    }

    public void setAssignedOfficer(Officer assignedOfficer) {
        this.assignedOfficer = assignedOfficer;
    }

    public Criminal getSuspect() {
        return suspect;
    }

    public void setSuspect(Criminal suspect) {
        this.suspect = suspect;
    }

    public Victim getVictim() {
        return victim;
    }

    public void setVictim(Victim victim) {
        this.victim = victim;
    }
}

class Jail {
    private ArrayList<Criminal> inmates;
    private int capacity;

    public Jail(int capacity) {
        this.inmates = new ArrayList<>();
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