public class CarDealer {
    private Car[] cars;
    private int count; //pomocná proměnná pro momentální počet aut

    public CarDealer(int capacity) {
        this.cars = new Car[capacity];
        this.count = 0;
    }
    public void addCar(Car car){
        if (count < cars.length){
            cars[count] = car;
            count++;
        } else {
            System.out.println("Autobazar je full!");
        }
    }
    public int getCarCount(){
        return count;
    }

    public Car getCarByModel(String model){
        for (int i = 0; i < count; i++){
            if (cars[i].getModel().equals(model)){
                return cars[i];
            }
        }
        return null; //pokud nenajde auto
    }
    public Car[] getCarsByManufacturer(String manufacturer){
        Car[] temporaryInfo = new Car[count]; //temporaryInfo -> pomocné pole no.1
        int matchCount = 0;

        for (int i = 0; i < count; i++){
            if (cars[i].getManufacturer().equalsIgnoreCase(manufacturer)){ // .equalsIgnoreCase -> dá ignor velkým/malým písmenům
                temporaryInfo[matchCount] = cars[i];
                matchCount++;
            }
        }
        Car[] result = new Car[matchCount];
        for (int i = 0; i < matchCount; i++){
            result[i] = temporaryInfo[i];
        }
        return result;
    }
    public Car[] getCarsUnderAverageConsumption(double consumptionLimit){
        Car[] tempInfo = new Car[count]; //tempInfo -> pomocné pole no.2
        int matchCount = 0;

        for (int i = 0; i < count; i++){
            if (cars[i].getConsuption().getAverage() < consumptionLimit){
                tempInfo[matchCount] = cars[i];
                matchCount++;
            }
        }
        Car[] result = new Car[matchCount];
        for (int i = 0; i < matchCount; i++){
            result[i] = tempInfo[i];
        }
        return result;
    }
    public Car[] getCarsByFuel(Fuel fuel){
        Car[] tempInfo = new Car[cars.length]; //tempInfo -> pomocné pole no.3
        int matchCount = 0;

        for (int i = 0; i < count; i++){
            if (cars[i].getFuel() == fuel){
                tempInfo[matchCount] = cars[i];
                matchCount++;
            }
        }
        Car[] result = new Car[matchCount];
        for (int i = 0; i < matchCount; i++){
            result[i] = tempInfo[i];
        }
        return result;
    }

}
