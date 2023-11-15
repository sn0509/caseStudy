package register;

import data.CSVFileReader;
import org.mindrot.jbcrypt.BCrypt;
import user.User;
import user.UserFactory;
import validator_and_check.Check.InputCheck;
import validator_and_check.Check.PasswordMatch;
import validator_and_check.Check.UserIsExist;
import validator_and_check.Validator.*;

import java.io.Reader;

public class UserRegister {
    private String userType;
    private int userChoice;
    private final String salt = BCrypt.gensalt();
    GetUserInput input = new GetUserInput();
    GetUserType getUserType = new GetUserType();
    GetUserID randomID= new GetUserID();
    Validator usernameValid = new UserNameValid();
    Validator passValid = new PasswordValid();
    Validator emailValid = new EmailValid();
    Validator phoneNumberValid = new PhoneNumberValid();
    UserIsExist userIsExist = new UserIsExist();
    InputCheck passwordCheck = new PasswordMatch();
    CSVFileReader csvFileReader = new CSVFileReader();

    public String getUserType(int input){
        switch (userChoice){
            case 1:
                return userType = "Customer";
            case 2:
                return userType = "Seller";
            default:
                return null;
        }
    }

    public User getRegister(){

        String userID = randomID.generateTimeBaseId();
        String username;
        do{
            username = input.getUserName();
        } while(!usernameValid.isValid(username)||(userIsExist.userIsExist(username,csvFileReader.readDataFromFile())));

        String confirmPasswordInput;
        String passwordInput;
        do{
            passwordInput = input.getPassword();
            confirmPasswordInput = input.getConfirmPassword();
        } while (!((passValid.isValid(passwordInput)) && passwordCheck.isCheck(passwordInput, confirmPasswordInput)));
        String password = BCrypt.hashpw(passwordInput, salt);
        String fullName = input.getFullName();
        String email;
        do{
            email = input.getEmail();
        }while (!emailValid.isValid(email));

        String phoneNumber;
        do{
            phoneNumber = input.getPhoneNumber();
        } while (!phoneNumberValid.isValid(phoneNumber));
        do{
            userChoice = input.getUserChoice();
        }while(userChoice != 1 && userChoice != 2);
            userType = getUserType.getUserType(userChoice);
        boolean IS_ACTIVE = true;
        boolean IS_BAN = false;
        double BALANCE = 0;
        return UserFactory.createUser(userID, username, password, fullName, email, phoneNumber,userType, BALANCE, IS_ACTIVE, IS_BAN);
    }

}
