public class SeatSelection {

    private String seatNumber;

    public SeatSelection(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void displaySeat() {
        System.out.println("Seat Selected: " + seatNumber);
    }
}