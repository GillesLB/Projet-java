package co.simplon.listeobjets;

public class Colissimo extends Colis implements Suivi, Urgent {

	public Colissimo(int numRef, String nom, double prix, int qtiteStock) {
		super(numRef, nom, prix, qtiteStock);
		urgent();
		suivi();
	}

	@Override
	public void urgent() {
		System.out.println(getNom() + " est au tarif urgent (J + 2)");
		
	}

	@Override
	public void suivi() {
		System.out.println(getNom() + " est au suivi, avec une traçabilité de son trajet");
		
	}

}
