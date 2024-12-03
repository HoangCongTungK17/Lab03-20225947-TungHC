package hust.soict.dsai.aims.media;


import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;  // Nghệ sĩ của CD
    private ArrayList<Track> tracks = new ArrayList<>();  // Danh sách các bản nhạc của CD

    // Constructor
    public CompactDisc(String title, String category, float cost, String artist) {
        super(0, title, category, cost, 0, "");  // Truyền giá trị mặc định cho id, length, và director
        this.artist = artist;
        this.tracks = new ArrayList<Track>();
    }


    // Getter cho artist
    public String getArtist() {
        return artist;
    }

    // Phương thức thêm bản nhạc
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track " + track.getTitle() + " added.");
        } else {
            System.out.println("Track " + track.getTitle() + " already exists.");
        }
    }

    // Phương thức xóa bản nhạc
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track " + track.getTitle() + " removed.");
        } else {
            System.out.println("Track " + track.getTitle() + " does not exist.");
        }
    }

    // Phương thức tính tổng độ dài CD (tổng độ dài của tất cả các track)
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Phương thức toString để hiển thị thông tin CD
    @Override
    public String toString() {
        String trackInfo = "";
        for (Track track : tracks) {
            trackInfo += track.getTitle() + " (" + track.getLength() + " mins)\n";
        }
        return "CD - " + getTitle() + " - " + getCategory() + " - " + artist + "\nTracks:\n" + trackInfo + "Total length: " + getLength() + " mins\nCost: $" + getCost();
    }
    
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + this.artist);
        System.out.println("CD length: " + getLength() + " mins");
        
        for (Track track : tracks) {
            track.play();  // Gọi phương thức play của từng track
        }
    }
    
   
}
