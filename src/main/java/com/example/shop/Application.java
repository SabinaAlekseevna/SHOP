/**
 * Запуск первой страницы приложения - меню.
 * @author SabinaTanya
 */

package com.example.shop;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Класс запуска окна приложения
 */
public class Application extends javafx.application.Application {
    @Override
    /**
     * Метод для параметризации окна приложения
     * Открытие главного окна-меню
     * @see ShopClothes.fxml
     * Размер 700*400
     * Название "Магазин одежды"
     */
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("ShopClothes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 537);
        stage.setTitle("Магазин Одежды");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Запуск приложения
     */
    public static void main(String[] args) {
        launch();
    }
}