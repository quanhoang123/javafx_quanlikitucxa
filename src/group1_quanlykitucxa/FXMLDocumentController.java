/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group1_quanlykitucxa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author quan.hoang22
 */
public class FXMLDocumentController {
    
    @FXML
    private Label label;
    @FXML
    private Stage primary;
    @FXML
    private Button button;
    
@FXML
   void handleButtonActionsignin(ActionEvent event) throws Exception {
          Stage window = Group1_QuanLyKiTucXa.window;

       Parent root = FXMLLoader.load(getClass().getResource("signin.fxml"));
       window.setScene(new Scene(root, 537.4, 339));

   }
   
@FXML
   void handleButtonActioncomback(ActionEvent event) throws Exception {
          Stage window = Group1_QuanLyKiTucXa.window;

       Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       window.setScene(new Scene(root, 577.4,406.6));

   }
@FXML
   void handleButtonActionsignup(ActionEvent event) throws Exception {
          Stage window = Group1_QuanLyKiTucXa.window;

       Parent root = FXMLLoader.load(getClass().getResource("singupaccount.fxml"));
       window.setScene(new Scene(root, 467,311.6));

   }

}
