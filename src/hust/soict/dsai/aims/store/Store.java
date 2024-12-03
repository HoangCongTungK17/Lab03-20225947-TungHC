package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>(); // Thay thế mảng bằng ArrayList

    // Phương thức thêm Media vào cửa hàng
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("The media \"" + media.getTitle() + "\" has been added to the store.");
    }

    // Phương thức xóa Media khỏi cửa hàng
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("The media \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is not found in the store.");
        }
    }

    // Phương thức hiển thị tất cả Media trong cửa hàng
    public void printStore() {
        System.out.println("***********************STORE***********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is currently empty.");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
            }
        }
        System.out.println("***************************************************");
    }

	public void displayStore() {
		// TODO Auto-generated method stub
		
	}

	public Media getMediaByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
}
