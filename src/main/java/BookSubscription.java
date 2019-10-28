/**
 * @author Ehtiram Etibarovich Abdullayev on 28.10.2019
 * @project painting
 */
public class BookSubscription {
    private long id;
    private User user;
    private Book book;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
