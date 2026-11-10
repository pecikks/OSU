public class Sector {
    private int standingPlaces;
    private int seatingPlaces;
    private String nameOfSector;
    private String colorOfSector;

    public void setStandingPlaces(int standingPlaces) {
        this.standingPlaces = standingPlaces;
    }

    public void setSeatingPlaces(int seatingPlaces) {
        this.seatingPlaces = seatingPlaces;
    }

    public void setNameOfSector(String nameOfSector) {
        this.nameOfSector = nameOfSector;
    }

    public void setColor(String colorsOfSector) {
        this.colorOfSector = colorsOfSector;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public int getSeatingPlaces() {
        return seatingPlaces;
    }

    public String getNameOfSector() {
        return nameOfSector;
    }

    public String getColor() {
        return colorOfSector;
    }

    public Sector(int standingPlaces, int seatingPlaces, String nameOfSector, String colorOfSector) {
        this.standingPlaces = standingPlaces;
        this.seatingPlaces = seatingPlaces;
        this.nameOfSector = nameOfSector;
        this.colorOfSector = colorOfSector;
    }

    public void printInfo() {
        System.out.println("Sektor: " + nameOfSector);
        System.out.println(" - Míst k sezení: " + seatingPlaces);
        System.out.println(" - Míst na stání: " + standingPlaces);
        System.out.println(" - Barva: " + colorOfSector);
        System.out.println(); //pro přehlednost
    }

}
