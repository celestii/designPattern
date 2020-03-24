package iterator;

public class Main {

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBook(new Book("신데렐라"));
        bookShelf.appendBook(new Book("인어공주"));
        bookShelf.appendBook(new Book("헨델과 그레텔"));
        bookShelf.appendBook(new Book("노인과 바다"));

        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()) {

            Book book = (Book) iterator.next();

            System.out.println(book.getName());
        }
    }
}
