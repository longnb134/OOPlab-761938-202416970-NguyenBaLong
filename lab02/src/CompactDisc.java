package lab02.src;

import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, String artist, String director, float cost) {
        super(director, category, title, cost);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track '" + track.getTitle() + "' is already in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Track '" + track.getTitle() + "' has been added to the CD.");
        }
    }
t
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track '" + track.getTitle() + "' has been removed from the CD.");
        } else {
            System.out.println("Track '" + track.getTitle() + "' is not in the CD.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
}