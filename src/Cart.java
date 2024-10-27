

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
}
	
	


