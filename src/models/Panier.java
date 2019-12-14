package models;

import java.util.ArrayList;

public class Panier {
	
	private ArrayList<Produit> listeProduits;
	
	public Panier()
	{
		
	}
	
	public void addProduit(Produit p)
	{
		this.listeProduits.add(p);
	}
	
	public void removeProduit(Produit p)
	{
		this.listeProduits.add(p);
	}
	
	public ArrayList<Produit> afficherPanier()
	{
		return this.listeProduits;
	}
	
	public void deletePanier()
	{
		this.listeProduits.clear();
	}

}
