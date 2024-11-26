
package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart; // Đường dẫn đúng đến lớp Cart
import hust.soict.dsai.aims.disc.DigitalVideoDisc; // Đường dẫn đúng đến lớp DigitalVideoDisc

public class CartTest {
    public static void main(String[] args) {
        // Tạo một giỏ hàng mới
        Cart cart = new Cart();

        // Tạo các đối tượng DVD mới và thêm chúng vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Unknown", 90, 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Kiểm tra phương thức in giỏ hàng
        cart.printCart();

        // TODO: Kiểm tra các phương thức tìm kiếm
        cart.searchById(1); // Tìm DVD với ID 1
        cart.searchById(4); // Tìm DVD với ID không tồn tại

        cart.searchByTitle("Star"); // Tìm DVD với tiêu đề chứa "Star"
        cart.searchByTitle("Unknown"); // Tìm DVD với tiêu đề không tồn tại
    }
}
