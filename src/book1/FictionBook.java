package book1;

import java.lang.invoke.StringConcatException;

public class FictionBook extends Book {
    String category;

    public FictionBook(){

    }
    public FictionBook(String category){
        this.category = category;
    }

    public FictionBook(String category,int bookCode, String name, double price, String author){
        super(bookCode, name, price, author);
        this.category =category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "bookCode=" + bookCode + "\t" +
                ", name='" + name + '\'' + "\t" +
                ", price=" + price + "\t" +
                ", author='" + author + "\t" +
                "category = " +category +
                '}';
    }
}
