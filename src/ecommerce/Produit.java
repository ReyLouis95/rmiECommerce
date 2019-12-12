package ecommerce;

import java.io.Serializable;

public class Produit implements Serializable{

	public double prix;
	public String nom;
	
	public Produit(double prix, String nom) {
		this.prix = prix;
		this.nom = nom;
	}
	
	/**
	 * compare deux objets produits
	 * @param produit: produit a comparer
	 * @return true si les deux produits sont identiques, sinon false.
	 */
	public boolean Equals(Produit produit) {
		if(this.nom.equals(produit.nom) && this.prix == produit.prix)
			return true;
		else
			return false;
	}
	
}
