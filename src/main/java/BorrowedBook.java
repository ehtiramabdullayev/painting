import java.time.LocalDate;
import java.util.Date;

/**
 * @author Ehtiram Etibarovich Abdullayev on 28.10.2019
 * @project painting
 */
public class BorrowedBook {
    private long id;
    private ShelvedBook shelvedBook;
    private BasicUser user;
    private Date takenAt;
    private LocalDate expectedReturnTime;
    private Date returnedAt;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ShelvedBook getShelvedBook() {
        return shelvedBook;
    }

    public void setShelvedBook(ShelvedBook shelvedBook) {
        this.shelvedBook = shelvedBook;
    }

    public BasicUser getUser() {
        return user;
    }

    public void setUser(BasicUser user) {
        this.user = user;
    }

    public Date getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Date takenAt) {
        this.takenAt = takenAt;
    }

    public LocalDate getExpectedReturnTime() {
        return expectedReturnTime;
    }

    public void setExpectedReturnTime(LocalDate expectedReturnTime) {
        this.expectedReturnTime = expectedReturnTime;
    }

    public Date getReturnedAt() {
        return returnedAt;
    }

    public void setReturnedAt(Date returnedAt) {
        this.returnedAt = returnedAt;
    }
}
