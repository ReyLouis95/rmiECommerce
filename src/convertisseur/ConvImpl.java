package convertisseur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConvImpl extends UnicastRemoteObject implements ConvInterface{

	public ConvImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Convertir(double farenheit) {
		return (0.55)*(farenheit-32);
	}

}
