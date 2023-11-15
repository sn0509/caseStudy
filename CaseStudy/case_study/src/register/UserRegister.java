package register;

import org.mindrot.jbcrypt.BCrypt;
import user.User;
import user.UserFactory;
import validator_and_check.Check.InputCheck;
import validator_and_check.Check.PasswordMatch;
import validator_and_check.Validator.*;

public class UserRegister {
    private String userID;
    private String username;
    private String password;
    private String passwordInput;
    private String confirmPasswordInput;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String userType;
    private int userChoice;
    private final double BALANCE = 0;
    private final boolean IS_ACTIVE = true;
    private String salt = BCrypt.gensalt();
    GetUserInput input = new GetUserInput();
    GetUserType getUserType = new GetUserType();
    GetUserID randomID= new GetUserID();
    Validator usernameValid = new UserNameValid();
    Validator passValid = new PasswordValid();
    Validator emailValid = new EmailValid();
    Validator phoneNumberValid = new PhoneNumberValid();
    InputCheck passwordCheck = new PasswordMatch();

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
        userID =  randomID.generateTimeBaseId();
        do{
            username = input.getUserName();
        } while(!usernameValid.isValid(username));

        do{
            passwordInput = input.getPassword();
            confirmPasswordInput= input.getConfirmPassword();
        } while (!((passValid.isValid(passwordInput)) && passwordCheck.isCheck(passwordInput,confirmPasswordInput)));
        password = BCrypt.hashpw(passwordInput,salt);
        fullName = input.getFullName();
        do{
            email = input.getEmail();
        }while (!emailValid.isValid(email));

        do{
            phoneNumber = input.getPhoneNumber();
        } while (!phoneNumberValid.isValid(phoneNumber));
        do{
            userChoice = input.getUserChoice();
        }while(userChoice != 1 && userChoice != 2);
            userType = getUserType.getUserType(userChoice);
        return UserFactory.createUser(userID,username,password,fullName,email,phoneNumber,userType,BALANCE,IS_ACTIVE);
    }

}
