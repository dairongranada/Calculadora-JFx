import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;


public class calculatorcontroller {    

    private String numero1;
    private String operador;

    

    @FXML 
    private Button btnc;

    @FXML 
    private Button btnb;

    @FXML 
    private Button btnporcentaje ;

    @FXML 
    private Button btnslash;

    @FXML 
    private Button btn7;

    @FXML 
    private Button btn8;

    @FXML 
    private Button btn9;

    @FXML 
    private Button btnx;

    @FXML 
    private Button btn4;

    @FXML 
    private Button btn5;

    @FXML 
    private Button btn6;

    @FXML 
    private Button btn1;

    @FXML 
    private Button btn2;

    @FXML 
    private Button btn3;

    @FXML 
    private Button btnmas;

    @FXML 
    private Button btnigual;

    @FXML 
    private Button btnmasandmenos;

    @FXML 
    private Button btn0;

    @FXML 
    private Button btnPunto;


    @FXML
    private TextField result;


    @FXML
    void elMouseEntro(MouseEvent event) {
        //notificar algo que paso
        //manejador de rutina que asocia la notificacion
        //source quien origino el evento
        //Target a quien va dirigido el evento
        //system.out.println("Focus Leave")
        ((Button)event.getSource()).setEffect(new DropShadow());

    }

    @FXML
    void elMouseFue(MouseEvent event){
        ((Button)event.getSource()).setEffect((null));
    }

    @FXML
    void seDioClick(MouseEvent event){
        String tecla = ((Button)event.getSource()).getText();
        String display = result.getText();
        if (tecla.equalsIgnoreCase("C")) {
            result.setText("");
        }else if (tecla.equalsIgnoreCase("B") && !display.isEmpty()) {
            display = display.substring(0, display.length() -1);
            result.setText(display);
        }else if ("0123456789".indexOf(tecla)!=-1){
            result.setText(display+tecla);
        }else if ("+-*/".indexOf(tecla)!= -1) {
            numero1 = display;
            operador = tecla;
            result.setText("");
            //operaciones(true);
        }

        else if(tecla.equalsIgnoreCase("0") && !display.isEmpty()){
            if (numero1.isEmpty()) {
                numero1 = display;
            }
        }else {
            switch (operador) {
                case "+":
                    display = Double.toString(Double.parseDouble(numero1) + Double.parseDouble(display));
                    break;
                case "-":
                    display = Double.toString(Double.parseDouble(numero1) - Double.parseDouble(display));
                    break;
                case "*":
                    display = Double.toString(Double.parseDouble(numero1) * Double.parseDouble(display));
                    break;
                case "/":
                    display = Double.toString(Double.parseDouble(numero1) / Double.parseDouble(display));
                    break;
            }

            result.setText(display);
        }
    }
}