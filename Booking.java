package busReserve;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    Date date;
    int VehicleNo;

    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the passenger: ");
        passengerName = scanner.next();
        System.out.println("Enter the bus number that you want to travel: ");
        VehicleNo = scanner.nextInt();
        System.out.println("Enter date in the format of dd-MM-yyyy: ");
        String dateInput = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
        }
    }

    public boolean isAvailable(ArrayList<Booking> Bookings, ArrayList<Bus> Buses) {
        int capacity = 0;
        for (Bus b : Buses) {
            if (b.getVehicleNo() == VehicleNo) {
                capacity = b.getCapacity();
            }
        }

        int booked = 0;
        for (Booking book : Bookings) {
            if (book.VehicleNo == VehicleNo && book.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }
}
