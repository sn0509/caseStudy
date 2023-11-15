import currentUser.SetCurrentUser;
import register.Register;


public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        register.register();

//        LoginService loginService = new LoginService();
//        loginService.authenticateUser();
        SetCurrentUser setCurrentUser = new SetCurrentUser();
        setCurrentUser.currentUser();
    }
}