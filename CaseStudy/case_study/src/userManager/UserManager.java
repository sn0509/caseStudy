package userManager;

import userManager.Login.LoginService;
import userManager.register.RegisterService;

public class UserManager {
    private RegisterService userRegisterService = new RegisterService();
    private LoginService userLogin = new LoginService();


    public void register (){
        userRegisterService.register();
    }

    public void login(){
        userLogin.getCurrenUser();
    }
}
