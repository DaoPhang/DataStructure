package DS.Lab7;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q6 {

    /** Simple enum that keeps both the label and its precedence. */
    private enum VehicleType {
        TRUCK("Truck", 2),
        CAR("Car", 1),
        MOTORCYCLE("Motorcycle", 0);

        final String label;
        final int priority;

        VehicleType(String label, int priority) {
            this.label = label;
            this.priority = priority;
        }
    }

    /**
     * Vehicle instances carry their type, an identifier, and the order they
     * arrived so we can keep FIFO behavior within the same priority level.
     */
    private static class Vehicle {
        final VehicleType type;
        final int id;
        final long arrivalOrder;

        Vehicle(VehicleType type, int id, long arrivalOrder) {
            this.type = type;
            this.id = id;
            this.arrivalOrder = arrivalOrder;
        }

        int priority() {
            return type.priority;
        }
    }

    /**
     * Priority-based queue: highest priority first, but stable within the
     * same priority bucket.
     */
    private static class VehicleQueue {
        private long sequence = 0;
        private final PriorityQueue<Vehicle> queue = new PriorityQueue<>(
                Comparator.<Vehicle>comparingInt(Vehicle::priority).reversed()
                        .thenComparingLong(v -> v.arrivalOrder));

        void enqueue(VehicleType type, int id) {
            queue.add(new Vehicle(type, id, sequence++));
        }

        Vehicle dequeue() {
            return queue.poll();
        }

        boolean isEmpty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {
        VehicleQueue vehicleQueue = new VehicleQueue();

        // Sample arrivals from multiple roads
        VehicleType[] arrivals = {
                VehicleType.CAR, VehicleType.TRUCK, VehicleType.MOTORCYCLE, VehicleType.MOTORCYCLE,
                VehicleType.TRUCK, VehicleType.CAR, VehicleType.TRUCK, VehicleType.TRUCK,
                VehicleType.MOTORCYCLE, VehicleType.CAR
        };

        System.out.println("Arrival order (unsorted):");
        for (int i = 0; i < arrivals.length; i++) {
            int id = i + 1;
            VehicleType type = arrivals[i];
            vehicleQueue.enqueue(type, id);
            System.out.printf("%-10s %2d  (Priority=%d)%n", type.label, id, type.priority);
        }

        System.out.println("\nOrder to pass (by priority):");
        while (!vehicleQueue.isEmpty()) {
            Vehicle v = vehicleQueue.dequeue();
            System.out.printf("%-10s %2d  (Priority=%d)%n", v.type.label, v.id, v.priority());
        }
    }
}
