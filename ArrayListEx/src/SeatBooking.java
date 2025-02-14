import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeatBooking {
    // List to store bookings
    private List<Seat> bookedSeatsList;
    // Constructor
    public SeatBooking() {
        // Initialize the list of booked seats
        // TODO 1 : this.bookedSeatsList = ?
        this.bookedSeatsList = new ArrayList<>();
    }
    // Method to add a new seat booking
    public void addNewBooking(String seatNumber) {
        // TODO 2: check if the seat is already booked and not canceled
        // TODO 3 create a new Seat object for the booking,
        // mark the seat as booked,
        // set the current date as the booking date
        // TODO 4: add the new seat to the bookedSeatsList
        // TODO 5: confirm the booking to the user
        for (Seat seat : bookedSeatsList) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                if (seat.isBooked() && !seat.isCanceled()) {
                    System.out.println("Seat "+ seatNumber + "is already booked and not canceled");
                    return;
                }
            }
        }

        Seat seat = new Seat(seatNumber);
        seat.setBooked(true);
        seat.setBookingDate(new Date());

        bookedSeatsList.add(seat);

        System.out.println("Seat number "+seatNumber+ " has been successfully added.");
    }
    // Method to cancel a booking
    public void cancelBooking(String seatNumber) {
        // TODO 6: iterate through the list of booked seats
        // TODO 7: check if the seat number matches and is not already canceled
        // mark the seat as canceled
        // mark the seat as not booked
        // confirm the cancellation to the user
        // TODO 8: inform the user if no booking was found for the seat number
        boolean seatFound = false;
        for (Seat seat : bookedSeatsList) {
            if (seat.getSeatNumber().equals(seatNumber) && !seat.isCanceled()){
                seat.setBooked(false);
                seat.setCanceled(true);
                System.out.println("Your seat number" + seatNumber+ " has been canceled.");
                seatFound = true;
                break;
            }
        }

        if (!seatFound) {
            System.out.println("No seating was found at number " +seatNumber);
        }

    }
    // Method to update a booking seat number
    public void updateBooking(String oldSeatNumber, String newSeatNumber) {
        // TODO 9: iterate through the list of booked seats
        // TODO 10: check if the seat number matches the old seat number and is not canceled
        // TODO 11: update the seat number to the new seat number
        // confirm the update to the user
        // TODO 12: inform the user if no booking was found for the old seat number
        boolean duplicateFound = false;
        for (Seat seat : bookedSeatsList) {
            if (seat.getSeatNumber().equals(newSeatNumber)) {
                duplicateFound = true;
                break;
            }
        }

        // If the new seat number is a duplicate, inform the user and exit
        if (duplicateFound) {
            System.out.println("Seat number " + newSeatNumber + " already exists. Update failed.");
            return;
        }

        boolean seatFound = false;
        for (Seat seat : bookedSeatsList) {
            if (seat.getSeatNumber().equals(oldSeatNumber) && !seat.isCanceled()){
                seat.setSeatNumber(newSeatNumber);
                System.out.println("Seat number "+oldSeatNumber +" has been updated to seating number "+newSeatNumber);
                seatFound = true;
                break;
            }
        }

        if (!seatFound) {
            System.out.println("Seat number "+oldSeatNumber+" has not been found.");
        }
    }
    // Method to display all bookings
    public void displayBookings() {
        // TODO 13: check if the bookedSeatsList is empty, inform the user that no bookings have been made yet
        // TODO 14: iterate through the list of booked seats, Check if the seat is booked and not canceled
        // TODO 15: display the seat number and booking date
        if (bookedSeatsList.isEmpty()){
            System.out.println("No booking have been made yet.");
        }

        for (Seat seat : bookedSeatsList) {
            if (seat.isBooked() && !seat.isCanceled()) {
                System.out.println("{ Seat number: "+seat.getSeatNumber()+", Booking date: "+seat.getBookingDate()+" }");
            }
        }
    }
}
