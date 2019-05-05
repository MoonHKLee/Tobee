package User.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {
    public Connection makeConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mariadb://15.164.32.115:3306/MoonSpring","moon","ansgur4815!");
        return c;
    }
}
