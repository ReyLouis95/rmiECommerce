package ecommerce;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

import rmi.Compte;

public class Commerce extends UnicastRemoteObject implements commerceInterface{
	
	private Magasin magasinActuel;
	
	public Commerce() throws RemoteException
	{
		super();
	}
	
	public String testConnect() throws RemoteException
	{
		return "Connexion correctement établie";
	}

}
