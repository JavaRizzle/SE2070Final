import java.util.ArrayList;
/* ArrayList and associate logic for Car and WorkLog objects*/
public class ShopManager {
    /* declare arraylist fields */
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<WorkLog> log = new ArrayList<>();


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


    /* log methods */
    //todo add a log
    //todo print all logs on month/day/year
    //todo print all logs
    //todo delete a log by index
    //todo clear all logs
    //todo return total hours worked across log entries


    /* test method */
    public static void main(String[] args) {
        ShopManager shop1 = new ShopManager();

        /* car tests
        Car car1 = new Car("stang", "Ford", "Mustang: 69 Coupe", 1969, 0);
        Car car2 = new Car();
        shop1.carAdd(car1);
        shop1.carAdd(car2);
        shop1.carShow("stang");
        System.out.println(shop1.carGet("stang").toString());

        for (int i = 0; i < 5; i++) {
            shop1.carAdvance("stang");
        }
         */





    }
}
