package ecommerce;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAccueilControleur extends Remote{
	
	public void animation() throws RemoteException;
}
