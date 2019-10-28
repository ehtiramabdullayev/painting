import java.util.List;

/**
 * @author Ehtiram Etibarovich Abdullayev on 28.10.2019
 * @project painting
 */
public interface BorrowedBookRepository {
    List<BorrowedBook> getAllBorrowedBooks();

    List<BorrowedBook> getAllBorrowedBooksByUserId(long userId);

    BorrowedBook getBorrowedBookById(long id);

    BorrowedBook getBorrowedBookByUserId(long userId);

    BorrowedBook getUserBooksByUserIdAndShelvedBookId(long userId, long shelvedBookId);

    BorrowedBook getBorrowedBookByShelvedBookId(long shelvedBookId);

    void deleteUserBooksByUserId(long userId);

    void deleteUserBooksByUserIdAndShelvedBookId(long userId, long shelvedBookId);

    void deleteBookById(long id);

    BorrowedBook saveBorrowedBook(User user, ShelvedBook shelvedBook);

    BorrowedBook saveBorrowedBook(BorrowedBook borrowedBook);


}
