package convertisseur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConvInterface extends Remote{
	
public double Convertir(double celsius) throws RemoteException;
}
