package ecommerce;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
	public static void main (String [] argv)
	{
		try
		{
			int port = 8000;
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:"+port+"/commerce", new Commerce());
			System.out.println("Serveur commerce prêt !");
		}
		catch (Exception e)
		{
			System.out.println("Serveur commerce échec : "  + e);
		}
	}
}
