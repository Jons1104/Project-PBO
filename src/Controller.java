import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


public class Controller {    
    @FXML
    private Label judul;

    @FXML
    private TextField nama;

    @FXML
    private TextField nim;

    @FXML
    private RadioButton matematika;

    @FXML
    private RadioButton sistemInformasi;

    @FXML
    private RadioButton ilmuAktuaria;

    @FXML
    private RadioButton pbo;

    @FXML
    private RadioButton matdasII;

    @FXML
    private RadioButton metstat;

    @FXML
    private RadioButton hadir;

    @FXML
    private RadioButton izin;

    @FXML
    private RadioButton sakit;

    @FXML
    private Button simpan;

    @FXML
    void simpanHandler(ActionEvent event) {
       if (hadir.isSelected()) {
           test.setText(nama.getText() + " (" + nim.getText() + ") : Hadir");
       }
       else if (izin.isSelected()) {
           test.setText(nama.getText() + " (" + nim.getText() + ") : Izin");
       }
       else {
           test.setText(nama.getText() + " (" + nim.getText() + ") : Sakit");
       }
    }

    @FXML
    private Label test;
}