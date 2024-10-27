
public class Aims {

	public Aims() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cart anOrder  = new Cart();
       DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
       anOrder.addDigitalVideoDisc(dvd1);

       DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
       anOrder.addDigitalVideoDisc(dvd2);

       DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation", "HCT", 87, 18.99f);
       anOrder.addDigitalVideoDisc(dvd3);

        //print total cost of the items in the cart
        System.out.println("Total Cost is: " + anOrder.totalCost());
        
        // Xóa một đĩa DVD khỏi giỏ hàng
        System.out.println("\nRemoving 'Star Wars' from the cart:");
        anOrder.removeDigitalVideoDisc(dvd2);

        // Kiểm tra tổng chi phí sau khi xóa
        System.out.println("Total Cost after removing: " + anOrder.totalCost());
     
     // Thử xóa một đĩa không có trong giỏ
        System.out.println("\nTry to remove a disc not in a cart");
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("None", "Un", "Un", 0, 0f);
        anOrder.removeDigitalVideoDisc(dvd4);
}
	}


