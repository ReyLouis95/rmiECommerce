package calculateur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculateurImpl extends UnicastRemoteObject implements CalculateurInterface {

	protected CalculateurImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double add(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double sub(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double mul(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double div(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a / b;
	}

}
