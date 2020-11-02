package domain;

import java.util.ArrayList;

public class Artist {

    private String name;
    private Genre genre;
    private ArrayList<Album> albums = new ArrayList<Album>();

    public Artist(String name,Genre genre){
        this.name = name;
        this.genre=genre;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void addAlbum( Album a){
        albums.add(a);
        a.setGenre(genre);
        a.setArtist(this);
    }

   /* public void setGenre(Genre g) {
        genre = g;
        for(int i = 0; i < albums.size(); i++ ){
            albums.get(i).setGenre(g);
            for(int j = 0; j < albums.get(i).getSizeSongs(); j++ ){
                albums.get(i).getSong(j).setGenre(g);
            }
        }
    }*/
}