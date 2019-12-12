package ecommerce;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface commerceInterface extends Remote{
	
	String testConnect() throws RemoteException;
	ArrayList<Produit> listeProduitsMagasin() throws RemoteException;
	void enleverAjouterProduit(String s, boolean b) throws RemoteException;
}
