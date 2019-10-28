import java.util.Date;

/**
 * @author Ehtiram Etibarovich Abdullayev on 27.10.2019
 * @project painting
 */
public class ShelvedBook {
    private long id;
    private Book book;
    private Date lastTakenDate;
    private Date returnedDate;
    private Librarian addedBy;
    private Librarian updatedBy;
    private long borrowedBookId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getLastTakenDate() {
        return lastTakenDate;
    }

    public void setLastTakenDate(Date lastTakenDate) {
        this.lastTakenDate = lastTakenDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    public Librarian getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Librarian addedBy) {
        this.addedBy = addedBy;
    }

    public Librarian getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Librarian updatedBy) {
        this.updatedBy = updatedBy;
    }

    public long getBorrowedBookId() {
        return borrowedBookId;
    }

    public void setBorrowedBookId(long borrowedBookId) {
        this.borrowedBookId = borrowedBookId;
    }
}
