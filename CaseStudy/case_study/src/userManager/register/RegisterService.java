package userManager.register;

import data.UserReaderData;
import data.UserWriterData;
import user.User;

import java.util.List;

public class RegisterService {
    public void register(){
        UserReaderData userReaderData = new UserReaderData();
        List<User> userList = userReaderData.readDataFromFile();
        UserRegister userRegister = new UserRegister();
        User user = userRegister.getRegister();
        userList.add(user);
        UserWriterData userWriterData = new UserWriterData();
        userWriterData.writerUsersToCSVFile(userList);
    }
}
