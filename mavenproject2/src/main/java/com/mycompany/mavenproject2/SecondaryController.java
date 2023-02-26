package com.mycompany.mavenproject2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SecondaryController {
    
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    private Rectangle Rectangle1;
    @FXML
    private Rectangle Rectangle2;

    @FXML
    private Rectangle Rectangle3;

//    @FXML
//    void Rectangle1(MouseEvent event) {
//
//    }
//
//    @FXML
//    void Rectangle2(MouseEvent event) {
//
//    }
//
//    @FXML
//    void Rectangle3(MouseEvent event) {
//
//    }
    @FXML
    private void switchToPrimary(ActionEvent event) throws IOException {
        App.setRoot("primary");
        Parent root=FXMLLoader.load(getClass().getResource("primary.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.getScene();
        stage.show();
    }
}