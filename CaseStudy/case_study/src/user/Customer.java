package user;

public class Customer extends User{
    public Customer(String userID, String username, String password, String fullName, String email,
                    String phoneNumber, String userType, double balance, boolean isActive) {
        super(userID, username, password, fullName, email, phoneNumber, userType, balance, isActive);
    }
}
