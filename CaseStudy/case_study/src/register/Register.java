package register;

import data.CSVFileReader;
import data.CSVFileWriter;
import user.User;

import java.util.ArrayList;
import java.util.List;

public class Register {
    public void register(){
        CSVFileReader csvFileReader = new CSVFileReader();
        List<User> userList =csvFileReader.readDataFromFile();
        UserRegister userRegister = new UserRegister();
        User user = userRegister.getRegister();
        userList.add(user);
        CSVFileWriter csvFileWriter = new CSVFileWriter();
        csvFileWriter.writerDataToCSVFile(userList);
    }
}
