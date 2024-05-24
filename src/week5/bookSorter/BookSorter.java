package week5.bookSorter;


import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookSorter  {
    public static void main(String[] args) {
        // 5 oject created from Book class
        Book bookOne = new Book("Aeden ",547,"Azra Kohen","2016");
        Book bookTwo = new Book("Serenad",481,"Zülfü Livaneli","2011");
        Book bookThree = new Book("Hayat",192,"Engin Gençtan","2022");
        Book bookFour = new Book("Kurtlarla Koşan Kadınlar",544," Clarissa Pinkola Estes","1989");
        Book bookFive = new Book("Dört Anlaşma",122,"Don Miguel Ruiz","2021");

        System.out.println("-----------------------------------------------------");
        Set<Book> bookName = new TreeSet<>();
        bookName.add(bookOne);
        bookName.add(bookTwo);
        bookName.add(bookThree);
        bookName.add(bookFour);
        bookName.add(bookFive);


       // override method ---> A to Z sorting
       Iterator<Book> itr = bookName.iterator();
       while (itr.hasNext())
       {
           System.out.println("Book Name :" + itr.next().getBookName());

       }


        System.out.println("----------------------------------------------------");


       // büyükten küçüğe doğru sıraladım ---> sort from largest to smallest
       TreeSet<Book> booksPage = new TreeSet<>(Comparator.comparing(Book::getBookPageNum).reversed());
       booksPage.add(bookOne);
       booksPage.add(bookTwo);
       booksPage.add(bookThree);
       booksPage.add(bookFour);
       booksPage.add(bookFive);

       for(Book book: booksPage) {
           System.out.println("Page Number : " + book.getBookPageNum() + " | "+
                              "Book Name : " + book.getBookName() );
       }


    }

}
