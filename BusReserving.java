package busReserve;
import java.util.Scanner;
import java.util.ArrayList;

public class BusReserving {
    public static void main(String args[]) {

        ArrayList<Bus> Buses = new ArrayList<Bus>();
        ArrayList<Booking> Bookings = new ArrayList<Booking>();

        Buses.add(new Bus(2, 10, false));
        Buses.add(new Bus(50, 12, true));
        Buses.add(new Bus(28, 13, true));

        int userBook = 1;
        Scanner userInput = new Scanner(System.in);

        for (Bus b : Buses) {
            b.displayBusInfo();
        }

        while (userBook == 1) {
            System.out.println("Do you want to reserve a seat? Enter 1 for Yes, 0 for No:");

            userBook = userInput.nextInt();
            if (userBook == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(Bookings, Buses)) {
                    Bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Sorry, the bus you are looking for is full. Try another bus or date.");
                }
            }
        }

        userInput.close();
    }
}
