package userManager.register;

public class GetUserType {
    public String getUserType(int userChoice){
        switch (userChoice){
            case 1:
                return "1";
            case 2:
                return "2";
            default:
                return null;
        }
    }


}