package mx.xoco.nuniez.single_responsibility;

import mx.xoco.nuniez.utils.MyUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRepository {

    public void save(Employee employee) {
        // Serialize object into a string representation
        String objectStr = MyUtils.serializeIntoAString(employee);
        Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO EMPLOYEE VALUES(" + objectStr + ")");
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

}
