package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100]; // Giới hạn 100 DVD
    private int count = 0; // Số lượng DVD hiện tại trong cửa hàng

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        if (count < itemsInStore.length) {
            itemsInStore[count] = dvd;
            count++;
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (itemsInStore[i].equals(dvd)) {
                System.arraycopy(itemsInStore, i + 1, itemsInStore, i, count - i - 1);
                count--;
                found = true;
                System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" is not found in the store.");
        }
    }

    // Phương thức hiển thị tất cả DVD trong cửa hàng
    public void printStore() {
        System.out.println("***********************STORE***********************");
        if (count == 0) {
            System.out.println("The store is currently empty.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].toString());
            }
        }
        System.out.println("***************************************************");
    }
}
