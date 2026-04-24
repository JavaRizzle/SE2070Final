import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // create ShopManager object and prepare for input
        ShopManager shop = new ShopManager();
        Scanner scnr = new Scanner(System.in);

        // build menu String
        StringBuilder menu = new StringBuilder();
        menu.append("\n=== SHOP MANAGER ===\n");
        menu.append("\n- Cars -\n");
        menu.append("1. Add a car\n");
        menu.append("2. Delete a car\n");
        menu.append("3. Advance car work stage\n");
        menu.append("4. View all car reports\n");
        menu.append("5. View car report by name\n");
        menu.append("\n- Work Log -\n");
        menu.append("6. Add a log\n");
        menu.append("7. Delete a log\n");
        menu.append("8. Clear all logs\n");
        menu.append("9. View a log\n");
        menu.append("10. View all logs\n");
        menu.append("11. View total hours worked\n");
        menu.append("\nEnter a number 1-11 or 0 to end:");


        // menu loop
        int input;
        boolean keepGoing = true;   // false = end
        while (keepGoing == true) {
            System.out.println(menu);   // give menu
            input = scnr.nextInt();     // get input
            // decision logic
            /* add a car */
            if (input == 1) {
                shop.carAdd(buildCar());
            }
            /* delete a car from nickname*/
            else if (input == 2) {
                System.out.print("Enter the nickname of the car you'd like to delete (String): ");
                String nickname = scnr.nextLine();
                scnr.nextLine();
                shop.getCars().remove(shop.carGet(nickname));
                System.out.println(nickname + " removed!\n");
            }
            /* advance car work stage from nickname */
            else if (input == 3) {
                System.out.print("Enter the nickname of the car you'd like to advance the work stage of (String): ");
                String nickname = scnr.nextLine();
                scnr.nextLine();
                shop.carAdvance(nickname);
                System.out.println(nickname + " advanced to stage " + shop.carGet(nickname).getNickname());
            }
            /* view all car reports */
            else if (input == 4) {
                System.out.println("=== All Cars ===");
                for (Car car : shop.getCars()) {   // loop through cars ArrayList
                    System.out.println(car.toString());   // print .toString() for each
                }
            }
            /* view car report from nickname */
            else if (input == 5) {
                System.out.print("Enter the nickname of the car you'd like to view a report of (String): ");
                String nickname = scnr.nextLine();
                // get car, print .toString()
                Car tempcar = shop.carGet(nickname);
                System.out.println(tempcar.toString());
            }

            // *** LOGS ***
            // add a log
            else if (input == 6) {
                // add return object of buildCar() helper to ArrayList cars
                shop.getCars().add(buildCar());
            }
            // delete all logs on input date
            // use .clearLog(year, month, day) from shopManager
            else if (input == 7) {
                System.out.println("What year is the log for? (int): ");
                int year = scnr.nextInt();
                System.out.println("What month? (1-12): ");
                int month = scnr.nextInt();
                System.out.println("What day? (int): ");
                int day = scnr.nextInt();
                shop.clearLog(year, month, day);
            }
            // clear all logs
            else if (input == 8) {
                shop.clearLog();
            }
            // view all logs on a date
            // get input (year, month, day) -> shop.printLog(input)
            else if (input == 9) {
                System.out.println("What year are the log(s) in? (int): ");
                int year = scnr.nextInt();
                System.out.println("What month? (1-12): ");
                int month = scnr.nextInt();
                System.out.println("What day? (int): ");
                int day = scnr.nextInt();
                shop.printLog(year, month, day);
            }
            // view all logs
            else if (input == 10) {
                System.out.println("=== All Logs ===");
                shop.printLog();
            }
            // view total hours worked
            // print(shop -> loghours)
            else if (input == 11) {
                System.out.println(shop.logHours());
            }

            // exit loop
            else if (input == 0) {
                keepGoing = false;
                System.out.println("Exiting Program...\n");
            }
        }
    }

    // build-a-car helper
    public static Car buildCar() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Building a car...");
        System.out.print("Enter a nickname for your car: ");
        String nickname = scnr.nextLine();
        System.out.print("Enter the make: ");
        String make = scnr.nextLine();
        System.out.print("Enter the model: ");
        String model = scnr.nextLine();
        System.out.print("Enter the year: ");
        int year = scnr.nextInt();
        System.out.print("Enter a number between 0 and 4 inclusive for the work stage: ");
        int workStage = scnr.nextInt();
        System.out.println(nickname + " created!");
        return (new Car(nickname, make, model, year, workStage));
    }

    // build-a-log helper
    public static WorkLog buildEntry() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Make an entry in your work log...");
        // today or specific date?
        System.out.print("Is the entry for today? (1 = yes, 2 = no): ");
        int isToday = scnr.nextInt();
        if (isToday == 1) {   // today: hours, description
            System.out.print("How many hours did you work? (double): ");
            double hours = scnr.nextDouble();
            scnr.nextLine();
            System.out.print("What did you do? (String): ");
            String description = scnr.nextLine();
            return new WorkLog(hours, description);
        }
        else if (isToday == 2) {   // specific date: year, month, day, hours, description
            System.out.print("What year was it? (int): ");
            int year = scnr.nextInt();
            System.out.print("What month was it? (1-12): ");
            int month = scnr.nextInt();
            System.out.print("What day was it? (int): ");
            int day = scnr.nextInt();
            System.out.print("How many hours did you work? (double): ");
            double hours = scnr.nextDouble();
            scnr.nextLine();
            System.out.print("What did you do? (String): ");
            String description = scnr.nextLine();
            return new WorkLog(year, month, day, hours, description);
        }
        return null;
    }
}
