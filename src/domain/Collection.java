package domain;

import java.util.ArrayList;

public class Collection {

    private String name;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Collection( String name_){
        name = name_;
    }

    public void addSong(Song s) {
        songs.add(s);
    }

    public Song getSong(int i) {
        return songs.get(i);
    }
    public int getSize() {
        return songs.size();
    }

    public String getName() {
        return name;
    }
}