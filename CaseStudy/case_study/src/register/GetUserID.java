package register;

import java.time.Instant;
import java.util.UUID;

public class GetUserID {

    public String generateTimeBaseId(){
        Instant now = Instant.now();

        long timestamp = now.toEpochMilli();

        UUID uuid = UUID.randomUUID();

        String userID = timestamp + "-" + uuid.toString();

        return userID;
    }
}
