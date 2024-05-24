package week5.bookSorter;

public class Book implements Comparable<Book>{
    // variables
    private String bookName;
    private int bookPageNum;
    private String writer;
    private String releaseDate;

    // constructor method
    public Book(String bookName, int bookPageNum, String writer, String releaseDate) {
        this.bookName = bookName;
        this.bookPageNum = bookPageNum;
        this.writer = writer;
        this.releaseDate = releaseDate;
    }
    // compareTo override !
    @Override
    public int compareTo(Book book) {
        // A to Z
        return this.getBookName().compareTo(book.bookName);
    }


    // getter and setter methods
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPageNum() {
        return bookPageNum;
    }

    public void setBookPageNum(int bookPageNum) {
        this.bookPageNum = bookPageNum;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
