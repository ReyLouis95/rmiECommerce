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
	}
	
	public String testConnect() throws RemoteException
	{
		return "Connexion correctement établie";
	}
	
	public void changerMagasin(Magasin m)
	{
		this.magasinActuel = m;
	}
	
	public String listeProduitsMagasin() throws RemoteException//Affiche la liste des produits d'un magasin
	{
		return this.magasinActuel.listeDesProduits();
	}
	
	public void enleverAjouterProduit(String s, boolean b) throws RemoteException //b à true = ajouter, b à false = enlever
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
