import java.util.List;

/**
 * @author Ehtiram Etibarovich Abdullayev on 27.10.2019
 * @project painting
 */
public interface BookRepository {
    List<Book> getAllBooks();

    Book getBookById(long id);

    void deleteBookById(long id);

    Book saveUser(Book book);

}
