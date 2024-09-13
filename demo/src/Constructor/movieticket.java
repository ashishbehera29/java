package Constructor;
class MovieTicket {
    private String movieName;
    private String theaterName;
    private double price;
    private String seatNumber;

    public MovieTicket(String movieName, String theaterName, double price, String seatNumber) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.price = price;
        this.seatNumber = seatNumber;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public double getPrice() {
        return price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String toString() {
        return "Movie: " + movieName + " at " + theaterName + ", Seat: " + seatNumber + ", Price: ₹" + price;
    }
}

class BookMyShow {
    private String userName;
    private MovieTicket bookedTicket;

    public BookMyShow(String userName) {
        this.userName = userName;
        this.bookedTicket = null;
    }

    public void bookTicket(String movieName, String theaterName, double price, String seatNumber) {
        if (bookedTicket == null) {
            bookedTicket = new MovieTicket(movieName, theaterName, price, seatNumber);
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("You already have an active booking.");
        }
    }

    public void viewTicket() {
        if (bookedTicket != null) {
            System.out.println("Ticket Details for " + userName + ":");
            System.out.println(bookedTicket);
        } else {
            System.out.println("No active bookings.");
        }
    }

    public void cancelTicket() {
        if (bookedTicket != null) {
            System.out.println("Ticket for " + bookedTicket.getMovieName() + " canceled.");
            bookedTicket = null;
        } else {
            System.out.println("No booking to cancel.");
        }
    }

    public static void main(String[] args) {
        BookMyShow userBookMyShow = new BookMyShow("Rohan");
        userBookMyShow.bookTicket("Oppenheimer", "PVR Cinemas", 500.00, "A12");
        userBookMyShow.viewTicket();
        userBookMyShow.cancelTicket();
        userBookMyShow.viewTicket();
    }
}

