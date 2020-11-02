package domain;

import java.util.ArrayList;

public class Catalog {

    private ArrayList<Album> albums = new ArrayList<Album>();
    private ArrayList<Collection> collections = new ArrayList<Collection>();

    public void addAlbum(Album a) {
        albums.add(a);
    }

    public Album getAlbum(int i) {
        return albums.get(i);
    }

    public void addCollection(Collection c) {
        collections.add(c);
    }

    public Collection getCollection(int i) {
        return collections.get(i);
    }

    public void findSong(int year) {
        System.out.println("Песни, выпущенные в "+year+":");
        for (int i = 0; i < this.albums.size(); i++) {
            for (int j = 0; j < this.getAlbum(i).getSize(); j++) {
                if (this.getAlbum(i).getSong(j).getYear() == year) {
                    System.out.print(this.getAlbum(i).getSong(j).getName() + " ");
                }
            }
        }System.out.println();

    }

    public void findArtist(String song_name){
        System.out.println("Артист, который написал песню "+song_name+":");
        for (int i = 0; i < this.albums.size(); i++) {
            for (int j = 0; j < this.getAlbum(i).getSize(); j++) {
                if (this.getAlbum(i).getSong(j).getName().equals(song_name)) {
                    System.out.print(this.getAlbum(i).getSong(j).getArtist().getName() + " ");
                }
            }
        }System.out.println();

    }

    public void findAlbums(String genre_name) {
        System.out.println("Альбомы жанра "+genre_name+" и всех его поджанров:");
        for (int i = 0; i < this.albums.size(); i++) {
            if ((genre_name).equals(this.getAlbum(i).getGenre().getName())) {
                System.out.print(this.getAlbum(i).getName() + " ");
            }
            if (this.getAlbum(i).getGenre().getParent() != null && (genre_name).equals(this.getAlbum(i).getGenre().getParent().getName())) {
                System.out.print(this.getAlbum(i).getName() + " ");
            }
        }System.out.println();
    }

    public void findCollections(String genre_name) {
        System.out.println("Коллекции жанра "+genre_name+" и всех его поджанров:");
        for (int i = 0; i < this.collections.size(); i++) {
            for (int j = 0; j < this.getCollection(i).getSize(); j++) {
                if ((genre_name).equals(this.getCollection(i).getSong(j).getGenre().getName())) {
                    System.out.print(this.getCollection(i).getName() + " ");
                }
                if (this.getCollection(i).getSong(j).getGenre().getParent() != null && (genre_name).equals(this.getCollection(i).getSong(j).getGenre().getParent().getName())) {
                    System.out.print(this.getCollection(i).getName() + " ");
                }
            }
        }System.out.println();
    }
}

