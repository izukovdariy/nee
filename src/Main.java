import domain.*;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Genres genres = new Genres();
        Artists artists = new Artists();

        for (int i = 0; i < 12; i++) {
            genres.addGenre(new Genre("genre_" + i));
        }

        for (int i = 0; i < 20; i++) {
            artists.addArtist(new Artist("artist_" + i, genres.getGenre(i % 12)));
        }

        int k = 3;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                genres.getGenre(j).addSubGenre(genres.getGenre(k));
                k++;
            }
        }

        k = 0;
        for (int i = 0; i < 25; i++) {
            String album_name = "album_" + i;
            catalog.addAlbum(new Album(album_name,artists.getArtist(i%20), genres.getGenre(i%12)));
            artists.getArtist(i % 20).addAlbum(catalog.getAlbum(i));
            for (int j = 0; j < 3; j++) {
                int year = 1950 + (int) (Math.random() * 68);
                String song_name = "song_" + (k);
                catalog.getAlbum(i).addSong(new Song(song_name,artists.getArtist(i % 20),genres.getGenre(i % 12), catalog.getAlbum(i%25),year));
                k++;
            }
        }



        catalog.findAlbums("genre_1");
        catalog.findSong(2000);
        catalog.findArtist("song_6");

    }

}