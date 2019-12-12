package banque;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RemoteServer;

public class Serveur{

	public static void main(String[] argv){
		try {
			int port = 8000;
			String nomService = "banque";
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:"+port+"/"+nomService, new BanqueImpl());
			System.out.println("Hello Server Prêt");
			while(true) {
				try {
				    System.out.println("b"+RemoteServer.getClientHost()+ "a"); // display message
				}catch(Exception e) {System.out.println(e);
				}
			}
		}catch(Exception e)  {
			System.out.println("Hello Serveur Echec " + e);
		}
	}
}
