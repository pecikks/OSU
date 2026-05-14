public class MusicHall {
    private Sector sector1;
    private Sector sector2;
    private Sector sector3;
    private Sector sector4;
    private Sector sector5;
    private Sector sector6;
    private Sector sector7;

    public void setSector1(Sector sector1) {
        this.sector1 = sector1;
    }

    public void setSector2(Sector sector2) {
        this.sector2 = sector2;
    }

    public void setSector3(Sector sector3) {
        this.sector3 = sector3;
    }

    public void setSector4(Sector sector4) {
        this.sector4 = sector4;
    }

    public void setSector5(Sector sector5) {
        this.sector5 = sector5;
    }

    public void setSector6(Sector sector6) {
        this.sector6 = sector6;
    }

    public void setSector7(Sector sector7) {
        this.sector7 = sector7;
    }

    public Sector getSector1() {
        return sector1;
    }

    public Sector getSector2() {
        return sector2;
    }

    public Sector getSector3() {
        return sector3;
    }

    public Sector getSector4() {
        return sector4;
    }

    public Sector getSector5() {
        return sector5;
    }

    public Sector getSector6() {
        return sector6;
    }

    public Sector getSector7() {
        return sector7;
    }

    public MusicHall(Sector sector1, Sector sector2, Sector sector3, Sector sector4, Sector sector5, Sector sector6, Sector sector7) {
        this.sector1 = sector1;
        this.sector2 = sector2;
        this.sector3 = sector3;
        this.sector4 = sector4;
        this.sector5 = sector5;
        this.sector6 = sector6;
        this.sector7 = sector7;
    }
    public int getSumOfSeatingPlaces(){
        return sector1.getSeatingPlaces() +
                sector2.getSeatingPlaces() +
                sector3.getSeatingPlaces() +
                sector4.getSeatingPlaces() +
                sector5.getSeatingPlaces() +
                sector6.getSeatingPlaces() +
                sector7.getSeatingPlaces();
    }
    public int getSumOfSeatingPlaces(String onlyForColor){
        int totalSeatingSeats = 0;
        if (sector1.getColor().equals(onlyForColor)){
            totalSeatingSeats += sector1.getSeatingPlaces();
        }
        if (sector2.getColor().equals(onlyForColor)){
            totalSeatingSeats += sector2.getSeatingPlaces();
        }
        if (sector3.getColor().equals(onlyForColor)){
            totalSeatingSeats += sector3.getSeatingPlaces();
        }
        if (sector4.getColor().equals(onlyForColor)){
            totalSeatingSeats += sector4.getSeatingPlaces();
        }
        if (sector5.getColor().equals(onlyForColor)){
            totalSeatingSeats += sector5.getSeatingPlaces();
        }
        if (sector6.getColor().equals(onlyForColor)){
            totalSeatingSeats += sector6.getSeatingPlaces();
        }
        if (sector7.getColor().equals(onlyForColor)){
            totalSeatingSeats += sector7.getSeatingPlaces();
        }
        return totalSeatingSeats;
    }
    public int getSumOfStandingPlaces() {
        return sector1.getStandingPlaces() +
                sector2.getStandingPlaces() +
                sector3.getStandingPlaces() +
                sector4.getStandingPlaces() +
                sector5.getStandingPlaces() +
                sector6.getStandingPlaces() +
                sector7.getStandingPlaces();
    }
    public int getSumOfStandingPlaces (String onlyForColor){
        int totalStandingPlaces = 0;
        if (sector1.getColor().equals(onlyForColor)){
            totalStandingPlaces += sector1.getStandingPlaces();
        }
        if (sector2.getColor().equals(onlyForColor)){
            totalStandingPlaces += sector2.getStandingPlaces();
        }
        if (sector3.getColor().equals(onlyForColor)){
            totalStandingPlaces += sector3.getStandingPlaces();
        }
        if (sector4.getColor().equals(onlyForColor)){
            totalStandingPlaces += sector4.getStandingPlaces();
        }
        if (sector5.getColor().equals(onlyForColor)){
            totalStandingPlaces += sector5.getStandingPlaces();
        }
        if (sector6.getColor().equals(onlyForColor)){
            totalStandingPlaces += sector6.getStandingPlaces();
        }
        if (sector7.getColor().equals(onlyForColor)){
            totalStandingPlaces += sector7.getStandingPlaces();
        }
        return totalStandingPlaces;
    }
    public void printInfo(){
        System.out.println("------ Informace o Koncertní síni ------");

        System.out.println("Celková kapacita k sezení: " + getSumOfSeatingPlaces());
        System.out.println("Celková kapacita ke stání: " + getSumOfStandingPlaces());

        System.out.println("Červená zóna (sezení): " + getSumOfSeatingPlaces("red"));
        System.out.println("Žlutá zóna (sezení): " + getSumOfSeatingPlaces("yellow"));
        System.out.println("Modrá zóna (sezení): " + getSumOfSeatingPlaces("blue"));

        System.out.println("Červená zóna (stání): " + getSumOfStandingPlaces("red"));
        System.out.println("Žlutá zóna (stání): " + getSumOfStandingPlaces("yellow"));
        System.out.println("Modrá zóna (stání): " + getSumOfStandingPlaces("blue"));

        System.out.println("\n--- Detaily sektorů ---");

        sector1.printInfo();
        sector2.printInfo();
        sector3.printInfo();
        sector4.printInfo();
        sector5.printInfo();
        sector6.printInfo();
        sector7.printInfo();

        System.out.println("-------------------------------------");
    }

}
