package TESTCRUD;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ridjal Fathoni
 */
public class file_koneksi {

    private static Connection koneksi;

    public static Connection GetConnection() throws SQLException {
        if (koneksi == null) {
            Driver driver = new Driver();
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testkoneksi_db? zeroDateTimeBehavior = convertToNull  ", "root", "");
}
return koneksi;
    }
}
