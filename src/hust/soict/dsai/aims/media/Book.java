package hust.soict.dsai.aims.media;


import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<>();

    public Book(String string, String title, String category, float cost) {
        super(category, category, cost);
    }

    // Thêm và xóa tác giả
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }
    
    @Override
    public String toString() {
        String author = null;
		return "Book - Title: " + title + ", Category: " + getCategory() + ", Author: " + author + ", Cost: $" + cost;
    }
}
