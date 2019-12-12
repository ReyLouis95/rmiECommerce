package rmi;

import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface{

	public HelloImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String echo() throws RemoteException {
		return "Hello World";
	}

}
