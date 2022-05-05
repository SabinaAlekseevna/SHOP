/**
 * Подключение к MySQL для окна приложения "Нижнее белье".
 * @author SabinaTanya
 */
package MySQL;

import com.example.shop.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Класс подключенния к MySQL
 */
public class LingerieMysqlConnect {
    /** Переменная - соединение с базой данных в MySQL */
    Connection con = null;

    /**
     * Подключение к базе данных MySQL
     * @return необходимую базу даннных - shop
     * Обработка исключений
     */
    public static Connection ConnectDb()
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
    /**
     * Использование полученной базы данных, получение необходимых данных для приложения
     * @return соответсвующую зопросу таблиу
     * Обработка исключений
     */
    public static ObservableList<Product> getDataproduct (){

        Connection con = ConnectDb();
        ObservableList<Product> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from shop_clothes where name_product = 'Нижнее белье' order by size_product");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                list.add(new Product(rs.getString("name_product"), rs.getString("size_product"),Integer.parseInt(rs.getString("number_size")), Integer.parseInt(rs.getString("price_RUB")),rs.getString("colour") ,Integer.parseInt(rs.getString("quantity")), rs.getString("structure")));
            }
        } catch (Exception e){}

        return list;
    }
}
