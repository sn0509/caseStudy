package userManager.Login;

import java.util.Scanner;

public class LoginInput {
    Scanner SCANNER = new Scanner(System.in);
    public String getUsername(){
        System.out.println("Enter your username: ");
        return  SCANNER.nextLine();
    }

    public String getPassword(){
        System.out.println("Enter your password: ");
        return SCANNER.nextLine();
    }
}
