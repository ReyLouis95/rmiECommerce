package calculateur;

import java.rmi.Naming;

import convertisseur.ConvInterface;

public class Client {
	public static void main(String[] argv) {
		try {
			String nomService = "calculateur";
			int port = 8000;
			CalculateurInterface obj = (CalculateurInterface)Naming.lookup("rmi://localhost:"+port+"/"+nomService);
			System.out.println(" 1 + 1 = " + obj.add(1, 1));
			System.out.println(" 1 - 1 = " + obj.sub(1, 1));
			System.out.println(" 4 * 4 = " + obj.mul(4, 4));
			System.out.println(" 10 / 5 = " + obj.div(10, 5));
		}catch(Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}
}
