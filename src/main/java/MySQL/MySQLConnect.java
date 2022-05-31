package MySQL;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public abstract class MySQLConnect{
    /** Переменная - соединение с базой данных в MySQL */
    Connection con = null;

    /**
     * Подключение к базе данных MySQL
     * @return необходимую базу даннных - shop
     * Обработка исключений
     */
    protected static Connection ConnectDb()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", "sabina");
            return con;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
