package dk.javahandson;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TextField edtUpdate;
    @FXML
    private TextField edtInsert;
    @FXML
    private TableView<Person> tblPersons;
    @FXML
    private TableColumn colName;

    @FXML
    private Label lbl;

    private MainModel model = new MainModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tblPersons.setItems(model.getNames()); // Binds the list with the model
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
    }

    @FXML
    private void clickBtn(ActionEvent actionEvent) {
        lbl.setText("It's ALLLIIIVE!");
        model.loadFromDB();

    }

    @FXML
    private void clickDelete(ActionEvent actionEvent) {
        Person selected = tblPersons.getSelectionModel().getSelectedItem();
        model.delete(selected);
    }

    @FXML
    private void clickUpdate(ActionEvent actionEvent) {
        Person selected = tblPersons.getSelectionModel().getSelectedItem();
        selected.setName(edtUpdate.getText());
    }

    @FXML
    private void clickInsert(ActionEvent actionEvent) {
        Person p = new Person(edtInsert.getText());
        model.add(p);
    }
}
