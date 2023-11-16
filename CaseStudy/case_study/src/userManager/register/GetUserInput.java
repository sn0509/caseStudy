package userManager.register;
import validator_and_check.Check.InputCheck;
import validator_and_check.Check.PasswordMatch;
import validator_and_check.Validator.*;

import java.util.Scanner;

public class GetUserInput {
    private String userName;
    private String passWord;
    private String confirmPassword;
    private String fullName;
    private String email;
    private String phoneNumber;
    private int userChoice;

    private final Scanner SCANNER = new Scanner(System.in);
    private Validator userValid = new UserNameValid();
    private Validator passValid = new PasswordValid();
    private InputCheck passwordMatch = new PasswordMatch();
    private Validator emailValid = new EmailValid();
    private Validator phoneNumberValid = new PhoneNumberValid();

    public String getUserName() {
        System.out.println("Enter your username(8 - 20 character): ");
        return userName = SCANNER.nextLine();
    }

    public String getPassword() {
        System.out.println("Enter your password(Must contain 8 to 20 characters, including at least 1 uppercase letter" +
                ", 1 number, and 1 special character):");
        return passWord = SCANNER.nextLine();
    }

    public String getConfirmPassword() {
        System.out.println("Enter your password again:");
        return confirmPassword = SCANNER.nextLine();
    }

    public String getFullName() {
        System.out.println("Enter your full name:");
        return fullName = SCANNER.nextLine();
    }

    public String getEmail() {
        System.out.println("Enter your email:");
        return email = SCANNER.nextLine();
    }

    public String getPhoneNumber() {
            System.out.println("Enter your phone number:");
           return phoneNumber = SCANNER.nextLine();
    }

    public int getUserChoice() {
        System.out.println("""
                What do you want to become? :
                1.Customer.
                2.Seller.
                """);
        return userChoice = SCANNER.nextInt();
    }
}
