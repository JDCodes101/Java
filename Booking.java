public class Booking {
    private String customerName;
    private String customerEmail;
    private Room room;


    // Constructor
    public Booking (String customerName, String customerEmail, Room room) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.room = room;
        room.setAvailable(false); // Sets room as booked when creating a booking
    }
    // Getter method
    public Room getRoom() {
        return room;
    }

    public String toString() {
        return "Booking Details:\nCustomer: " + customerName + "\nEmail: " + customerEmail + "\nRoom Number: " + room.getRoomNumber();
    }
}