import com.firstcoding.todo.Util.ConnectionProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionTest {

    @Test
    public void testConnections() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");


        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "scott", "tiger");

        Assertions.assertNotNull(conn);

        conn.close();


    }
    @Test
    public void testPoolConnections() throws Exception{
        Connection conn = ConnectionProvider.getInstance().getConnection();

        System.out.println(conn);

        Assertions.assertNotNull(conn);

        conn.close();
    }

}
