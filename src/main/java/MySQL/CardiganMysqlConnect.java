/**
 * Подключение к MySQL для окна приложения "Кофты".
 * @author SabinaTanya
 */

package MySQL;

import com.example.shop.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Класс подключенния к MySQL
 * Наследование из класса {@link MySQLConnect}
 */
public class CardiganMysqlConnect  extends MySQLConnect{
    static Logger logger = LoggerFactory.getLogger(CardiganMysqlConnect.class);
    /**
     * Использование полученной базы данных, получение необходимых данных для приложения
     * @return соответсвующую зопросу таблиу
     * Обработка исключений
     */
    public static ObservableList<Product> getDataProduct(){

        Connection con = ConnectDb();
        ObservableList<Product> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from shop_clothes where name_product = 'Кофта' order by size_product");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                list.add(new Product(rs.getString("name_product"), rs.getString("size_product"),Integer.parseInt(rs.getString("number_size")), Integer.parseInt(rs.getString("price_RUB")),rs.getString("colour") ,Integer.parseInt(rs.getString("quantity")), rs.getString("structure")));
            }
        } catch (Exception e){
            logger.error("Ошибка в получении данных ", e);
        }

        return list;
    }
}
