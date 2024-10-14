public class Room {
    private int roomNumber;
    private boolean isAvaliable;



    // Constructor
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvaliable = true; // Room is avaliable by default
    }

    // Getter & Setter methods
    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }

    public String toString() {
        return "Room: " + roomNumber + "is " + (isAvaliable ? "available" : "booked");
    }
}