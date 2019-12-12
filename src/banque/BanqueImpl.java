package banque;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

public class BanqueImpl extends UnicastRemoteObject implements BanqueInterface{

	protected BanqueImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hashtable<String, CompteBanque> liste = new Hashtable<String, CompteBanque>();
	@Override
	public void creerCompte(String id, double sommeInitiale) throws RemoteException {
		liste.put(id, new  CompteBanque(new Position(1000)));
	}

	@Override 
	public void ajouter(String id, double somme) throws RemoteException {
		CompteBanque a = liste.get(id);
		a.ajouterSomme(somme);
	}

	@Override
	public void retirer(String id, double somme) throws RemoteException {
		CompteBanque a = liste.get(id);
		a.retirerSomme(somme);
	}

	@Override
	public Position position(String id) throws RemoteException {
		return liste.get(id).position;
	}

}
