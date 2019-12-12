package ecommerce;

import java.rmi.Naming;

public class client {
	public static void main (String[] argv)
	{
		try 
		{
			int port = 8000;
			commerceInterface objCommerce = (commerceInterface)Naming.lookup("rmi://localhost:"+port+"/commerce");
			
			objCommerce.testConnect();
			System.out.println(objCommerce.listeProduitsMagasin());
		}
		
		catch (Exception e)
		{
			System.out.println("CommerceClient exception : " + e);
		}
	}
}