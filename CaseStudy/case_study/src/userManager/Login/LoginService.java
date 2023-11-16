package userManager.Login;

import data.UserReaderData;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import user.CurrentUser;
import user.User;

public class LoginService<T extends User> {
    private User currentUser;
    private UserReaderData dataReader = new UserReaderData();
    private LoginInput input = new LoginInput();
    private String username = input.getUsername();
    private String password = input.getPassword();
    private final BCryptPasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    public User getCurrenUser() {
        for (User user : dataReader.readDataFromFile()) {
            if (username.equals(user.getUsername()) && PASSWORD_ENCODER.matches(password, user.getPassword())) {
                if (user.isActive() && !user.isBan()) {
                    CurrentUser.setCurrentUser(user);
                    currentUser = CurrentUser.getCurrentUser();
                    System.out.println("userManager.Login Successfully");
                    return currentUser;
                } else {
                    System.out.println("Your account has been disabled or locked. Please contact the\" +\n" +
                            "                            \" administrator for assistance.");
                    return null;
                }
            }
        }
        System.out.println("Your account does not exist or the password is incorrect.");
        return null;
    }
}

