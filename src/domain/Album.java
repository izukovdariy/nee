package domain;

import java.util.ArrayList;

public class Album {

    private String name;
    private Artist artist;
    private Genre genre;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Album(String name, Artist artist, Genre genre) {
        this.name = name;
        this.genre=genre;
        this.artist=artist;
    }

    public void setArtist(Artist a) {
        artist = a;
    }

    public void setGenre(Genre g) {
        genre = g;
    }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public Song getSong(int i) {
        return songs.get(i);
    }

    public int getSize() {
        return songs.size();
    }


    public void addSong(Song s) {
        songs.add(s);
        s.setGenre(genre);
        s.setAlbum(this);
        s.setArtist(artist);
    }
}