package com.example.shop;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class CardiganController {

    @FXML
    private Button SearchButton;

    @FXML
    private Button MainButton;

    @FXML
    private TableView<product> Table_Product;

    @FXML
    private TableColumn<product, String> col_colour;

    @FXML
    private TableColumn<product, Integer> col_is_size;

    @FXML
    private TableColumn<product, String> col_name;

    @FXML
    private TableColumn<product, Integer> col_price;

    @FXML
    private TableColumn<product, Integer> col_quantity;

    @FXML
    private TableColumn<product, String> col_size;

    @FXML
    private TableColumn<product, String> col_structure;

    ObservableList<product> ListM;

    @FXML
    void initialize() {
        MainButton.setOnAction(event -> {
            MainButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ShopClothes.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        SearchButton.setOnAction(event -> {
            SearchButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Search.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        col_name.setCellValueFactory(new PropertyValueFactory<product, String>("product_name"));
        col_size.setCellValueFactory(new PropertyValueFactory<product, String>("size"));
        col_is_size.setCellValueFactory(new PropertyValueFactory<product, Integer>("id_size"));
        col_price.setCellValueFactory(new PropertyValueFactory<product, Integer>("price_RUB"));
        col_quantity.setCellValueFactory(new PropertyValueFactory<product, Integer>("quantity"));
        col_colour.setCellValueFactory(new PropertyValueFactory<product, String>("colour"));
        col_structure.setCellValueFactory(new PropertyValueFactory<product, String>("structure"));


        ListM = cardigan_mysqlconnect.getDataproduct();
        Table_Product.setItems(ListM);
    }
}
