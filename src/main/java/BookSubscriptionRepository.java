import java.util.List;

/**
 * @author Ehtiram Etibarovich Abdullayev on 28.10.2019
 * @project painting
 */
public interface BookSubscriptionRepository {
    List<BookSubscription> getAllBookSubscriptions();

    BookSubscription getBookByUserId(long userId);

    void deleteBookSubscriptionByUserId(long userId);

    BookSubscription saveBookSubscription(User user, Book book);
}
