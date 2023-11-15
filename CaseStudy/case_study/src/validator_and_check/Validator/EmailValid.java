package validator_and_check.Validator;

import register.GetUserInput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValid implements Validator {
    @Override
    public boolean isValid(String input) {
        GetUserInput getUserInput = new GetUserInput();
        String regex = "^(?=.{6,64}$)[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            return true;
        }
        System.out.println("Invalid email, try again!");
        return false;
    }
}
