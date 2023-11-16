package user;

public class CurrentUser extends User {
    private static User currentUser;
    private CurrentUser(String userID, String username, String password, String fullName, String email, String phoneNumber,
                       String userType, double balance, boolean isActive, boolean isBan) {
        super(userID, username, password, fullName, email, phoneNumber, userType, balance, isActive, isBan);
    }

    public static void  setCurrentUser(User user){
      currentUser = user;
  }
  public static User getCurrentUser(){
        return currentUser;
  }


}


