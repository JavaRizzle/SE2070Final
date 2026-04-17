import java.time.LocalDate;
public class WorkLogEntry {
    /* Fields */
    private LocalDate date;
    private double hours;
    private String description;

    /* Constructor for an entry that defaults to today's date */
    WorkLogEntry(double hours, String description){
        this.date = LocalDate.now();
        this.hours = hours;
        this.description = description;
    }

    /* Constructor for an entry on a specific date */
    WorkLogEntry(int year, int month, int day, double hours, String description){
        this.date = LocalDate.of(year, month, day);
        this.hours = hours;
        this.description = description;
    }
}
