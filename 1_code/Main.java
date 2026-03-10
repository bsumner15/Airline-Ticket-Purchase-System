public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Airline Ticket Purchase System");

        Flight flight1 = new Flight("AA101", "Indianapolis", "Miami", 250.00);

        System.out.println("Flight Found:");
        System.out.println("Flight: " + flight1.getFlightNumber());
        System.out.println("From: " + flight1.getOrigin());
        System.out.println("To: " + flight1.getDestination());
        System.out.println("Price: $" + flight1.getPrice());

        Booking booking = new Booking("Bryit", flight1);

        booking.confirmBooking();
    }
}