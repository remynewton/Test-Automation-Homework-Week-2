public class Crime {
    public String description;
    public boolean felony;
    public String location;
    public String timeOfOccurence;

    public Crime (String description, boolean felony, String location, String timeOfOccurence) {
        this.description = description;
        this.felony = felony;
        this.location = location;
        this.timeOfOccurence = timeOfOccurence;
    }
}