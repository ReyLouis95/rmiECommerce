package ecommerce;

import java.io.Serializable;
import java.util.ArrayList;

public class Magasin implements Serializable{

	public ArrayList<Produit> listProduit;
	public String nom;
	
	public Magasin(String nom)
	{
		this.nom = nom;
		this.listProduit = new ArrayList<Produit>();
	}
	/**
	 * ajoute un produit dans la liste de Produit
	 * @param produit: produit a ajouter a la liste
	 */
	public void ajouterProduit(Produit produit) {
		this.listProduit.add(produit);
	}
	
	public String listeDesProduits()
	{
		String t = "";
		for(Produit p : listProduit)
		{
			t = t + "Nom du produit : " + p.nom + "\nprix du produit : " + p.prix + "\n\n";
		}
		return t;
	}
	/**
	 * retire un produit dans la liste de Produit
	 * @param produitAEnlever: produit a retirer de la liste
	 */
	public void retirerProduit(Produit produitAEnlever) {
		for(Produit produit: listProduit) {
			if(produit.Equals(produitAEnlever))
				this.listProduit.remove(produit);
		}
	}
}
