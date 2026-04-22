import java.util.ArrayList;
public class ShopManager {
    /* declare arraylist fields */
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<WorkLog> log = new ArrayList<>();


    /*constructor */
    ShopManager() {
    }


    /* cars methods */
    //add a car
    public void carAdd(Car car) {
        cars.add(car);
    }
    //todo show a cars details by name
    //todo show all cars
    //todo advance car to next stage


    /* log methods */
    //todo add a log
    //todo print all logs on month/day/year
    //todo print all logs
    //todo delete a log by index
    //todo clear all logs
    //todo return total hours worked across log entries
}
