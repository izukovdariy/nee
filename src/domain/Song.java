package domain;

class Song {

    private String name;
    private Artist artist;
    private Genre genre;
    private Album album;
    private int year;

    Song(String name,Artist artist,Genre genre, Album album,int year) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.year = year;
    }

    void setArtist(Artist a) {
        artist = a;
    }

    void setGenre(Genre g) {
        genre = g;
    }

    void setAlbum(Album a) {
        album = a;
    }


    public String getName() { return name; }

    public Artist getArtist() {
         return artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public Album getAlbum() {
        return album;
    }

    public int getYear() { return year;}

}

