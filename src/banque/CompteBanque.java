package banque;

public class CompteBanque {

public Position position;

public CompteBanque(Position position) {
	super();
	this.position = position;
}

public void ajouterSomme(double somme) {
	this.position.solde += somme;
}

public void retirerSomme(double somme) {
	this.position.solde -= somme;
}



}
