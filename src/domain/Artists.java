package domain;

import java.util.ArrayList;

public class Artists {

    private ArrayList<Artist> artists = new ArrayList<Artist>();

    public void addArtist(Artist a){
        artists.add(a);
    }

    public Artist getArtist(int i) {
        return artists.get(i);
    }
}
