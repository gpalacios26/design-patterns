package structural.facade;

import structural.facade.travel.TravelFacade;

public class Main {

    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.bookCompleteTrip("Madrid", "Londres", "Londres Centro", "Londres Aeropuerto");
    }
}
