package Login;

import currentUser.SingletonCurrentUser;
import data.CSVFileReader;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import user.User;
import java.util.List;
public class LoginService<T extends User> {
    private User user;

    private CSVFileReader dataReader = new CSVFileReader();
    private final BCryptPasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
    public T setCurrentUser() {
        SingletonCurrentUser.getInstance().setCurrentUser();
        return (T) SingletonCurrentUser.getInstance().getCurrentUser();
    }

    
}
