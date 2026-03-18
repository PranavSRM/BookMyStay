/**
 * Use Case 5: Booking Request (FIFO)
 *
 * Description:
 * Represents a booking request made by a guest.
 *
 * At this stage, a reservation only captures intent,
 * not confirmation or room allocation.
 *
 * @version 5.0
 */
public class Reservation {

    /** Name of the guest */
    private String guestName;

    /** Requested room type */
    private String roomType;

    /**
     * Constructor
     */
    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}