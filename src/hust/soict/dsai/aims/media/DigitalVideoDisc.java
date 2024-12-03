package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Media implements Playable {
    private String director;
    private int length;  

    // Biến lớp dùng để đếm số lượng DVD đã được tạo
    private static int nbDigitalVideoDiscs = 0;
	private static int id1;

    // ID duy nhất cho mỗi DVD
    //private int id;

    // Constructor mặc định
   /* public DigitalVideoDisc() {
        // Tăng số lượng DVD khi khởi tạo đối tượng mới
        nbDigitalVideoDiscs++;
        // Gán ID cho đối tượng
        DigitalVideoDisc.id1 = nbDigitalVideoDiscs;
    }*/

    // Constructor với thông tin đầy đủ
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);  
        this.director = director;
        this.length = length;
        
        // Tăng số lượng DVD khi khởi tạo đối tượng mới
        nbDigitalVideoDiscs++;
        // Gán ID duy nhất cho đối tượng mới
        DigitalVideoDisc.id1 = nbDigitalVideoDiscs;
    }

    // Phương thức kiểm tra nếu tiêu đề DVD khớp với tìm kiếm
    public boolean isMatch(String searchTitle) {
        return getTitle().toLowerCase().contains(searchTitle.toLowerCase());
    }

    // Phương thức toString() để in thông tin DVD
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + director + " - " + length + " mins: " + getCost() + " $";
    }

    // Getter và setter cho director và length (không cần getter cho title, category, cost vì đã có trong Media)
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Getter và setter cho số lượng DVD
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }

    // Getter cho ID
    public int getId() {
        return id1;
    }

    public void setId(int id) {
        DigitalVideoDisc.id1 = id;
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + " mins");
    }
  
    
}
