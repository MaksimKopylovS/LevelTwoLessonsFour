package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextArea textArea;

    @FXML
     private TextField textField;

    @FXML
    private Button btn;

    @FXML
    void btnClick(ActionEvent event){
        textArea.appendText(textField.getText() +"\n");
        textField.clear();
    }

    @FXML
    // Метод initialize испеользуется для обрабоки клмпонентов указанных в fxml
    public void initialize(){
        btn.setDefaultButton(true);
        btn.setStyle("-fx-font: bold italic 10pt Helvetica;");
        textArea.setEditable(false);
        textArea.setStyle("-fx-font: bold italic 12pt Arial;-fx-text-fill: #2f4c58;" +
                        "-fx-background-color: #00BFFF;" +
                        " -fx-border-width: 3px;" +
                        " -fx-border-radius: 30;" +
                        " -fx-control-inner-background: #e0e0e0;");
        textField.setStyle("-fx-font: bold italic 10pt Helvetica; -fx-background-color: #ffff;");
    }

}
