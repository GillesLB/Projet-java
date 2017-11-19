package co.simplon.listeobjets;

public class Colieco extends Colis implements Suivi, Economique {

	public Colieco(int numRef, String nom, double prix, int qtiteStock) {
		super(numRef, nom, prix, qtiteStock);
		economique();
		suivi();
	}

	@Override
	public void economique() {
		System.out.println(getNom() + " est au tarif eco (J + 4)");
		
	}

	@Override
	public void suivi() {
		System.out.println(getNom() + " est au suivi, avec une traçabilité de son trajet");
		
	}

}
