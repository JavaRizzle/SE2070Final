import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // create ShopManager object and prepare for input
        ShopManager shop = new ShopManager();
        Scanner scnr = new Scanner(System.in);

        // build menu String
        StringBuilder menu = new StringBuilder();
        menu.append("\n*** SHOP MANAGER ***\n");
        menu.append("Cars\n");
        menu.append("1. Add a car\n");
        menu.append("2. Delete a car\n");
        menu.append("3. Advance car work stage\n");
        menu.append("4. View all car reports\n");
        menu.append("5. View car report by name\n");
        menu.append("Work Log\n");
        menu.append("6. Add a log\n");
        menu.append("7. Delete a log\n");
        menu.append("8. Clear all logs\n");
        menu.append("9. View a log\n");
        menu.append("10. View all logs\n");
        menu.append("11. View total hours worked\n");
        menu.append("...\nEnter a number 1-11 or 0 to end:");


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

            /* todo delete a car */
            else if (input == 2) {
            }

            /* todo advance car work stage */
            else if (input == 3) {}
            /* todo view all car reports */
            else if (input == 4) {}
            /* todo view car report by name */
            else if (input == 5) {}
            /* todo add a log */
            else if (input == 6) {}
            /* todo delete a log by date */
            else if (input == 7) {}
            /* todo clear all logs */
            else if (input == 8) {}
            /* todo view a log */
            else if (input == 9) {}
            /* todo view all logs */
            else if (input == 10) {}
            /* todo view total hours worked */
            else if (input == 11) {}
            /* todo exit loop */
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
