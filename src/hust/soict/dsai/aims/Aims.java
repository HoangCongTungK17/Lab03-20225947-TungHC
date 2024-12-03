package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

import java.util.Scanner;

public class Aims {
    private static Scanner scanner = new Scanner(System.in);
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        // Khởi tạo cửa hàng với các phương tiện mẫu
        Store store = new Store();
        store.addMedia(new Book("The Great Gatsby", "Novel", "F. Scott Fitzgerald", 10.99f));
        store.addMedia(new CompactDisc("Thriller", "Pop", 15.99f, "Michael Jackson"));
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));

        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới
            switch (choice) {
                case 1: viewStore(store); break;
                case 2: updateStore(store); break;
                case 3: seeCurrentCart(); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void viewStore(Store store) {
        int choice;
        do {
            store.displayStore();
            storeMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới
            switch (choice) {
                case 1: seeMediaDetails(store); break;
                case 2: addMediaToCart(store); break;
                case 3: playMedia(); break;
                case 4: seeCurrentCart(); break;
                case 0: break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");
    }

    public static void seeMediaDetails(Store store) {
        System.out.print("Enter the media title: ");
        String title = scanner.nextLine();
        Media media = store.getMediaByTitle(title);
        if (media != null) {
            System.out.println(media);
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void addMediaToCart(Store store) {
        System.out.print("Enter the media title to add to cart: ");
        String title = scanner.nextLine();
        Media media = store.getMediaByTitle(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Media added to cart. Current cart size: " + cart.getCartSize());
        } else {
            System.out.println("Media not found.");
        }
    }

    public static void playMedia() {
        System.out.print("Enter the media title to play: ");
        String title = scanner.nextLine();
        System.out.println("Playing media: " + title);
    }

    public static void updateStore(Store store) {
        System.out.println("Updating store...");
        // Thực hiện các chức năng như thêm hoặc xóa phương tiện
    }

    public static void seeCurrentCart() {
        cart.displayCart();
    }
}





