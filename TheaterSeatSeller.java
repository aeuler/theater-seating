//theater seller class
public class TheaterSeatSeller {

    //2D Array
    int[][] seats = {

        {
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10
        },
        {
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10
        },
        {
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10
        },
        {
            10,
            10,
            20,
            20,
            20,
            20,
            20,
            20,
            10,
            10
        },
        {
            10,
            10,
            20,
            20,
            20,
            20,
            20,
            20,
            10,
            10
        },
        {
            10,
            10,
            20,
            20,
            20,
            20,
            20,
            20,
            10,
            10
        },
        {
            20,
            20,
            30,
            30,
            40,
            40,
            30,
            30,
            20,
            20
        },
        {
            20,
            30,
            30,
            40,
            50,
            50,
            40,
            30,
            30,
            20
        },
        {
            30,
            40,
            50,
            50,
            50,
            50,
            50,
            50,
            40,
            30
        },

    };

    //default constructor
    public TheaterSeatSeller() {}

    //method to access array
    public void printSeats() {
        for (int row = 0; row <= 8; row++) {
            for (int col = 0; col <= 9; col++) {
                System.out.printf("%4d", seats[row][col]);
            }
            System.out.println();
        }
    }

    //method to get seat by location
    public boolean getByLoc(int row, int col) {
        if (1 <= row && row <= 10 && 1 <= col && col <= 11) {
            if (seats[row - 1][col - 1] != 0) {
                System.out.println("Seat Price: $" + seats[row - 1][col - 1]);

                System.out.println("Seat Booked succesfully!");
                seats[row - 1][col - 1] = 0;
                return true;

            }
        }
        System.out.println("Seat already sold out");
        return false;
    }

    //method to get seat by price
    public boolean getByPrice(int price) {
        for (int row = 8; row >= 0; row--) {
            for (int col = 9; col >= 0; col--) {
                if (seats[row][col] == price && seats[row][col] != 0) {
                    System.out.println("Seat available at row: " + (row + 1) +
                        " col: " + (col + 1));
                    System.out.println("Seat Booked succesfully!");
                    seats[row][col] = 0;
                    return true;
                }
            }
        }
        System.out.println("Seat Booked unsucesfully");
        return false;
    }

    //method to check if a seat(s) is/are sold
    public boolean allSeatsSold() {
        int total = 0;

        for (int row = 0; row <= 8; row++) {
            for (int col = 0; col <= 9; col++) {
                total += seats[row][col];
            }
        }
        return total == 0; //seat becomes 0 if booked
    }

    //method to get seat by best row
    public boolean getBest() {
        for (int row = 8; row >= 0; row--) {
            for (int col = 9; row >= 0; col--) {
                if (seats[row][col] != 0) {
                    System.out.println("Seat available at row: " + (row + 1) +
                        " col: " + (col + 1));
                    System.out.println("Seat Booked succesfully!");
                    seats[row][col] = 0;
                    return true;
                }
            }
        }
        System.out.println("Seat Booked unsucesfully");
        return false;
    }

} //end class