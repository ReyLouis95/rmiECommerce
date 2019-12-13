package ecommerce;

import java.io.Serializable;
import java.net.URL;
import java.rmi.RemoteException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class FXSample extends Application implements Hello, Serializable{

	@Override
	public void animation() throws RemoteException {
		// TODO Auto-generated method stub
		launch(); 
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	      	URL fxmlURL = getClass().getResource("../vues/AccueilClient.fxml");
			FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
			Node root = fxmlLoader.load();
			Scene scene = new Scene((Pane) root, 600, 400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Application Comptable");
			primaryStage.show();
	   }  
	}

