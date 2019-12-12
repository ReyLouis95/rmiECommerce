package convertisseur;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
public static void main(String[] argv) {
	try {
		int port = 8000;
		String nomService = "convertisseur";
		LocateRegistry.createRegistry(port);
		Naming.rebind("rmi://localhost:"+port+"/"+nomService, new ConvImpl());
		System.out.println("Hello Server Prêt");
	}catch(Exception e)  {
		System.out.println("Hello Serveur Echec " + e);
	}
}
}
