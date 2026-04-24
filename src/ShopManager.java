import java.util.ArrayList;
import java.util.Scanner;
/* ArrayList and associate logic for Car and WorkLog objects*/
public class ShopManager {
    /* declare arraylist fields */
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<WorkLog> log = new ArrayList<>();


    /*
    * Java automatically makes a default no-arg construct
    * declares and initializes empty ArrayLists: cars and log
     */


    /*** CARS METHODS ***/
    /* add a car object to cars */
    public void carAdd(Car car) {
        cars.add(car);
    }
    /* print a car object's details from its nickname */
    public void carShow(String nickname) {
        for (Car car: cars) {   // loop through ArrayList cars
            if (car.getNickname().equals(nickname)) {   //when a car with the matching nickname is found
                System.out.println(car.toString());   //print its .toString()
            }
        }
    }
    // return ArrayList cars
    public ArrayList<Car> getCars() {
        return cars;
    }
    /* helper method to return car object from nickname */
    public Car carGet(String nickname) {
        for (Car car: cars) {   // loop through ArrayList cars
            if (car.getNickname().equals(nickname)) {   //when a car with the matching nickname is found
                return car;
            }
        }
        return null;
    }
    /* print every car and its values */
    public void carShow() {
        for (Car car : cars) {   // loop through cars
            System.out.println(car.toString());   // print report
        }
    }
    /* advance car's workStage from nickname */
    public void carAdvance(String nickname) {
        carGet(nickname).workStageAdvance();   // use workStageAdvance in class Car
    }


    /* LOG METHODS */
    //add a log from object
    public void logAdd(WorkLog log) {
        this.log.add(log);
    }
    //get log ArrayList
    public ArrayList<WorkLog> getLog() {
        return log;
    }
    //print all logs on date
    public void printLog(int year, int month, int day) {
        for (WorkLog entry : log) {   // loop through logs
            if ((entry.getDate().getYear() == year) && (entry.getDate().getMonthValue() == month) && (entry.getDate().getDayOfMonth() == day)){   // check for year
                System.out.println(entry.toString());
            }
            else {
                System.out.println("There is no log for that date!");
            }
        }
    }
    //print all logs
    public void printLog() {
        for (WorkLog entry : getLog()) {   // Loop through all logs
            System.out.println(entry.toString());   //   print toString() for each one
        }
    }
    //clear all logs
    public void clearLog() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Are you sure you want to clear your work log? (y/n)");
        String answer = scnr.next();
        if (answer.equals("y") || answer.equals("Y") || answer.equals("yes") || answer.equals("Yes") || answer.equals("YES")) {
            log.clear();
        }
        else {
            System.out.println("logs NOT cleared.");
        }
    }
    //delete logs by date
    public void clearLog(int year, int month, int day) {
        for (WorkLog entry : getLog()) {   // loop through logs
            if ((entry.getDate().getYear() == year) && (entry.getDate().getMonthValue() == month) && (entry.getDate().getDayOfMonth() == day)) {  // if date matches// remove from ArrayList by object
                log.remove(entry);
            }
        }
    }
    //return total hours worked across log entries
    public double logHours() {
        double sum = 0;   // set sum
        for (WorkLog entry : getLog()) {   // loop through logs
            sum += entry.getHours();   // add to sum
        }
        return sum;
    }



    /* test method
    public static void main(String[] args) {
        // car tests
        Car car1 = new Car("stang", "Ford", "Mustang: 69 Coupe", 1969, 0);
        Car car2 = new Car();
        shop1.carAdd(car1);
        shop1.carAdd(car2);
        shop1.carShow("stang");
        System.out.println(shop1.carGet("stang").toString());

        for (int i = 0; i < 5; i++) {
            shop1.carAdvance("stang");
        }

        // log tests
        WorkLog log1 = new WorkLog(0.5, "picked up, swept, and then organized the shop.");
        shop1.logAdd(log1);
        WorkLog log2 = new WorkLog(10, "Painted car");
        shop1.logAdd(log2);
        WorkLog log3 = new WorkLog(1996, 12, 14, 5, "Stared at the wall...");
        shop1.logAdd(log3);
        System.out.println(shop1.getLog().get(0));
        shop1.logPrintAll();
        shop1.printLog(1996, 12, 0);
    } */
}
