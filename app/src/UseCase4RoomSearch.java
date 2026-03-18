/**
 * ============================================================
 * MAIN CLASS - UseCase4RoomSearch
 * ============================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Description:
 * Demonstrates how users can view available rooms
 * without modifying inventory.
 *
 * Enforces read-only access.
 *
 * @developer PranavSRM
 * @version 4.0
 */
public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Room objects (UC2)
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Inventory (UC3)
        RoomInventory inventory = new RoomInventory();

        // Search Service
        RoomSearchService searchService = new RoomSearchService();

        // Perform search
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}