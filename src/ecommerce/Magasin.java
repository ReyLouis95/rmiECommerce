package ecommerce;

import java.util.ArrayList;

public class Magasin {

	public ArrayList<Produit> produit;
	public String nom;
	
	public Magasin(ArrayList<Produit> produit, String nom)
	{
		this.produit = produit;
		this.nom = nom;
	}
}
