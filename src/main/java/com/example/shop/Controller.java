/**
 * Основной контроллер приложения  - контроллер меню.
 * @author SabinaTanya
 */

package com.example.shop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

 /**
 *  Описание объектов: кнопок, таблиц, текстовых полей,
 * которые находятся в окне приложения.
 */
public class Controller {
    /** Кнопка для перехода к окну "Кофты" */
    @FXML
    private Button CardiganButton;

    /** Кнопка для перехода к окну "Платья" */
    @FXML
    private Button DressesButton;

    /** Кнопка для перехода к окну "Нижнее белье" */
    @FXML
    private Button LingerieButton;

    /** Кнопка для перехода к окну "Поиск" */
    @FXML
    private Button SearchButton;

    /** Кнопка для перехода к окну "Футболки" */
    @FXML
    private Button ShirtButton;

    /** Кнопка для перехода к окну "Юбки" */
    @FXML
    private Button SkirtsButton;

    /** Кнопка для перехода к окну "Брюки" */
    @FXML
    private Button TrousersButton;

     @FXML
     private Button katalog;

    /**
     * Инициализация кнопок
     * {@link Controller#CardiganButton}, {@link Controller#DressesButton}, {@link Controller#LingerieButton},
     * {@link Controller#SearchButton}, {@link Controller#ShirtButton}, {@link Controller#SkirtsButton},
     * {@link Controller#TrousersButton}
     * @see Controller
     */
    @FXML
    void initialize() {
        /**
         * Активация кнопки {@link Controller#SkirtsButton}
         * @see Controller
         */
        SkirtsButton.setOnAction(event -> {
            SkirtsButton.getScene().getWindow().hide();

            /**
             * Загрузка окна
             * @see Skirts.fxml
             */
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Skirts.fxml"));

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
         * Активация кнопки {@link Controller#DressesButton}
         * @see Controller
         */
        DressesButton.setOnAction(event -> {
            DressesButton.getScene().getWindow().hide();

            /**
             * Загрузка окна
             * @see Dresses.fxml
             */
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Dresses.fxml"));

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
         * Активация кнопки {@link Controller#TrousersButton}
         * @see Controller
         */
        TrousersButton.setOnAction(event -> {
            TrousersButton.getScene().getWindow().hide();

            /**
             * Загрузка окна
             * @see Trousers.fxml
             */
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Trousers.fxml"));

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
         * Активация кнопки {@link Controller#LingerieButton}
         * @see Controller
         */
        LingerieButton.setOnAction(event -> {
            LingerieButton.getScene().getWindow().hide();

            /**
             * Загрузка окна
             * @see Lingerie.fxml
             */
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Lingerie.fxml"));

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
          Активация кнопки {@link Controller#ShirtButton}
          @see Controller
         */
        ShirtButton.setOnAction(event -> {
            ShirtButton.getScene().getWindow().hide();

            /**
             * Загрузка окна
             * @see Shirt.fxml
             */
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Shirt.fxml"));

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
         * Активация кнопки {@link Controller#CardiganButton}
         * @see Controller
         */
        CardiganButton.setOnAction(event -> {
            CardiganButton.getScene().getWindow().hide();

            /**
             * Загрузка окна
             * @see Cardigan.fxml
             */
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Cardigan.fxml"));

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
         * Активация кнопки {@link Controller#SearchButtonButton}
         * @see Controller
         */
        SearchButton.setOnAction(event -> {
            SearchButton.getScene().getWindow().hide();

            /**
             * Загрузка окна
             * @see Search.fxml
             */
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
        katalog.setOnAction(event -> {
            katalog.getScene().getWindow().hide();

            /**
             * Загрузка окна
             * @see Skirts.fxml
             */
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("photo.fxml"));

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
    }
}
