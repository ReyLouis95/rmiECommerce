package ecommerce;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class client {
	public static void main (String[] argv) {
		try 
		{
			int port = 8000;
			Hello objCommerce = (Hello)Naming.lookup("rmi://localhost:"+port+"/commerce");
			
			objCommerce.animation();
			
		}
		
		catch (Exception e)
		{
			System.out.println("CommerceClient exception : " + e);
		}
	}
	}