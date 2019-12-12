package ecommerce;

public class Produit {

	public double prix;
	public String nom;
	
	public Produit(double prix, String nom) {
		this.prix = prix;
		this.nom = nom;
	}
	
	public boolean Equals(Produit produit) {
		if(this.nom.equals(produit.nom) && this.prix == produit.prix)
			return true;
		else
			return false;
	}
	
}
