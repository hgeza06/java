package db;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Géza
 */
public class Database {

    protected Connection conn;
    protected String url;
    protected String dbname;
    protected String driver;
    protected String userName;
    protected String pw;

    public Connection openConn() {

        if (conn == null) {
            url = "jdbc:mysql://localhost/";
            dbname = "testjava";
            driver = "com.mysql.jdbc.Driver";
            userName = "root";
            pw = "";

            try {

                Class.forName(driver);
                this.conn = (Connection) DriverManager.getConnection(url + dbname, userName, pw);

                //  System.out.println("Sikeres kapcsolódás");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.toString() + "\nSikertelen kapcsolódás az adatbázishoz");
            }
        }

        return conn;
    }


}
