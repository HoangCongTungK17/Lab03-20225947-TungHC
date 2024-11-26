package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    private int qtyOrdered = 0; // số hàng hiện có
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int cnt = 0; // số lượng hàng hóa

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
     
    // thêm 1 dvd
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (cnt < MAX_NUMBERS_ORDERED) {
            itemOrdered[cnt] = disc;
            cnt++;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }
     
    // thêm 1 mảng danh sách dvd
    public void addDigitalVideoDisc1(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }
    
    // thêm số lượng DVD tùy ý
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            addDigitalVideoDisc(dvd);
        }
    }
    
    // thêm 2 dvd 
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
    
        
        

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < cnt; i++) {
            if (itemOrdered[i].equals(disc)) {
                System.arraycopy(itemOrdered, i + 1, itemOrdered, i, cnt - i - 1);
                cnt--;
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed");
                break;
            }
        }
        if (!found) {
            System.out.println("No disc found to remove");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < cnt; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }
    
 // Phương thức in danh sách DVD
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < cnt; i++) {
            System.out.println((i + 1) + ". " + itemOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    // Phương thức tìm kiếm DVD theo ID
    public void searchById(int id) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemOrdered) {
            if (dvd != null && dvd.getId() == id) {
                System.out.println("Found DVD: " + dvd.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    // Phương thức tìm kiếm DVD theo tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemOrdered) {
            if (dvd != null && dvd.isMatch(title)) {
                System.out.println("Found DVD: " + dvd.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }
}
	
	


