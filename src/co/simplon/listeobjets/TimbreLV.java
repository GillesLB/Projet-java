package co.simplon.listeobjets;

public class TimbreLV extends Timbre implements Economique, Simple {

	public TimbreLV(int numRef, String nom, double prix, int qtiteStock) {
		super(numRef, nom, prix, qtiteStock);
		simple();
		economique();
	}

	@Override
	public void simple() {
		System.out.println(getNom() + " est sans traçabilité, car non suivi");
		
	}

	@Override
	public void economique() {
		System.out.println(getNom() + " est au tarif eco (J + 2)");
		
	}
}
