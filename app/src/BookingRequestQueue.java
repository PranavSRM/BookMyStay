import java.util.LinkedList;
import java.util.Queue;

/**
 * Use Case 5: Booking Request Queue (FIFO)
 *
 * Description:
 * Manages booking requests using a queue
 * to ensure fair allocation.
 *
 * Requests are processed in the order received.
 *
 * @version 5.0
 */
public class BookingRequestQueue {

    /** Queue storing booking requests */
    private Queue<Reservation> requestQueue;

    /**
     * Constructor initializes queue
     */
    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    /**
     * Add request to queue
     */
    public void addRequest(Reservation reservation) {
        requestQueue.offer(reservation);
    }

    /**
     * Get next request (FIFO)
     */
    public Reservation getNextRequest() {
        return requestQueue.poll();
    }

    /**
     * Check if queue has pending requests
     */
    public boolean hasPendingRequests() {
        return !requestQueue.isEmpty();
    }
}