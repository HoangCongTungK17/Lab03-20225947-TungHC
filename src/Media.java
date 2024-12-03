public class Media {
    private String title;
    private String category;
    private float cost;

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
}
