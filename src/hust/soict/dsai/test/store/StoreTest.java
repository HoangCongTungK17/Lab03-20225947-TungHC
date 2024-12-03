package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo cửa hàng mới
        Store store = new Store();

        // Tạo DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Ron Clements", 90, 18.99f);

        // Thêm DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Hiển thị các DVD trong cửa hàng
        store.printStore();

        // Xóa một DVD khỏi cửa hàng
        store.removeDVD(dvd2);

        // Hiển thị lại các DVD trong cửa hàng sau khi xóa
        store.printStore();

        // Thử xóa một DVD không tồn tại
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Unknown Movie", "Unknown", "Unknown", 0, 0);
        store.removeDVD(dvd4);

        // Hiển thị cửa hàng lần cuối
        store.printStore();
    }
}
