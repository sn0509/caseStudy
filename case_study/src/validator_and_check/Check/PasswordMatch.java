package validator_and_check.Check;

public class PasswordMatch implements InputCheck {

    @Override
    public boolean isCheck(String input1, String input2) {
        if(input1.equals(input2)){
            return true;
        }else {
            System.out.println("Password doesn't match, try again!");
        }
        return false;
    }
}
