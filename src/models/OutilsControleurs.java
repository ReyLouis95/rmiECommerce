package models;


import java.io.IOException;
import java.net.URL;

import controleurs.Controleur;
import controleurs.DetailMagasinControleur;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class OutilsControleurs {

	/**
	 * change la scene qui est affichée a l'utilisateur
	 * @param ancienneVue: scene qui se ferme
	 * @param nouvelleVue: scene qui s'affiche
	 * @param titre: titre de nouvelleVue
	 * @param controleur: controleur qu'on attache à nouvelleVue
	 * @throws IOException
	 */
public static void changeScene(Stage ancienneVue, URL nouvelleVue, String titre, Controleur controleur) throws IOException{
	Stage stage = new Stage();
	ancienneVue.close();
	nouvelleVue = OutilsControleurs.class.getResource("../vues/DetailMagasin.fxml");
	FXMLLoader fxmlLoader = new FXMLLoader(nouvelleVue);
	//on attache un controleur a la vue
	fxmlLoader.setController(controleur);
	Node root = fxmlLoader.load();
	Scene scene = new Scene((Pane) root, 600, 400);
	//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	stage.setScene(scene);
	stage.setTitle(titre);
	stage.show();
}
}
