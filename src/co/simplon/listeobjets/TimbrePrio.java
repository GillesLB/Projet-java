package co.simplon.listeobjets;

public class TimbrePrio extends Timbre implements Urgent, Simple {

	public TimbrePrio(int numRef, String nom, double prix, int qtiteStock) {
		super(numRef, nom, prix, qtiteStock);
		simple();
		urgent();
	}

	@Override
	public void simple() {
		System.out.println(getNom() + " est sans traçabilité, car non suivi");
			
		}
		

	@Override
	public void urgent() {
		System.out.println(getNom() + " est au tarif urgent (J + 1)");
		
	}

}
