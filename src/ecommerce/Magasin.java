package ecommerce;

import java.util.ArrayList;

public class Magasin {

	public ArrayList<Produit> listProduit;
	public String nom;
	
	public Magasin(ArrayList<Produit> listProduit, String nom)
	{
		this.listProduit = listProduit;
		this.nom = nom;
	}
	
	public void ajouterProduit(Produit produit) {
		this.listProduit.add(produit);
	}
	
	public void retirerProduit(Produit produitAEnlever) {
		for(Produit produit: listProduit) {
			if(produit.Equals(produitAEnlever))
				this.listProduit.remove(produit);
		}
	}
}
