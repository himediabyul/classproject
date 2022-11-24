import com.manager.emp.domain.EmpDTO;
import com.manager.emp.mapper.EmpMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Autowired(required = false)
    private EmpMapper empMapper;

    public void getEmpTest(){

        log.info("list ... " + empMapper.list());

        EmpDTO empDTO = new EmpDTO(7444, "Lee", "MANAGER", 7566, "2022-04-05", 2500, 200, 20);
    }

    @Test
    public void connectionTest() throws SQLException {

        Connection connection = dataSource.getConnection();
        log.info(connection);

        Assertions.assertNotNull(connection);

        connection.close();

    }
}
