package singleton;

import com.rapidtech.demospringboot.singleton.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DatabaseTest {
    @Test
    void singletonTest() {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();
        Database database3 = Database.getInstance();

        Assertions.assertSame(database1, database2);
        Assertions.assertSame(database2, database3);

    }
}