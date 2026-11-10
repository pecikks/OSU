import java.util.ArrayList;

public class TravelAgency {
    private String name;
    private ArrayList<Trip> trips;

    public TravelAgency(String name) {
        this.name = name;
        this.trips = new ArrayList<>();
    }

    public void addTrip(Trip trip){
        trips.add(trip);
    }
    public void printAllTrips(){
        System.out.println("--- Seznam všech zájezdů Supa " + name + "---");
        for (Trip t : trips){
            System.out.println(t);
        }
    }

    public Trip getTripByName(String name){
        for (Trip t : trips) {
            if (t.getName().equalsIgnoreCase(name)){
                return t;
            }
        }
        return null;
    }

    public Trip getMostExpensiveTrip() {
        if (trips.isEmpty()) {
            return null;
        }
        Trip mostExpensive = trips.get(0);
        for (Trip t : trips) {
            if (t.getPrice() > mostExpensive.getPrice()){
                mostExpensive = t;
            }
        }
        return mostExpensive;
    }

    public ArrayList<Trip> getTripsByTravel(Travel travel) {
        ArrayList<Trip> result = new ArrayList<>();
        for (Trip t : trips){
            if (t.getTravel() == travel) {
                result.add(t);
            }
        }
        return result;
    }
    public Trip[] getTripsByLocation(String location) {
        ArrayList<Trip> temp = new ArrayList<>();
        for (Trip t : trips) {
            if (t.getLocation().equalsIgnoreCase(location)) {
                temp.add(t);
            }
        }
        return temp.toArray(new Trip[0]); //totok udela z Arrayylistu classic pole
    }
}
