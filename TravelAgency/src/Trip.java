public class Trip {
    private String name;
    private String location;
    private String date;
    private Travel travel;
    private double price;

    public Trip(String name, String location, String date, Travel travel, double price) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.travel = travel;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Travel getTravel() {
        return travel;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Zájezd: %s | Lokalita: %s | Datum: %s | Doprava: %s | Cena %.2f Kč",
        name, location, date, travel, price);
    }
    //%s (string specifier) a %.2f (floating-point specifier) čistě pro hezké vypsání
}
