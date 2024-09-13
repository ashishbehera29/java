class Ride {
    private String source;
    private String destination;
    private double fare;

    public Ride(String source, String destination, double fare) {
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }

    public String toString() {
        return "Ride from " + source + " to " + destination + ", Fare: ₹" + fare;
    }
}

class Ola {
    private String userName;
    private Ride ride;

    public Ola(String userName) {
        this.userName = userName;
        this.ride = null;
    }

    public void bookRide(String source, String destination, double fare) {
        if (ride == null) {
            ride = new Ride(source, destination, fare);
            System.out.println("Ride booked successfully!");
        } else {
            System.out.println("You already have an active ride.");
        }
    }
    public void viewRide() {
        if (ride != null) {
            System.out.println("Ride Details for " + userName + ":");
            System.out.println(ride);
        } else {
            System.out.println("No active rides.");
        }
    }
    public void cancelRide() {
        if (ride != null) {
            System.out.println("Ride from " + ride.getSource() + " to " + ride.getDestination() + " canceled.");
            ride = null;
        } else {
            System.out.println("No ride to cancel.");
        }
    }

    public static void main(String[] args) {
        Ola userOla = new Ola("Jane Doe");
        userOla.bookRide("Bangalore", "Mysore", 1500.00);
        userOla.viewRide();
        userOla.cancelRide();
        userOla.viewRide();
    }
}

