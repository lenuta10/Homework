package homework1.library_main;

import homework1.library_model.Album;
import homework1.library_model.Author;
import homework1.library_model.Book;
import homework1.library_model.Novel;

public class BookCatalogMain {

    public static void main(String ... args){

        BookCatalog catalog = new BookCatalog();

        Author author1 = new Author("Tiberiu", "Pop");
        Author author2 = new Author("Stefan", "Popescu");
        Author author3 = new Author("Mihaela", "Noroc");
        Author author4 = new Author("Marin", "Preda");
        Author author5 = new Author("Florin", "Andreescu");

        Novel novel1 = new Novel("Memoriile unei gheise", 420, author1, "mister");
        Novel novel2 = new Novel("Morometii", 300, author4, "familie");
        Novel novel3 = new Novel("Viata incepe vineri", 526, author2, "fictiune istorica");

        Album album1 = new Album("Atlasul frumusetii", 60, author3, "good");
        Album album2 = new Album("Salutari din Romania", 120, author5, "medium");

        System.out.println(catalog.addBook(novel1));
        System.out.println(catalog.addBook(novel2));
        System.out.println(catalog.addBook(novel3));
        System.out.println(catalog.addBook(album1));
        System.out.println(catalog.addBook(album2));

        for(Book book: catalog.getBooks())
            System.out.println(book.toString());

        System.out.println("\n"+catalog.removeBook(novel3));

        for(Book book: catalog.getBooks())
            System.out.println(book.toString());
    }

}
