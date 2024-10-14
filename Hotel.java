import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;
    private List<Booking> bookings;


    // Constructor
    public Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();


        // Intialise rooms
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    // Method to book a room
    public void bookRoom(String customerName, String customerEmail) {
        for(Room room : rooms) {
            if (room.isAvailable()) {
                Booking newBooking = new Booking(customerName, customerEmail, room);
                bookings.add(newBooking)
                        System.out.println("Room: " + room.getRoomNumber() + "booked successfully for " + customerName + ".");
                return;
            }
        }
        System.out.println("Sorry, no rooms avaliable.");
    }
}