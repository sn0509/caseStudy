package currentUser;

import Login.LoginService;
import user.User;

public class SetCurrentUser {
    private User user;

    public User currentUser(){
        LoginService loginService = new LoginService();
         user = loginService.setCurrentUser();
        return user;
    }
}
