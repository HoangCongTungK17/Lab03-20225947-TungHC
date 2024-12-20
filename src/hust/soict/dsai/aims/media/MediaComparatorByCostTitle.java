package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int costComparison = Float.compare(m2.getCost(), m1.getCost()); // Giá giảm dần
        if (costComparison == 0) {
            return m1.getTitle().compareTo(m2.getTitle()); // Sắp xếp theo tiêu đề
        }
        return costComparison;
    }
}
