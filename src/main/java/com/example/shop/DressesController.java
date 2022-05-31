/**
 * Контроллер для окна приложения "Платья".
 * @author SabinaTanya
 */

package com.example.shop;

import MySQL.DressMysqlConnect;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *  Описание объектов: кнопок, таблиц, текстовых полей,
 * столбцов, которые находятся в окне приложения "Платья".
 */
public class DressesController {

    /** Кнопка для перехода к окну "Поиск" */
    @FXML
    private Button SearchButton;
    /** Кнопка для перехода к главному окну - "Меню" */
    @FXML
    private Button MainButton;

    /** Представление таблицы "Товар"*/
    @FXML
    private TableView<Product> Table_Product;

    /** Колонка таблицы "Цвет" */
    @FXML
    private TableColumn<Product, String> col_colour;

    /** Колонка таблицы "Номер размера" */
    @FXML
    private TableColumn<Product, Integer> col_is_size;

    /** Колонка таблицы "Название товара" */
    @FXML
    private TableColumn<Product, String> col_name;

    /** Колонка таблицы "Цена" */
    @FXML
    private TableColumn<Product, Integer> col_price;

    /** Колонка таблицы "Количество" */
    @FXML
    private TableColumn<Product, Integer> col_quantity;

    /** Колонка таблицы "Размер" */
    @FXML
    private TableColumn<Product, String> col_size;

    /** Колонка таблицы "Состав" */
    @FXML
    private TableColumn<Product, String> col_structure;

    /**Изображение-иконка поиска*/
    @FXML
    private ImageView searchImage;

    /**Изображение-иконка домика (меню)*/
    @FXML
    private ImageView mainImage;

    /**Изображение-иконка манекена*/
    @FXML
    private ImageView mannequinImage;

    /** Переменная для представления таблицы "Продукт"*/
    ObservableList<Product> ListM;

    /**
     * Инициализация кнопок
     * {@link DressesController#SearchButton}, {@link DressesController#MainButton}
     * А так же вывод в колонки {@link DressesController#col_colour}, {@link DressesController#col_name},
     * {@link DressesController#col_is_size}, {@link DressesController#col_size}, {@link DressesController#col_quantity},
     * {@link DressesController#col_price}, {@link DressesController#col_structure}
     * из таблицы {@link DressesController#Table_Product} отсортированных данных
     * @see DressesController
     */
    @FXML
    void initialize() {
        /**
         * Активация кнопки {@link DressesController#SearchButton}
         * @see DressesController
         */
        MainButton.setOnAction(event -> {
            MainButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ShopClothes.fxml"));

            /**
             * Обработка исключений
             */
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /**
             * Закрытие старого окна (окна меню) перед открытием нового
             * окна (окна описания товара)
             */
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        /**
         * Активация кнопки {@link CardiganController#SearchButtonButton}
         * @see CardiganController
         */
        SearchButton.setOnAction(event -> {
            SearchButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Search.fxml"));

            /* Обработка исключений */
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            /*
             * Закрытие старого окна (окна меню) перед открытием нового
             * окна (окна описания товара)
             */
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        /**
         * Заполнение колонок из {@link DressesController#Table_Product} данными.
         * Для получения данных используется класс {@link Product}
         */
        col_name.setCellValueFactory(new PropertyValueFactory<Product, String>("product_name"));
        col_size.setCellValueFactory(new PropertyValueFactory<Product, String>("size"));
        col_is_size.setCellValueFactory(new PropertyValueFactory<Product, Integer>("id_size"));
        col_price.setCellValueFactory(new PropertyValueFactory<Product, Integer>("price_RUB"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));
        col_colour.setCellValueFactory(new PropertyValueFactory<Product, String>("colour"));
        col_structure.setCellValueFactory(new PropertyValueFactory<Product, String>("structure"));

        /**
         * Заполнение переменной {@link DressesController#ListM} данными, предоставляемыми
         * классом, связанным с MySQL
         * @see DressMysqlConnect
         * Вывод заполненной таблицы {@link DressesController#Table_Product}
         */
        ListM = DressMysqlConnect.getDataProduct();
        Table_Product.setItems(ListM);
    }

}
