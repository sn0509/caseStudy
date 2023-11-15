package user;

public class UserFactory {
    private String userID;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String userType;
    private double balance;
    private boolean isActive;
    public static User createUser(String userID, String username, String password, String fullName, String email
            , String phoneNumber, String userType, double balance, boolean isActive){
        switch (userType){
            case "0":
                return new Admin(userID,username,password,fullName,email,phoneNumber,userType,balance,isActive);
            case "1":
                return new Customer(userID,username,password,fullName,email,phoneNumber,userType,balance,isActive);
            case "2":
                return new Seller(userID,username,password,fullName,email,phoneNumber,userType,balance,isActive);
            default:
                return null;
        }
    }
}
