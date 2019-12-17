package ecommerce;

import java.io.Serializable;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ResourceBundle;

import controleurs.AccueilClientControleur;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.Commerce;
import models.Magasin;
import models.Produit;


public class Start extends Application implements IStart, Serializable{


	@FXML
	private ListView<String> list;
	@Override
	public void animation() throws RemoteException {
		// TODO Auto-generated method stub
		launch();
	}
	//Ce main sert juste a faire des tests en local(les exceptions sont plus precises quand on lance cette classe)
	public static void main (String [] argv){
		launch();
	}
	//lance la premiere interface quand le client se connecte
	@Override
	public void start(Stage primaryStage) throws Exception {
		AccueilClientControleur controleur = new AccueilClientControleur();
		//on selectionne une vue
	    URL fxmlURL = getClass().getResource("../vues/AccueilClient.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
		//on attache un controleur a la vue
		fxmlLoader.setController(controleur);
		Node root = fxmlLoader.load();
		Scene scene = new Scene((Pane) root, 600, 400);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Application Comptable");
		primaryStage.show();
		}

	}


