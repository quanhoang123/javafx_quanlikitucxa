/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group1_quanlykitucxa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;  

/**
 *
 * @author quan.hoang22
 */
public class Group1_QuanLyKiTucXa extends Application {
    
   static Stage window;
      
    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));       
        Scene scene = new Scene(root,958.0118597249228,674.6000366210938);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
