package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
     private String title;
     private String category;
     private String director;
     private int lenght;
     private float cost;
     
  //  Biến lớp dùng để đếm số lượng DVD đã được tạo
     private static int nbDigitalVideoDiscs = 0;
     
  // ID duy nhất cho mỗi DVD
     private int id;
     
     
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


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getLenght() {
		return lenght;
	}


	public void setLenght(int lenght) {
		this.lenght = lenght;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}
	
	


	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}


	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public DigitalVideoDisc() {
		// TODO Auto-generated constructor stub
		 // Tăng số lượng DVD khi khởi tạo đối tượng mới
        nbDigitalVideoDiscs++;
        // Gán ID cho đối tượng
        this.id = nbDigitalVideoDiscs;
    }
	


	public DigitalVideoDisc(String title, String category, String director, int lenght, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.lenght = lenght;
		this.cost = cost;
		
		 // Tăng số lượng DVD khi khởi tạo đối tượng mới
        nbDigitalVideoDiscs++;
        // Gán ID duy nhất cho đối tượng mới
        this.id = nbDigitalVideoDiscs;
	}
	
	// Phương thức isMatch() để kiểm tra tiêu đề
    public boolean isMatch(String searchTitle) {
        return title.toLowerCase().contains(searchTitle.toLowerCase());
    }
    
 // Phương thức toString() để in thông tin DVD
    @Override
    public String toString() {
        String length = null;
		return "DVD - " + title + " - " + category + " - " + director + " - " + length + " mins: " + cost + " $";
    }
	
	
	

}
