package validator_and_check.Validator;

import register.GetUserInput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValid implements Validator {
    @Override
    public boolean isValid(String input) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])[a-zA-Z\\d@#$%^&+=]{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            return true;
        }else{
            System.out.println("Invalid password, try again!");
        }

        return false;
    }
}
