package data;

import com.opencsv.CSVReader;
import common.UserFilePath;
import user.User;
import user.UserFactory;

import java.io.FileReader;
import java.util.List;

public class UserReaderData {
    UserDataList userList = UserDataList.getInstance();

    public List<User> readDataFromFile() {
        try (CSVReader csvReader = new CSVReader(new FileReader(UserFilePath.filePath))) {
            List<String[]> rows = csvReader.readAll();
            for (String[] row : rows) {
                if (row != null) {
                    User user = UserFactory.createUser(row[0], row[1], row[2], row[3], row[4], row[5], row[6],
                            Double.parseDouble(row[7]), Boolean.parseBoolean(row[8]), Boolean.parseBoolean(row[9]));
                    userList.addUser(user);
                }
            }
        } catch (Exception e) {

        }
        return userList.getUserList();
    }
}
