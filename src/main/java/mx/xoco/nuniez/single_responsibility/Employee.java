package mx.xoco.nuniez.single_responsibility;

import lombok.Data;
import mx.xoco.nuniez.utils.MyUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Data
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String employeeAddress;
    private String contactNumber;
    private String employeeType;

    public void save() {
        // Serialize object into a string representation
        String objectStr = MyUtils.serializeIntoAString(this);
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

    public void calculateTax() {
        if (this.getEmployeeType().equals("fulltime")) {
            // Tax calc for full time employee
        }
        if (this.getEmployeeType().equals("contract")) {
            // Tax calc for contractors
        }
    }

}
