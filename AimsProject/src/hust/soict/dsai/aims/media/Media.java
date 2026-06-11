package hust.soict.dsai.aims.media;

public abstract class Media implements Comparable<Media> {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        try {
            Media other = (Media) obj;
            return this.title.equals(other.title) && this.cost == other.cost;
        } catch (NullPointerException | ClassCastException e) {
            return false;
        }
    }

    @Override
    public int compareTo(Media other) {
        if (other == null) {
            throw new NullPointerException("The media object to compare is null.");
        }
        try {
            int titleComparison = this.title.compareTo(other.title);
            if (titleComparison != 0) {
                return titleComparison;
            } else {
                return Float.compare(this.cost, other.cost);
            }
        } catch (NullPointerException | ClassCastException e) {
            return -1;
        }
    }
}