package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>(); // Sử dụng ArrayList cho Media

    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("The media item has been added: " + media.getTitle());
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media item has been removed: " + media.getTitle());
        } else {
            System.out.println("No media found to remove");
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // In danh sách các mặt hàng trong giỏ
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    // Tìm kiếm Media theo ID
    public void searchById(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found Media: " + media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No Media found with ID: " + id);
        }
    }

    // Tìm kiếm Media theo tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println("Found Media: " + media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Media found with title: " + title);
        }
    }

	public String getCartSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public void displayCart() {
		// TODO Auto-generated method stub
		
	}
    
    
}

	


