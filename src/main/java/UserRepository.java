import java.util.List;

/**
 * @author Ehtiram Etibarovich Abdullayev on 27.10.2019
 * @project painting
 */
public interface UserRepository {
    List<User> getAllUsers();

    User getUserById(long id);

    void deleteUserById(long id);

    User saveUser(User user);

}
