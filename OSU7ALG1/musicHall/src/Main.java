public class Main {
    public static void main(String[] args) {
        Sector SectorF1 = new Sector(150,0,"F1","blue");

        Sector SectorL1 = new Sector(50,80,"L1","red");
        Sector SectorL2 = new Sector(50,80,"L2","red");
        Sector SectorL3 = new Sector(20,40,"L3","red");

        Sector SectorU1 = new Sector(35,95,"U1","yellow");
        Sector SectorU2 = new Sector(35,95,"U2","yellow");
        Sector SectorU3 = new Sector(60,70,"U3","yellow");

        MusicHall ourMusicHall = new MusicHall(SectorF1, SectorL1, SectorL2, SectorL3, SectorU1, SectorU2, SectorU3);

        ourMusicHall.printInfo();
    }
}
