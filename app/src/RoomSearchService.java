/**
 * Use Case 4: Room Search & Availability Check
 *
 * Description:
 * Provides search functionality for viewing available rooms.
 *
 * Reads room availability from inventory and room details
 * from Room objects.
 *
 * No inventory mutation or booking logic is performed.
 *
 * @developer PranavSRM
 * @version 4.0
 */
import java.util.Map;

public class RoomSearchService {

    /**
     * Displays available rooms with details
     */
    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("=================================");
        System.out.println("   Available Rooms");
        System.out.println("=================================\n");

        // Single Room
        if (availability.get("Single") > 0) {
            System.out.println("Single Room:");
            singleRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Single"));
            System.out.println();
        }

        // Double Room
        if (availability.get("Double") > 0) {
            System.out.println("Double Room:");
            doubleRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Double"));
            System.out.println();
        }

        // Suite Room
        if (availability.get("Suite") > 0) {
            System.out.println("Suite Room:");
            suiteRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Suite"));
        }
    }
}