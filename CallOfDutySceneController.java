/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;


public class CallOfDutySceneController implements Initializable {

    @FXML    private ComboBox<String> weaponTypeComboBox;
    @FXML    private TextField modelTextField;
    @FXML    private TextField priceTextField;
    @FXML    private CheckBox doubleEdgedCheckBox;
    @FXML    private TextField blastRadiusTextField;
    @FXML    private ComboBox<Integer> magCapacityComboBox;
    @FXML    private RadioButton swordRadioButton;
    @FXML    private RadioButton grenadeRadioButton;
    @FXML    private RadioButton pistolRadioButton;
    @FXML    private RadioButton allRadioButton;
    @FXML    private TableView<TableDataClass> weaponInfoTableView;
    @FXML    private TableColumn<TableDataClass, String> weaponInfoTableColumn;

    private ToggleGroup tg;
    ArrayList<Weapon> weaponList;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*
        ObservableList<String> myStrList;
        ArrayList<String> myStrList2 = new ArrayList<String>();
        myStrList2.add("Good");
        myStrList2.add("Buy");
        myStrList = FXCollections.observableArrayList("Hello", "World");
        weaponTypeComboBox.setItems(myStrList);
        */
        weaponTypeComboBox.getItems().addAll("Sword","Grenade","Pistol");
        magCapacityComboBox.getItems().addAll(4,5,6,7,8,9,10);
        tg = new ToggleGroup();
        
        swordRadioButton.setToggleGroup(tg);
        grenadeRadioButton.setToggleGroup(tg);
        pistolRadioButton.setToggleGroup(tg);
        allRadioButton.setToggleGroup(tg);
        
        doubleEdgedCheckBox.setDisable(true);
        blastRadiusTextField.setDisable(true);
        magCapacityComboBox.setDisable(true);
        
        weaponList = new ArrayList<Weapon>();
        
        weaponInfoTableColumn.setCellValueFactory(new PropertyValueFactory<TableDataClass,String>("colVal"));
    }    

    @FXML
    private void weaponTypeComboBoxOnAction(ActionEvent event) {
        
        if( weaponTypeComboBox.getValue().equals("Sword") ){
            doubleEdgedCheckBox.setDisable(false);
            blastRadiusTextField.setDisable(true);
            magCapacityComboBox.setDisable(true);
        }
        else if( weaponTypeComboBox.getValue().equals("Grenade") ){
            doubleEdgedCheckBox.setDisable(true);
            blastRadiusTextField.setDisable(false);
            magCapacityComboBox.setDisable(true);
        } 
        else if( weaponTypeComboBox.getValue().equals("Pistol") ){
            doubleEdgedCheckBox.setDisable(true);
            blastRadiusTextField.setDisable(true);
            magCapacityComboBox.setDisable(false);
        }         
    }

    @FXML
    private void addNewWeaponButtonOnMouseClicked(ActionEvent event) {
        
        if( weaponTypeComboBox.getValue().equals("Sword") ){
            weaponList.add(
                new Sword(
                   doubleEdgedCheckBox.isSelected(),
                   modelTextField.getText(),
                   Float.parseFloat(priceTextField.getText())
                )
            );
        }
        else if( weaponTypeComboBox.getValue().equals("Grenade") ){
            weaponList.add(
                new Grenade(
                   Float.parseFloat(blastRadiusTextField.getText()),
                   modelTextField.getText(),
                   Float.parseFloat(priceTextField.getText())
                )
            );
        } 
        else if( weaponTypeComboBox.getValue().equals("Pistol") ){
            weaponList.add(
                new Pistol(
                   magCapacityComboBox.getValue(),
                   modelTextField.getText(),
                   Float.parseFloat(priceTextField.getText())
                )
            );
        } 
    }

    @FXML
    private void overhaulAllWeaponButtonOnMouseClicked(ActionEvent event) {
        for(Weapon w: weaponList){
            w.overHaul();
        }
        
    }

    @FXML
    private void showWeaponDetailsButtonOnMouseClicked(ActionEvent event) {
        weaponInfoTableView.getItems().clear();
        for(Weapon w: weaponList){
            if(swordRadioButton.isSelected()){
                if(w instanceof Sword){
                    weaponInfoTableView.getItems().add(
                        new TableDataClass(w.toString())
                    );
                } 
            }
            else if(grenadeRadioButton.isSelected()){
                if(w instanceof Grenade){
                    weaponInfoTableView.getItems().add(
                        new TableDataClass(w.toString())
                    );
                }  
            }
            else if(pistolRadioButton.isSelected()){
                if(w instanceof Pistol){
                    weaponInfoTableView.getItems().add(
                        new TableDataClass(w.toString())
                    );
                }  
            }
            else if(allRadioButton.isSelected()){
                weaponInfoTableView.getItems().add(
                    new TableDataClass(w.toString())
                );
            }
        } //end for
    }
    
}
