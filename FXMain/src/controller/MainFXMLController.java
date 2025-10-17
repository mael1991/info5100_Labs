/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import com.sun.net.httpserver.Headers;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.User;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MainFXMLController implements Initializable {
@FXML
TextField nameTextField;

@FXML
TextField ageTextField;

@FXML
TextField emailTextField;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    public void submit(){
        try {
            String Name;
            int Age;
            String Email;
            
            Name = this.nameTextField.getText();
            Age = Integer.parseInt(this.ageTextField.getText());
            Email = this.emailTextField.getText();
            
             // check name validity
        if (Name.isBlank()){
             showErrorAlert("Invalid name provided!");
             return;
        }
        if (Age < 18){  
             showErrorAlert("Invalid age provided!");
             return;
        }
        
        if (Email == null || !Email.matches("^[\\w\\-\\.]+@([\\w\\-]+\\.)+[\\w\\-]{2,4}$")) {
                showErrorAlert("Invalid email provided!");
                return;
        }
        
        User user = new User(Name, Age, Email);
            showSuccessAlert(user.toString());
            
        } catch (NumberFormatException e) {
            showErrorAlert("In valide name provided, Please provide a valid name");
             } catch (Exception e) {
            showErrorAlert("Unexpected error: " + e.getMessage());
        
        }
        
    }
    
    public void showErrorAlert(String message){
        showAlert(message, Alert.AlertType.ERROR, "Ooops!");
    }
    
     public void showSuccessAlert(String message){
        showAlert(message, Alert.AlertType.INFORMATION, "Ooops!");
     }
    public void showAlert(String message, Alert.AlertType alertType, String headerText){
        Alert alert = new Alert(alertType);
        alert.setContentText(message);
        alert.setHeaderText(message);
        alert.showAndWait();
        
    }
}
