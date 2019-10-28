import java.util.List;
import java.util.Set;

/**
 * @author Ehtiram Etibarovich Abdullayev on 27.10.2019
 * @project painting
 */
public class StockManagementService {
    private StockRepository stockRepository;


    public StockManagementService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    List<ShelvedBook> getAllShelvedBooks(){
        return stockRepository.getAllShelvedBooks();
    }

    ShelvedBook getShelvedBookById(long id){
        return stockRepository.getShelvedBookById(id);
    }

    Set<ShelvedBook> getShelvedBookByBookName(String name){
        return stockRepository.getShelvedBookByBookName(name);
    }

    void deleteShelvedBookById(long id){
        stockRepository.deleteShelvedBookById(id);
    }

    ShelvedBook saveBookToShelve(Book book){
        return stockRepository.saveBookToShelve(book);
    }
}
