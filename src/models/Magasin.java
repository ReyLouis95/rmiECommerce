package models;

import java.io.Serializable;
import java.util.ArrayList;

public class Magasin implements Serializable{

	private ArrayList<Produit> listProduit;
	private String nom;
	private String description;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Magasin(String nom)
	{
		this.nom = nom;
		this.listProduit = new ArrayList<Produit>();
	}
	public ArrayList<Produit> getListProduit() {
		return listProduit;
	}
	public void setListProduit(ArrayList<Produit> listProduit) {
		this.listProduit = listProduit;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
