package application;
 
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class MyController implements Initializable {
 
	@FXML
	private TextField myTextField1;
	
	@FXML
	private Text Error;
	
	String a = "there";
	String b = "0";
	
	
   @Override
   public void initialize(URL location, ResourceBundle resources) {
 
       // TODO (don't really need to do anything here).
      
   }
 

   public void showtheansewer(ActionEvent event) {
    
        
         a = String.valueOf(myTextField1.getText());
         b = "0" + String.valueOf(myTextField1.getText());
      	       
        if (b=="0"){
            
            Error.setText(String.valueOf("Hello there"));
        }
        else{
       	Error.setText(String.valueOf("Hello " + a));
        }
            
        }
      
   }
  
