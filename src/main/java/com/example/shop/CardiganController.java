/**
 * Контроллер для окна приложения "Кофты".
 * @author SabinaTanya
 */


package com.example.shop;

import MySQL.CardiganMysqlConnect;
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
 * столбцов, которые находятся в окне приложения "Кофты".
 */
public class CardiganController {

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
     * {@link CardiganController#SearchButton}, {@link CardiganController#MainButton}
     * А так же вывод в колонки {@link CardiganController#col_colour}, {@link CardiganController#col_name},
     * {@link CardiganController#col_is_size}, {@link CardiganController#col_size}, {@link CardiganController#col_quantity},
     * {@link CardiganController#col_price}, {@link CardiganController#col_structure}
     * из таблицы {@link CardiganController#Table_Product} отсортированных данных
     * @see CardiganController
     */
    @FXML
    void initialize() {
        /**
         * Активация кнопки {@link CardiganController#SearchButton}
         * @see CardiganController
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
         * Заполнение колонок из {@link CardiganController#Table_Product} данными
         * Для получения данных используется класс
         * @see Product
         */
        col_name.setCellValueFactory(new PropertyValueFactory<Product, String>("product_name"));
        col_size.setCellValueFactory(new PropertyValueFactory<Product, String>("size"));
        col_is_size.setCellValueFactory(new PropertyValueFactory<Product, Integer>("id_size"));
        col_price.setCellValueFactory(new PropertyValueFactory<Product, Integer>("price_RUB"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));
        col_colour.setCellValueFactory(new PropertyValueFactory<Product, String>("colour"));
        col_structure.setCellValueFactory(new PropertyValueFactory<Product, String>("structure"));

        /**
         * Заполнение переменной {@link CardiganController#ListM} данными, предоставляемыми
         * классом, связанным с MySQL
         * @see CardiganMysqlConnect
         * Вывод заполненной таблицы {@link CardiganController#Table_Product}
         */
        ListM = CardiganMysqlConnect.getDataProduct();
        Table_Product.setItems(ListM);
    }
}
