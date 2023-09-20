package paquete_inicial;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class pri extends Application{

	@Override
	public void start(Stage stage) {
		
		// Creacion componentes
		HBox datos = new HBox();
		HBox resultado = new HBox();
		VBox vb = new VBox();
		TextField nombre = new TextField();
		Text enunciado = new Text("Introduce tu nombre ");
		Text respuesta = new Text();
		Button salir = new Button("SALIR");
		Button aceptar = new Button("ACEPTAR");
		
		// Insertar componentes en contenedores
		datos.getChildren().addAll(enunciado,nombre,aceptar);
		resultado.getChildren().add(respuesta);
		vb.getChildren().addAll(datos,resultado,salir);
		
		// Visualizar ventana
		Scene ventana = new Scene(vb,200,100);
		stage.setTitle("Obi Wan");
		stage.setScene(ventana);
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
