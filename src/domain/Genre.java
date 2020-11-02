package domain;

public class Genre {

    private String name;
    private Genre parent;

    public Genre(String name_) {
        name = name_;
    }

    public String getName() {
        return name;
    }

    public void setParent(Genre g) {
         this.parent = g;
    }

    public Genre getParent() {
        return this.parent;
    }


    public void addSubGenre(Genre g) {
        g.setParent(this);
    }

    public String getUpGenre(){
        return this.parent.name;
    }

}