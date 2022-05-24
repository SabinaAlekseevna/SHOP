/**
 * Контроллер для окна приложения "Поиск".
 * @author SabinaTanya
 */

package com.example.shop;

import MySQL.SearchMysqlConnect;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *  Описание объектов: кнопок, таблиц, текстовых полей,
 * которые находятся в окне приложения.
 */
public class SearchController {

    /** Кнопка для перехода к главному окну - "Меню" */
    @FXML
    private Button MainButton;

    /** Поле для ввода текста по которому будет осуществляться поиск */
    @FXML
    private TextField TextSearch;

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

    /** Переменная для представления таблицы "Продукт"*/
    ObservableList<Product> ListM;

    /** Переменная для представления таблицы "Продукт",
     *  отсортированной по вводимому параметру в текстовом поле {@link SearchController#TextSearch}
    */
    ObservableList<Product> dataList;

    /**
     * Инициализация кнопки {@link SearchController#MainButton}
     * А так же вывод данных в колонки {@link SearchController#col_colour}, {@link SearchController#col_name},
     * {@link SearchController#col_is_size}, {@link SearchController#col_size}, {@link SearchController#col_quantity},
     * {@link SearchController#col_price}, {@link SearchController#col_structure}
     * из таблицы {@link SearchController#Table_Product}
     * @see SearchController
     */
    @FXML
    void initialize() {
        /**
         * Активация кнопки {@link CardiganController#SearchButtonButton}
         * @see CardiganController
         */
        MainButton.setOnAction(event -> {
            MainButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ShopClothes.fxml"));

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
         * Заполнение переменной {@link SearchController#ListM} данными, предоставляемыми
         * классом, связанным с MySQL
         * @see SearchMysqlConnect
         * Вывод заполненной таблицы {@link SearchController#Table_Product}
         */
        ListM = SearchMysqlConnect.getDataproduct();
        Table_Product.setItems(ListM);
        searchData ();
    }

    /**
     * Инициализации поиска с помощью заполненной данными таблицы {@link SearchController#Table_Product}
     * с колонками {@link SearchController#col_colour}, {@link SearchController#col_name},
     * {@link SearchController#col_is_size}, {@link SearchController#col_size}, {@link SearchController#col_quantity},
     * {@link SearchController#col_price}, {@link SearchController#col_structure}
     * Использование {@link SearchController#dataList} для вывода таблицы с данными,
     * которые удовлетворяют условиям поиска - веденному параметру в {@link SearchController#TextSearch}
     */
    @FXML
    void searchData (){
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
         * Заполнение переменной {@link SearchController#dataList} данными, предоставляемыми
         * классом, связанным с MySQL
         * @see SearchMysqlConnect
         * Вывод заполненной таблицы {@link SearchController#Table_Product}
         */
        dataList = SearchMysqlConnect.getDataproduct();
        Table_Product.setItems(dataList);

        /** Создание переменной на основе {@link SearchController#dataList} */
        FilteredList<Product> filteredData = new FilteredList<>(dataList, b -> true);

        /** Использование {@link SearchController#TextSearch} для сортировки данных из таблицы*/
        TextSearch.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(prod -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();
                /* Запуск ветвления для поиска данных, удовлетворяющих входному параметру */
                if (prod.getProduct_name().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true;
                } else if (prod.getSize().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true;
                } else if (String.valueOf(prod.getId_size()).indexOf(lowerCaseFilter) !=-1) {
                    return true;
                }else if (String.valueOf(prod.getPrice_RUB()).indexOf(lowerCaseFilter) !=-1) {
                    return true;
                }else if (String.valueOf(prod.getQuantity()).indexOf(lowerCaseFilter) !=-1) {
                    return true;
                }else if (prod.getColour().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true;
                }else if (prod.getStructure().toLowerCase().indexOf(lowerCaseFilter) != -1)
                    return true;
                else
                    return false;
            });
        });

        /** Заполнение таблицы данным, которые удовлетворяют условиям поиска */
        SortedList<Product> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(Table_Product.comparatorProperty());
        Table_Product.setItems(sortedData);
    }
}
