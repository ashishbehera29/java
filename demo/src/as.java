class Membership {
    private String planType;
    private double price;
    private int duration; // in months

    // Constructor
    public Membership(String planType, double price, int duration) {
        this.planType = planType;
        this.price = price;
        this.duration = duration;
    }

    // Getters
    public String getPlanType() {
        return planType;
    }

    public double getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Membership: " + planType + ", Price: ₹" + price + ", Duration: " + duration + " months";
    }
}

class Gym {
    private String userName;
    private Membership activeMembership;

    // Constructor
    public Gym(String userName) {
        this.userName = userName;
        this.activeMembership = null;
    }

    // Purchase a membership
    public void purchaseMembership(String planType, double price, int duration) {
        if (activeMembership == null) {
            activeMembership = new Membership(planType, price, duration);
            System.out.println("Membership purchased successfully!");
        } else {
            System.out.println("You already have an active membership.");
        }
    }

    // View membership details
    public void viewMembership() {
        if (activeMembership != null) {
            System.out.println("Membership Details for " + userName + ":");
            System.out.println(activeMembership);
        } else {
            System.out.println("No active membership.");
        }
    }

    // Cancel membership
    public void cancelMembership() {
        if (activeMembership != null) {
            System.out.println("Membership canceled.");
            activeMembership = null;
        } else {
            System.out.println("No membership to cancel.");
        }
    }

    public static void main(String[] args) {
        // Creating a Gym instance
        Gym userGym = new Gym("Anita");

        // Purchasing a membership
        userGym.purchaseMembership("Gold Plan", 3000.00, 6);

        // Viewing the membership
        userGym.viewMembership();

        // Canceling the membership
        userGym.cancelMembership();

        // Viewing membership after cancellation
        userGym.viewMembership();
    }
}
