/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package view;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class FXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root;
        System.out.println("Before root creation");
        
        root = FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
        System.out.println("After root creation");
        
        Scene scene = new Scene(root, 600, 400);
        
        primaryStage.setTitle("Personal Information Form!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
