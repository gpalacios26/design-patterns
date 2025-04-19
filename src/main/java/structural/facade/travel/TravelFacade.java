package structural.facade.travel;

/**
 * Patrón Facade
 * Propósito: Proporcionar una interfaz simplificada para acceder a un sistema complejo de clases.
 */
public class TravelFacade {

    private final FlightBooking flightBooking = new FlightBooking();
    private final HotelBooking hotelBooking = new HotelBooking();
    private final CarRental carRental = new CarRental();

    public void bookCompleteTrip(String from, String to, String hotelLocation, String carLocation) {
        flightBooking.bookFlight(from, to);
        hotelBooking.bookHotel(hotelLocation);
        carRental.bookCar(carLocation);
    }
}
