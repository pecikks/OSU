public class Car {
    private String model;
    private String manufacturer;
    private int kilometers;
    private Consuption consuption;
    private int price;
    private Fuel fuel;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getKilometers() {
        return kilometers;
    }

    public Consuption getConsuption() {
        return consuption;
    }

    public int getPrice() {
        return price;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public Car(String model, String manufacturer, int kilometers, Consuption consuption, int price, Fuel fuel) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.kilometers = kilometers;
        this.consuption = consuption;
        this.price = price;
        this.fuel = fuel;
    }
}
