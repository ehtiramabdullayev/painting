import java.util.Date;
import java.util.Set;

/**
 * @author Ehtiram Etibarovich Abdullayev on 28.10.2019
 * @project painting
 */
public class BookBorrowService {
    private UserRepository userRepository;
    private StockRepository stockRepository;
    private BorrowedBookRepository borrowedBookRepository;
    private BookSubscriptionRepository bookSubscriptionRepository;

    public BookBorrowService(UserRepository userRepository, StockRepository stockRepository,
                             BorrowedBookRepository borrowedBookRepository, BookSubscriptionRepository bookSubscriptionRepository) {
        this.userRepository = userRepository;
        this.stockRepository = stockRepository;
        this.borrowedBookRepository = borrowedBookRepository;
        this.bookSubscriptionRepository = bookSubscriptionRepository;
    }

    public BorrowedBook borrowBook(long userId, String bookName) {
        BorrowedBook borrowedBook = new BorrowedBook();
        User userById = userRepository.getUserById(userId); // if user exits
        Set<ShelvedBook> shelvedBookSet = stockRepository.getShelvedAvailableBookByBookName(bookName); // if book exists
        //if book doesnt exists, subscribe to the book
        if (shelvedBookSet.isEmpty()) {
            Set<ShelvedBook> allbooks = stockRepository.getShelvedBookByBookName(bookName);
            bookSubscriptionRepository.saveBookSubscription(userById, allbooks.stream().findFirst().get().getBook());
        }
        ShelvedBook shelvedBook = shelvedBookSet.stream().findFirst().get();
        shelvedBook.setBorrowedBookId(borrowedBook.getId());
        stockRepository.saveBookToShelve(shelvedBook);
        return borrowedBookRepository.saveBorrowedBook(userById, shelvedBook);

    }


    public BorrowedBook extendBookPeriod(long userId, long shelvedBookId, long amountToBeExpanded) {
        User userById = userRepository.getUserById(userId); // if user exits
        BorrowedBook borrowedBook = borrowedBookRepository.getUserBooksByUserIdAndShelvedBookId(userId, shelvedBookId); // if book is borrowed
        borrowedBook.setExpectedReturnTime(borrowedBook.getExpectedReturnTime().plusMonths(amountToBeExpanded));
        return borrowedBookRepository.saveBorrowedBook(borrowedBook);
    }


    public BorrowedBook returnBook(long userId, long shelvedBookId) {
        User userById = userRepository.getUserById(userId); // if user exits
        BorrowedBook borrowedBook = borrowedBookRepository.getUserBooksByUserIdAndShelvedBookId(userId, shelvedBookId); // if book is borrowed
        borrowedBook.setReturnedAt(new Date());
        return borrowedBookRepository.saveBorrowedBook(borrowedBook);
    }


}
