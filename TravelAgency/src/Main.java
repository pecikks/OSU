import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TravelAgency agency = new TravelAgency("Supa Travel");

        agency.addTrip(new Trip("Starodávný Egypt", "Egypt", "15.07.2026", Travel.FLIGHT, 25000));
        agency.addTrip(new Trip("Skilaufen Österreich", "Rakousko", "10.02.2026", Travel.BUS, 12000));
        agency.addTrip(new Trip("Karibik lodí", "Karibik", "05.11.2026", Travel.SHIP, 55000));
        agency.addTrip(new Trip("Romantický víkend v Paříži", "Francie", "20.05.2026", Travel.FLIGHT, 20000));
        agency.addTrip(new Trip("Beskydy", "Česko", "01.06.2026", Travel.OTHER, 3500));

        //vsechny tripy
        agency.printAllTrips();

        //nejdrazsi trip
        System.out.println("\nNejdražší zájezd: " + agency.getMostExpensiveTrip());

        //trip podle nazvu
        System.out.println("\nHledání 'Beskydy': " + agency.getTripByName("Beskydy"));

        //trip podle dopravy (v tomto -> letecky)
        System.out.println("\nLetecké zájezdy:");
        ArrayList<Trip> flightTrips = agency.getTripsByTravel(Travel.FLIGHT);
        for (Trip t : flightTrips) {
            System.out.println(t);
        }

        //trip dle lokality (-> Egypt)
        System.out.println("\nZájezdy do Egyptu:");
        Trip[] egyptTrips = agency.getTripsByLocation("Egypt");
        for (Trip t : egyptTrips) {
            System.out.println(t);
        }

    }
}
