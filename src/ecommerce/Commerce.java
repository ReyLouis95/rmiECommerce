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
		return "Connexion correctement �tablie";
	}
	
	public String connectToMagasin()
	{
		this.magasinActuel = new Magasin("Ikea");
		
		return "Connexion r�ussie";
	}
	
	public ArrayList<Produit> listeProduitsMagasin()
	{
		return this.magasinActuel.produit;
	}
	
	public void eneleverAjouterProduit(String s, boolean b) //b � true = ajouter, b � false = enlever
	{
		for(Produit p : magasinActuel.produit)
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
