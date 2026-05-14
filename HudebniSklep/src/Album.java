public class Album {
    private String name;
    private int length;
    private Genre genre;
    private Artist artist;

    public Album(String name, int length, Genre genre, Artist artist) {
        this.name = name;
        this.length = length;
        this.genre = genre;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Album: " + name + " | Délka: " + length + " min | Žánr: " + genre + " | Autor: " + artist;
    }
}
