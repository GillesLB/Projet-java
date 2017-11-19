package co.simplon.listeobjets;

public class LettrePAP extends Lettre implements Simple, Urgent, Economique {

	public LettrePAP(int numRef, String nom, double prix, int qtiteStock) {
		super(numRef, nom, prix, qtiteStock);
		economique();
		urgent();
		simple();
	}

	@Override
	public void economique() {
		System.out.println(getNom() + " est au tarif eco (J + 2)");
		
	}

	@Override
	public void urgent() {
		System.out.println(getNom() + " est au tarif urgent (J + 1)");
		
	}

	@Override
	public void simple() {
		System.out.println(getNom() + " est sans traçabilité, car non suivi");
		
	}
}
