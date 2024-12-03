package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", null, null, 0, 0);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", null, null, 0, 0);

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swapold(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle, oldTitle, oldTitle, 0, 0);
    }
    
    
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tempTitle = dvd1.getTitle();  // Lưu tiêu đề của dvd1
        dvd1.setTitle(dvd2.getTitle());      // Đặt tiêu đề của dvd2 cho dvd1
        dvd2.setTitle(tempTitle);            // Đặt tiêu đề tạm vào dvd2
    }


}

