package banque;

import java.rmi.Naming;

import convertisseur.ConvInterface;

public class Client {
	public static void main(String[] argv) {
		try {
			String nomService = "banque";
			int port = 8000;
			BanqueInterface obj = (BanqueInterface)Naming.lookup("rmi://localhost:"+port+"/"+nomService);
			obj.creerCompte("1", 1000);
			obj.ajouter("1", 10);
			System.out.println(obj.position("1").solde);
		}catch(Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}
}
