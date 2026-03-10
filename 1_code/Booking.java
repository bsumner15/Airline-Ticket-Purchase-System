public class Booking {

    private String passengerName;
    private Flight flight;

    public Booking(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public void confirmBooking() {
        System.out.println("\nBooking Confirmed!");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Flight: " + flight.getFlightNumber());
        System.out.println("Destination: " + flight.getDestination());
    }
}