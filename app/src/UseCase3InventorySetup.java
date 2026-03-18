/**
 * ============================================================
 * MAIN CLASS - UseCase3InventorySetup
 * ============================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * Demonstrates centralized inventory using HashMap.
 * Room objects provide room details.
 *
 * No booking or search logic is implemented.
 *
 * @version 3.1
 */
public class UseCase3InventorySetup {

    public static void main(String[] args) {

        // Create room objects (from UC2)
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Create centralized inventory
        RoomInventory inventory = new RoomInventory();

        System.out.println("=================================");
        System.out.println("   Centralized Room Inventory");
        System.out.println("=================================\n");

        // Single Room
        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Single"));
        System.out.println();

        // Double Room
        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Double"));
        System.out.println();

        // Suite Room
        System.out.println("Suite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Suite"));
    }
}