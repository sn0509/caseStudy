package data;

import com.opencsv.CSVWriter;
import common.FilePath;
import register.UserRegister;
import user.User;

import java.io.FileWriter;
import java.util.List;

public class CSVFileWriter {

    public void writerDataToCSVFile(List<User> userList){
            {
                try(CSVWriter csvWriter = new CSVWriter(new FileWriter(FilePath.filePath)))
                {
                    for(User user : userList){
                        String[] record = {user.getUserID(), user.getUsername(),user.getPassword(),user.getFullName(),
                                user.getEmail(), user.getPhoneNumber(),user.getUserType(),
                                String.valueOf(user.getBalance()),String.valueOf(user.isActive())};
                        csvWriter.writeNext(record);
                    }

                }catch (Exception e){

                }
            }
    }
}
