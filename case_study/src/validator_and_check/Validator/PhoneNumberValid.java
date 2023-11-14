package validator_and_check.Validator;

import register.GetUserInput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValid implements Validator {
    @Override
    public boolean isValid(String input) {
        GetUserInput getUserInput = new GetUserInput();
        String regex = "^(?:\\+84|0)[0-9]{9,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            return true;
        }
        System.out.println("Invalid email, try again!");
        return false;
    }
}
