public class Main {
    public static void main(String[] args) {
        MusicStore store = new MusicStore(3);

        Artist artist1 = new Artist("Metallica", "USA");
        Artist artist2 = new Artist("Eminem", "USA");
        Artist artist3 = new Artist("Katy Perry", "USA");

        store.addAlbum(new Album("Master of Puppets", 54, Genre.METAL, artist1));
        store.addAlbum(new Album("The Eminem Show", 77, Genre.HIPHOP, artist2));
        store.addAlbum(new Album("Teenage Dream", 47, Genre.POP, artist3));

        //1. test plné kapacity (vyhodi eror)
        store.addAlbum(new Album("Test plné kapacity", 69, Genre.ROCK, artist1));

        //2. vypsání všech alb
        store.printAllAlbums();

        //3. nejdelší album
        Album longest = store.getLongestAlbum();
        System.out.println("\nNejdelší album: " + (longest != null ? longest.getName(): "Žádné"));

        //3. hledání podle názvu
        Album found = store.getAlbumByName("The Eminem Show");
        System.out.println("Hledání 'The Eminem Show': " + (found != null ? "Nalezeno" : "Nenalezeno"));

        //4. filtrování podle žánru (METAL)
        System.out.println("\nMetalová alba:");
        for (Album a : store.getAlbumsByGenre(Genre.METAL)){
            System.out.println("- " + a.getName());
        }
    }
}
