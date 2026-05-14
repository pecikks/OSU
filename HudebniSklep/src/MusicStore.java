import java.util.ArrayList;

public class MusicStore {
    private Album[] albums;
    private int count; // pomocná proměnná (kolik alb v poli)

    public MusicStore(int capacity) {
        this.albums = new Album[capacity]; //inicializace pole na dannou velikost
        this.count = 0;
    }
    public void addAlbum(Album album){
        //kontrola jestli se do alba ještě něco vejde
        if (count < albums.length) {
            albums[count] = album;
            count++; //po přidání zvýší počítadlo
        } else {
            System.out.println("Chyba: Kapacita obchodu je plná, nelze přidat!");
        }
    }
    public void printAllAlbums(){
        System.out.println("--- Seznam všech alb v obchodě ---");
        for (int  i = 0; i < count; i++){
            System.out.println(albums[i].toString());
        }
    }
    public Album getLongestAlbum() {
        if (count == 0) return null; //obchod prázdný

        Album longest = albums[0]; //předpoklad, že první je nejdelší
        for (int i = 1; i < count; i++){
            //pokud se najde nové nejdelší, uloží se tam
            if (albums[i].getLength() > longest.getLength()){
                longest = albums[i];
            }
        }
        return longest;
    }
    public Album getAlbumByName(String name) {
        for (int i = 0; i < count; i++){
            if (albums[i].getName().equalsIgnoreCase(name)) {
                return albums[i];
            }
        }
        return null; //pokud nenajde album
    }
    public ArrayList<Album> getAlbumsByGenre(Genre genre) {
        ArrayList<Album> filtered = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (albums[i].getGenre() == genre) {
                filtered.add(albums[i]);
            }
        }
        return filtered;
    }
}
