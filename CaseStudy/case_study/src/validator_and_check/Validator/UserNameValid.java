package validator_and_check.Validator;

import userManager.register.GetUserInput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValid implements Validator {

    @Override
    public boolean isValid(String input) {
        String regex;
        GetUserInput getUserInput = new GetUserInput();
        regex = "^[a-zA-Z0-9]{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
           return true;
        }
        System.out.println("Invalid username, try again!");
        return false;
        }
    }

