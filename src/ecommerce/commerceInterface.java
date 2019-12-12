package ecommerce;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface commerceInterface extends Remote{
	
	String testConnect() throws RemoteException;
	ArrayList<Produit> listeProduitsMagasin();
	void enleverAjouterProduit(String s, boolean b);
}
