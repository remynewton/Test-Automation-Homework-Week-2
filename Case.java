public class Case {
    private String description;
    private Officer assignedOfficer;
    private Criminal suspect;
    private Victim victim;
    public boolean solved;

    public Case(String description, Officer assignedOfficer, Criminal suspect, Victim victim, boolean solved) {
        this.description = description;
        this.assignedOfficer = assignedOfficer;
        this.suspect = suspect;
        this.solved = solved;
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