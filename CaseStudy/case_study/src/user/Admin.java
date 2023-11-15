package user;

public class Admin extends User{
    public Admin(String userID, String username, String password, String fullName, String email,
                 String phoneNumber, String userType, double balance, boolean isActive, boolean isBan) {
        super(userID, username, password, fullName, email, phoneNumber, userType, balance, isActive,isBan);
    }
}
