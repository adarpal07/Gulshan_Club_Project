package mid.gulshan_club.HR_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mid.gulshan_club.AppendableObjectOutputStream;
import mid.gulshan_club.HR_Manager.Model.PurchaseOrder;
import mid.gulshan_club.HR_Manager.Model.UserRegistration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PurchaseOrderController
{
    @javafx.fxml.FXML
    private TextField itemNameTextField;
    @javafx.fxml.FXML
    private DatePicker deliveryDateDatePicker;
    @javafx.fxml.FXML
    private TextField itemQuantityTextField;
    @javafx.fxml.FXML
    private TextField itemDescriptionTextField;
    @javafx.fxml.FXML
    private TextArea deliveryLocationTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    ArrayList<PurchaseOrder> purchaseList = new ArrayList<PurchaseOrder>();

    @javafx.fxml.FXML
    public void requestPurchaseOrderButtonOnAction(ActionEvent actionEvent) {
        PurchaseOrder pO = new PurchaseOrder(
                itemNameTextField.getText(),
                itemDescriptionTextField.getText(),
                itemQuantityTextField.getText(),
                deliveryLocationTextArea.getText(),
                deliveryDateDatePicker.getValue()
        );

        itemNameTextField.clear();
        itemDescriptionTextField.clear();
        itemQuantityTextField.clear();
        deliveryLocationTextArea.clear();

        ObjectOutputStream oos = null;

        try{
            File objectFile = new File("PurchaseOrderObjects.bin");
            FileOutputStream fosObject = null;
            if (objectFile.exists()){
                fosObject = new FileOutputStream(objectFile,true);
                oos = new AppendableObjectOutputStream(fosObject);
            }
            else{
                fosObject = new FileOutputStream(objectFile);
                oos = new ObjectOutputStream(fosObject);
            }


            oos.writeObject(pO);
            oos.close();

        }
        catch (Exception e){

        }


    }
}