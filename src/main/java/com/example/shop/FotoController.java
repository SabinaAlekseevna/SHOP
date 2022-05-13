package com.example.shop;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FotoController {

    @FXML
    private ImageView sabina;

    Image Sabina2 = new Image(getClass().getResourceAsStream("dress2.png"));

    public void displayImage(){
        sabina.setImage(Sabina2);
    }
}
