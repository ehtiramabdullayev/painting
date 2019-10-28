import java.util.List;
import java.util.Set;

/**
 * @author Ehtiram Etibarovich Abdullayev on 27.10.2019
 * @project painting
 */
public interface StockRepository {
    List<ShelvedBook> getAllShelvedBooks();

    ShelvedBook getShelvedBookById(long id);

    Set<ShelvedBook> getShelvedBookByBookName(String name);

    Set<ShelvedBook> getShelvedAvailableBookByBookName(String name); // we'll consider only the books in shelf with borrowedId is null, these are free ones


    void deleteShelvedBookById(long id);

    ShelvedBook saveBookToShelve(Book book);

    ShelvedBook saveBookToShelve(ShelvedBook shelvedBook);


}
