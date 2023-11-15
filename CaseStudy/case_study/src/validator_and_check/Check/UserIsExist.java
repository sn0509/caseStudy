package validator_and_check.Check;

import user.User;

import java.util.List;

public class UserIsExist {

    public boolean userIsExist(String input, List<User> objectList){
        for (User user : objectList){
            if(input.equals(user.getUsername())){
                System.out.println("Your username is exist, please choice another one!");
                return true;
            }
        }return false;
    }
}
