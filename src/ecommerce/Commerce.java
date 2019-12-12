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
		this.magasinActuel = new Magasin("Ikea"); //Cr�ation d'un magasin d�s l'instanciation d'un objet commerce. /!\ A MODIFIER EN FAISANT UNE METHODE QUI CREE UN MAGASIN DANS UNE HASHTABLE DE MAGASINS
	}												// DONT LE CLIENT POURRA CHOISIR SUR QUEL MAGASIN PEUT SE CONNECTER
	
	public String testConnect() throws RemoteException
	{
		return "Connexion correctement �tablie";
	}
	
	public ArrayList<Produit> listeProduitsMagasin() //Affiche la liste des produits d'un magasin
	{
		return this.magasinActuel.listProduit;
	}
	
	public void enleverAjouterProduit(String s, boolean b) //b � true = ajouter, b � false = enlever
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
