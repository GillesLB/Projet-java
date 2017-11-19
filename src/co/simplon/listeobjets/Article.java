package co.simplon.listeobjets;

public class Article {

		private int numRef;
		private String nom;
		private double prix;
		private int qtiteStock;
		
		public int getNumRef() {
			return numRef;
		}
		public void setNumRef(int numRef) {
			this.numRef = numRef;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public double getPrix() {
			return prix;
		}
		public void setPrix(double prix) {
			this.prix = prix;
		}
		public int getQtiteStock() {
			return qtiteStock;
		}
		public void setQtiteStock(int qtiteStock) {
			this.qtiteStock = qtiteStock;
		}
		
		public Article(int numRef, String nom, double prix, int qtiteStock) {
			this.numRef = numRef;
			this.nom = nom;
			this.prix = prix;
			this.qtiteStock = qtiteStock;
		}
		
	}
