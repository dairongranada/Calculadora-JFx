
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;


public class App extends Application{

    @Override
    public void start(Stage PrimaryStage) throws Exception {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CALCULADORA.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            PrimaryStage.setScene(scene);
            PrimaryStage.show();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}


