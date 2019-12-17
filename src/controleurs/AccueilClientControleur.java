package controleurs;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.Magasin;
import models.OutilsControleurs;

public class AccueilClientControleur extends Controleur{

	@FXML
	private ListView<Magasin> listView;
	@FXML
	private Label labelDescription;
	@FXML
	private Button button;

	private ObservableList<Magasin> a = FXCollections.observableArrayList();
	private ListView<Magasin> b = new ListView<Magasin>();

	//fonction qui s'execute au lancement du client
	@FXML
	public void initialize() {
		Magasin m = new Magasin("IKEA");
		Magasin m1 = new Magasin("Decathlon");
		m.setDescription("Magasin de meubles");
		m1.setDescription("Magasin de sport");
		a.add(m);
		a.add(m1);
		listView.setItems(a);
		//fonction qui permet d'afficher seulement le nom des magasins dans la liste
		listView.setCellFactory(param ->new ListCell<Magasin>() {
	        @Override
	        protected void updateItem(Magasin p, boolean empty){
	        super.updateItem(p, empty);
	            if(empty || p == null || p.getNom() == null){
	                setText("");
	            }
	            else{
	                setText(p.getNom());
	            }

	        }
	    });
}

	//clic sur le bouton valider
	public void onClickButton(ActionEvent event) throws IOException{
		Stage actualStage = (Stage)button.getScene().getWindow();
		String magasin ="";
	    URL fxmlURL = getClass().getResource("../vues/DetailMagasin.fxml");
		OutilsControleurs.changeScene(actualStage, fxmlURL, "Details", new DetailMagasinControleur(listView.getSelectionModel().getSelectedItem()));
	}

	//Clic sur un des items de la liste
	public void onClickList(MouseEvent event){
		labelDescription.setText(listView.getSelectionModel().getSelectedItem().getDescription());
	}
}
