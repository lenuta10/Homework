package homework1.library_main;

import homework1.library_model.Book;

import java.util.ArrayList;

public class BookCatalog {
    private ArrayList<Book> books;


    public BookCatalog()
    {
        books = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks()
    {
        return books;
    }

    public String addBook(Book aBook)
    {
        books.add(aBook);
        return "Book " + aBook.getName() + " added \n";
    }

    public boolean includesBook(Book aBook)
    {
        for(Book book: books){
            if(book.getName() == aBook.getName())
                return true;
        }
        return false;
    }

    public String removeBook(Book aBook)
    {
        if (this.includesBook(aBook))
        {
            books.remove(aBook);
            return "The book " + aBook.getName() + " is removed \n";
        }
        else{
            return "The book " + aBook.getName() + " not found - cannot remove \n";
        }
    }

}
