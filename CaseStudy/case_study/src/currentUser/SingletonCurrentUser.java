package currentUser;

import Login.LoginDTO;
import Login.LoginInput;
import data.UserDataList;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import user.User;

public class SingletonCurrentUser<T extends  User> {
    private T currentUser;
    private static SingletonCurrentUser instance;
    private final BCryptPasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
    private LoginInput userInput = new LoginInput();
    private LoginDTO userLogin = new LoginDTO(userInput.getUsername(), userInput.getPassword());
    private String username = userLogin.getUsername();
    private String password = userLogin.getPassword();
    private SingletonCurrentUser() {}
    public static SingletonCurrentUser getInstance() {
        if(instance == null) {
            instance = new SingletonCurrentUser();
        }
        return instance;
    }

    public T getCurrentUser() {
        return (T) currentUser;
    }

    public T setCurrentUser() {
        for (User user : UserDataList.getInstance().getUserList()) {
            if(user.getUsername().equals(username) && PASSWORD_ENCODER.matches(password,user.getPassword())) {
                currentUser = (T) user;
                }
            }
        return null;
        }
    }

