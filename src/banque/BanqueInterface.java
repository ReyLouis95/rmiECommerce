package banque;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Hashtable;

public interface BanqueInterface extends Remote {
	public void creerCompte(String id, double sommeInitiale) throws RemoteException;
	public void ajouter(String id, double somme) throws RemoteException;
	public void retirer(String id, double somme) throws RemoteException;
	public Position position (String id) throws RemoteException;
}
