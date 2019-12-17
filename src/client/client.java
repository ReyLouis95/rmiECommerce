package client;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ecommerce.IStart;


public class client {
	public static void main (String[] argv) {
		try
		{
			int port = 8000;
			IStart objCommerce = (IStart)Naming.lookup("rmi://localhost:"+port+"/commerce");
			objCommerce.animation();
		}
		catch (Exception e)
		{
			System.out.println("CommerceClient exception : " + e);
		}
	}
	}