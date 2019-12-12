package calculateur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {

	public static void main(String[] argv) {
		try {
			int port = 8000;
			String nomService = "calculateur";
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:"+port+"/"+nomService, new CalculateurImpl());
			System.out.println("Hello Server Pr�t");
		}catch(Exception e)  {
			System.out.println("Hello Serveur Echec " + e);
		}
	}
}
