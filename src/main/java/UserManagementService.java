import java.util.List;

/**
 * @author Ehtiram Etibarovich Abdullayev on 27.10.2019
 * @project painting
 */
public class UserManagementService {
    private UserRepository userRepository;

    public UserManagementService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
    public User getUserById(long id){
        return userRepository.getUserById(id);
    }

    void deleteUserById(long id){
        userRepository.deleteUserById(id);
    }

    User saveUser(User user){
        return userRepository.saveUser(user);
    }
}
