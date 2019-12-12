package banque;

import java.io.Serializable;
import java.util.Date;

public class Position implements Serializable{

	public double solde;
	public Date derniereOperation;
	
	public Position(double solde) {
		this.solde = solde;
		this.derniereOperation = new Date();
	}
}
