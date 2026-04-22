import java.time.LocalDate;
public class WorkLog {
    /* Fields */
    private LocalDate date;
    private double hours;
    private String description;

    /* Constructor for an entry that defaults to today's date */
    WorkLog(double hours, String description){
        this.date = LocalDate.now();
        this.hours = hours;
        this.description = description;
    }

    /* Constructor for an entry on a specific date */
    WorkLog(int year, int month, int day, double hours, String description){
        this.date = LocalDate.of(year, month, day);
        this.hours = hours;
        this.description = description;
    }


    public void setDate(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return this.date;
    }
    public double getHours() {
        return this.hours;
    }
    public String getDescription() {
        return this.description;
    }
}
