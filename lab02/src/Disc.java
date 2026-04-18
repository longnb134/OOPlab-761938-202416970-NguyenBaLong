package lab02.src;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {
        super();
    }

    public Disc(String title) {
        super();
        this.setTitle(title);
    }

    public Disc(String category, String title, float cost) {
        super();
        this.setCategory(category);
        this.setTitle(title);
        this.setCost(cost);
    }

    public Disc(String director, String category, String title, float cost) {
        super();
        this.director = director;
        this.setCategory(category);
        this.setTitle(title);
        this.setCost(cost);
    }

    public Disc(String title, String category, String director, int length, float cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}