package domain;

import java.util.ArrayList;

public class Genres {

    private ArrayList<Genre> genres = new ArrayList<Genre>();

    public void addGenre(Genre g){
        genres.add(g);
    }

    public Genre getGenre(int i) {
        return genres.get(i);
    }
}