package org.example.basics.oop.encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Delivery {
    private String deliveryId;
    private boolean assigned;
    private Truck assignedTruck;

    public Delivery(String deliveryId) {
        this.deliveryId = deliveryId;
        this.assigned = false;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public void assignToTruck(Truck truck) {
        if (this.assigned) {
            throw new IllegalStateException("Delivery is already assigned to a truck.");
        }
        this.assigned = true;
        this.assignedTruck = truck;
    }

    public boolean isAlreadyAssigned() {
        return this.assigned;
    }

    public Truck getAssignedTruck() {
        return this.assignedTruck;
    }
}

class Truck {
    private String licensePlate;
    private List<Delivery> deliveries;

    public Truck(String licensePlate) {
        this.licensePlate = licensePlate;
        this.deliveries = new ArrayList<>();
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void addDelivery(Delivery delivery) {
        if (delivery == null || delivery.isAlreadyAssigned()) {
            throw new IllegalArgumentException("Invalid delivery");
        }
        delivery.assignToTruck(this);
        deliveries.add(delivery);
    }

    public List<Delivery> getDeliveries() {
        return Collections.unmodifiableList(deliveries); // read-only view
    }
}

public class TruckDemo {

    public static void run() {
        Truck truck = new Truck("ABC-123");
        Delivery delivery1 = new Delivery("DEL-001");
        Delivery delivery2 = new Delivery("DEL-002");

        truck.addDelivery(delivery1);
        truck.addDelivery(delivery2);

        System.out.println("Deliveries assigned to truck " + truck.getLicensePlate() + ":");
        for (Delivery d : truck.getDeliveries()) {
            System.out.println("- " + d.getDeliveryId());
        }
    }
}
