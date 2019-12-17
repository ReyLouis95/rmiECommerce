package controleurs;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.Magasin;

public class DetailMagasinControleur extends Controleur{
	//permet de savoir quel magasin est concerné
	private Magasin magasin;

	@FXML
	private Label label;
	@FXML
	private ListView listView;
	public DetailMagasinControleur(Magasin magasin){
		this.magasin = magasin;
	}
	@Override
	public void initialize() {
		label.setText(this.magasin.getNom());
	}

}
