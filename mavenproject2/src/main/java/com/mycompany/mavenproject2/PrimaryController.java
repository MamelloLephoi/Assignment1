package com.mycompany.mavenproject2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    private Button Clear;

    @FXML
    private Button Country1;
    
    @FXML
    private Label SSD;

    @FXML
    private Button Country2;

    @FXML
    private Button Country3;

    @FXML
    private Button Country4;

    @FXML
    private Button Country5;
    @FXML
    private Rectangle Rectangle1;
    @FXML
    private Rectangle Rectangle2;
    @FXML
    private Rectangle Rectangle3;
    @FXML
    private Color Colour;
    @FXML
    private Button Reset;

    @FXML
    void BTT1(ActionEvent event) {
//        Rectangle1.setWidth(200);
//        Rectangle1.setHeight(67);
        Rectangle1.setFill(Colour.BLUE);
        
//        Rectangle2.setWidth(200);
//        Rectangle2.setHeight(67);
        Rectangle2.setFill(Colour.WHITE);
        
//        Rectangle3.setWidth(200);
//        Rectangle3.setHeight(67);
        Rectangle3.setFill(Colour.GREEN);
         Rectangle1.setVisible(true);
        Rectangle2.setVisible(true);
        Rectangle3.setVisible(true);
        
          SSD.setText("LESOTHO");
    }

    @FXML
    void BTT2(ActionEvent event) {
//        Rectangle1.setWidth(200);
//        Rectangle1.setHeight(67);
        Rectangle1.setFill(Colour.WHITE);
        
//        Rectangle2.setWidth(200);
//        Rectangle2.setHeight(67);
        Rectangle2.setFill(Colour.BLUE);
        
//        Rectangle3.setWidth(200);
//        Rectangle3.setHeight(67);
        Rectangle3.setFill(Colour.BLACK);
        
         Rectangle1.setVisible(true);
        Rectangle2.setVisible(true);
        Rectangle3.setVisible(true);
        SSD.setText("ESTONIA");
    }

    @FXML
    void BTT3(ActionEvent event) {
//        Rectangle1.setWidth(200);
//        Rectangle1.setHeight(67);
        Rectangle1.setFill(Colour.RED);
        
//        Rectangle2.setWidth(200);
//        Rectangle2.setHeight(67);
        Rectangle2.setFill(Colour.WHITE);
        
//        Rectangle3.setWidth(200);
//        Rectangle3.setHeight(67);
        Rectangle3.setFill(Colour.BLUE);
         Rectangle1.setVisible(true);
        Rectangle2.setVisible(true);
        Rectangle3.setVisible(true);
        SSD.setText("NETHERLANDS");
        
    }

    @FXML
    void BTT4(ActionEvent event) {
//        Rectangle1.setWidth(200);
//        Rectangle1.setHeight(67);
        Rectangle1.setFill(Colour.WHITE);
        
//        Rectangle2.setWidth(200);
//        Rectangle2.setHeight(67);
        Rectangle2.setFill(Colour.BLUE);
        
//        Rectangle3.setWidth(200);
//        Rectangle3.setHeight(67);
        Rectangle3.setFill(Colour.RED);
        
         Rectangle1.setVisible(true);
        Rectangle2.setVisible(true);
        Rectangle3.setVisible(true);
        SSD.setText("RUSSIA");
    }

    @FXML
    void BTT5(ActionEvent event) {
//        Rectangle1.setWidth(200);
//        Rectangle1.setHeight(67);
        Rectangle1.setFill(Colour.CYAN);
        
//        Rectangle2.setWidth(200);
//        Rectangle2.setHeight(67);
        Rectangle2.setFill(Colour.WHITE);
        
//        Rectangle3.setWidth(200);
//        Rectangle3.setHeight(67);
        Rectangle3.setFill(Colour.CYAN);
        
        Rectangle1.setVisible(true);
        Rectangle2.setVisible(true);
        Rectangle3.setVisible(true);
        
        SSD.setText("AGENTINA");
    }
    @FXML
    void ResetBTT(ActionEvent event) {
      
        
        Rectangle1.setVisible(false);
        Rectangle2.setVisible(false);
        Rectangle3.setVisible(false);
        
        SSD.setText("");
    }

    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {
        App.setRoot("secondary");
        Parent root=FXMLLoader.load(getClass().getResource("secondary.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.getScene();
        stage.show();
    }
}
