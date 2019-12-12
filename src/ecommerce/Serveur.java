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
			
			Commerce c = new Commerce();
			Produit p = new Produit(12, "bete");
			Magasin m = new Magasin("Ikea");
			m.ajouterProduit(p);
			
			c.changerMagasin(m);
			
			
			Naming.rebind("rmi://localhost:"+port+"/commerce", c);
			System.out.println("Serveur commerce prêt !");
		}
		catch (Exception e)
		{
			System.out.println("Serveur commerce échec : "  + e);
		}
	}
}
