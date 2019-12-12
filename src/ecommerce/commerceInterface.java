package ecommerce;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface commerceInterface extends Remote{
	
	String testConnect() throws RemoteException;

}
