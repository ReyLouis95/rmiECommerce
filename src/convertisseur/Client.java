package convertisseur;
import java.rmi.*;
import java.rmi.server.*;

public class Client {
	public static void main(String[] argv) {
		try {
			String nomService = "convertisseur";
			int port = 8000;
			ConvInterface obj = (ConvInterface)Naming.lookup("rmi://localhost:"+port+"/"+nomService);
			System.out.println(obj.Convertir(120.0));
		}catch(Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}
}
