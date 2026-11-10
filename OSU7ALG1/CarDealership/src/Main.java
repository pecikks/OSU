void main() {
        CarDealer carDealer = new CarDealer(10);

        Consuption c1 = new Consuption(6.5, 4.5, 5.5);
        Car car1 = new Car("Arona","Seat",150000, c1, 250000, Fuel.Diesel);

        Consuption c2 = new Consuption(8.0, 6.0, 7.0);
        Car car2 = new Car("Golf", "Volkswagen", 120000, c2, 300000, Fuel.Petrol);

        Consuption c3 = new Consuption(4.0, 3.5, 3.8);
        Car car3 = new Car("S-CROSS", "Suzuki", 50000, c3, 500000, Fuel.Hybrid);

        carDealer.addCar(car1);
        carDealer.addCar(car2);
        carDealer.addCar(car3);

        System.out.println("Počet aut v bazaru: " + carDealer.getCarCount());

        //Filtr dle paliva
        Car[] diesels = carDealer.getCarsByFuel(Fuel.Diesel);
        System.out.println("Počet dieslových aut: " + diesels.length);
        for (Car i : diesels) {
            System.out.println(" - " + i.getManufacturer() + " " + i.getModel());
        }

        //Filtr dle požadované spotřeby
        Car[] lowConsumption = carDealer.getCarsUnderAverageConsumption(6.0);
        System.out.println("Aut s průměrnou spotřebou 6.0: " + lowConsumption.length);
        for (Car i : lowConsumption){
            System.out.println(" - " + i.getManufacturer() + " " + i.getModel());
        }

        //Filtr dle výrobce
        Car[] madeBy = carDealer.getCarsByManufacturer("Volkswagen");
        System.out.println("Počet aut od výrobce Volkswagen: " + madeBy.length);
        for (Car i : madeBy) {
            System.out.println(" - " + i.getManufacturer() + " " + i.getModel());
        }
    }
