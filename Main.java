/**
  @author: Andrew Euler
*/
// java import
import java.util.Scanner;
class Main { //main class

    //scanner object that must be static for functionality
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { //main method

        //theaterseller object
        TheaterSeatSeller theater = new TheaterSeatSeller();

        //main loop
        while (!theater.allSeatsSold()) {
            theater.printSeats();
            System.out.println("[1] - Type to book seat by location");
            System.out.println("[2] - Type to book seat by price");
            System.out.println("[3] - Type to book seat by best");
            System.out.println("[4] - Type to exit");

            int choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Goodbye! :D");
                break;
            } else if (choice == 1) {
                System.out.println("Enter row: ");
                int row = scanner.nextInt();
                System.out.println("Enter col: ");
                int col = scanner.nextInt();
                theater.getByLoc(row, col);
            } else if (choice == 2) {
                System.out.print("Enter price - (10, 20, 30, 40, or 50)");
                int price = scanner.nextInt();
                theater.getByPrice(price);
            } else if (choice == 3) {
                theater.getBest();
            }
        }
    } //end main method
} //end main class