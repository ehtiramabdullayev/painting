import java.util.List;

/**
 * @author Ehtiram Etibarovich Abdullayev on 27.10.2019
 * @project painting
 */
public class BookManagementService {
    private BookRepository bookRepository;

    public BookManagementService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.getAllBooks();
    }
    public Book getBookById(long id){
        return bookRepository.getBookById(id);
    }

    void deleteUserById(long id){
        bookRepository.deleteBookById(id);
    }

    Book saveUser(Book book){
        return bookRepository.saveUser(book);
    }
}
