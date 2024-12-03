public class TestMedia {
    public static void main(String[] args) {
        // Tạo đối tượng Media
        Media media = new Media("HAHA", "HIHI", 19.99f);

        // Hiển thị thông tin
        media.displayInfo();

        // Kiểm tra các phương thức getter
        System.out.println("Title: " + media.getTitle());
        System.out.println("Category: " + media.getCategory());
        System.out.println("Cost: $" + media.getCost());
    }
}
