package controleurs;

import java.io.Serializable;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ResourceBundle;

import ecommerce.IAccueilControleur;
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


public class Start extends Application implements IAccueilControleur, Serializable{

	@FXML
	private Label label1;
	@FXML
	private ListView<String> list;
	@Override
	public void animation() throws RemoteException {
		// TODO Auto-generated method stub
		launch(); 
	}
	
	//private ObservableList<String> listO = FXCollections.observableArrayList();

	@Override
	public void start(Stage primaryStage) throws Exception {
		//on selectionne une vue
	    URL fxmlURL = getClass().getResource("../vues/AccueilClient.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
		//on attache un controleur a la vue
		fxmlLoader.setController(this);
		Node root = fxmlLoader.load();
		Scene scene = new Scene((Pane) root, 600, 400);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Application Comptable");
		primaryStage.show();
		}

	@FXML
	public void initialize() {
		Magasin m = new Magasin("IKEA");
		label1.setText(m.getNom());
		/*listO.add("IKEA");
		list.setItems(listO);*/
	}

}

