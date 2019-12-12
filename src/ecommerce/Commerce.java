package ecommerce;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Commerce extends UnicastRemoteObject implements commerceInterface{
	
	private Magasin magasinActuel;
	private Panier panierActuel;
	
	public Commerce() throws RemoteException
	{
		super();
		this.magasinActuel = new Magasin("Ikea"); //Création d'un magasin dès l'instanciation d'un objet commerce. /!\ A MODIFIER EN FAISANT UNE METHODE QUI CREE UN MAGASIN DANS UNE HASHTABLE DE MAGASINS
	}												// DONT LE CLIENT POURRA CHOISIR SUR QUEL MAGASIN PEUT SE CONNECTER
	
	public String testConnect() throws RemoteException
	{
		return "Connexion correctement établie";
	}
	
	public ArrayList<Produit> listeProduitsMagasin() //Affiche la liste des produits d'un magasin
	{
		return this.magasinActuel.listProduit;
	}
	
	public void enleverAjouterProduit(String s, boolean b) //b à true = ajouter, b à false = enlever
	{
		for(Produit p : magasinActuel.listProduit)
		{
			if(p.nom.equals(s))
			{
				if (b)
					this.panierActuel.addProduit(p);
				else
					this.panierActuel.removeProduit(p);
				break;
			}
		}
	}

}
