package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class Media {
    protected String title;
    public String category;
    protected float cost;

    // Constructor
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Display info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Cost: $" + cost);
    }
    
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	public boolean isMatch(String title2) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
