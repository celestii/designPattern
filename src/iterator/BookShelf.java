package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

    private List<Book> books = new ArrayList<Book>();

    @Override
    public Iterator iterator() {

        return new BookShelfIterator(this);
    }

    public List<Book> getBooks() {

        return books;
    }

    public void appendBook(Book book) {

        books.add(book);
    }
}
