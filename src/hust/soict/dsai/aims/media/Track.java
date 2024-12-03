package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;  
    private int length;    
	
    public Track() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
    
    
	@Override
    public void play() {
        System.out.println("Playing track: " + this.title);
        System.out.println("Track length: " + this.length + " mins");
    }
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;  // Kiểm tra nếu là cùng một tham chiếu
	    if (obj == null || getClass() != obj.getClass()) return false;  // Kiểm tra kiểu đối tượng
	    
	    Track track = (Track) obj;  // Ép kiểu obj thành Track
	    return this.title != null && this.title.equals(track.getTitle()) &&
	           this.length == track.getLength();  // So sánh title và length
	}

	

}
