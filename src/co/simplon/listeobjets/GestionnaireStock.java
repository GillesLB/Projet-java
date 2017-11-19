package co.simplon.listeobjets;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionnaireStock {
	
	Scanner input = new Scanner(System.in);
	ArrayList<Article> stock = null;
	
	public ArrayList<Article> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Article> stock) {
		this.stock = stock;
	}

	// choix 1
	public void trouverParRef() {
		System.out.println("Entrez la référence de l'objet (4 chiffres) :");
		int ref = input.nextInt();
		while (ref < 0000 || ref > 9999) {
			System.out.println("Erreur dans la référence : recommencez !");
			ref = input.nextInt();
		}
		for (int i = 0; i < stock.size(); i++) {
			if (ref == stock.get(i).getNumRef()) {
				System.out.println("Voici l'objet : " + stock.get(i).getNom());
			} 
		}
	}
	
	// choix 2
	public void trouverParNom() {
		System.out.println("Entrez le nom de l'objet : ");
		String ref = input.nextLine();
			for (int i = 0; i < stock.size(); i++) {
				if (ref == stock.get(i).getNom()) {
					System.out.println("Voici l'objet : " + stock.get(i).getNom());
				} else {
					System.out.println("Objet non trouvé dans le stock");
				}
			}
	}
	
	// choix 3
	public void trouverParIntervalle() {
		
		System.out.println("Entrez le prix minimun : ");
		int min = input.nextInt();
		System.out.println("Entrez le prix maximun : ");
		int max = input.nextInt();
		
		while (min < 0 || max < 0 || max < min) {
			System.out.println("Erreur dans les prix : recommencez !");
			System.out.println("Entrez le prix minimun : ");
			min = input.nextInt();
			System.out.println("Entrez le prix maximun : ");
			max = input.nextInt();
		}
		for (int i = 0; i < stock.size(); i++) {
			if (stock.get(i).getPrix() < max && stock.get(i).getPrix() > min) {
				System.out.println("Voici " + stock.get(i).getNom() + " à " + stock.get(i).getPrix() + " €");
			} 
		}
	}
	
	// choix 4
	public void ajouterAuStock() {
		
		System.out.println("Entrez la référence de l'objet à ajouter (4 chiffres) :");
		int ref = input.nextInt();
		int qtite = 0;
		while (ref < 0000 || ref > 9999) {
			System.out.println("Erreur dans la référence !");
			ref = input.nextInt();
		}
		for (int i = 0; i < stock.size(); i++) {
			System.out.println("Entrez le nombre d'articles à ajouter :");
			qtite = input.nextInt();
			if (ref == stock.get(i).getNumRef()) {
				stock.get(i).getQtiteStock() = stock.get(i).getQtiteStock() + qtite;
				System.out.println(qtite + " exemplaire(s) de cet objet a été ajouté au stock");
			} else {
				System.out.println("Objet non trouvé dans le stock");
			}
		}
	}
	
	// choix 5
	public void supprimerDuStockParRef() {
		
		System.out.println("Entrez la référence de l'objet à supprimer (4 chiffres) :");
		int ref = input.nextInt();
		while (ref < 0000 || ref > 9999) {
			System.out.println("Erreur dans la référence : recommencez !");
			ref = input.nextInt();
		}
		for (int i = 0; i < stock.size(); i++) {
			if (ref == stock.get(i).getNumRef()) {
				stock.get(i).getQtiteStock() = stock.get(i).getQtiteStock() - 1;
			}
			if (stock.get(i).getQtiteStock() == 0) {
				stock.remove(i);					
				System.out.println("Cet objet a été supprimé du stock");
			} else {
				System.out.println("1 exemplaire de cet objet a été retiré du stock : reste " + stock.get(i).getQtiteStock());
			}
		}
	}		
	
	// choix 6
	public void supprimerDuStockParNom() {
		
		System.out.println("Entrez le nom de l'objet à supprimer :");
		String ref = input.nextLine();
		for (int i = 0; i < stock.size(); i++) {
			if (ref == stock.get(i).getNom()) {
				stock.remove(i);
				System.out.println("L'objet " + stock.get(i).getNom() + " a été retiré du stock.");
			} 
		}
	}
	
	// choix 7
	public void toutAfficher() {
		for (int i = 0; i < stock.size(); i++) {
			System.out.print("On a " + stock.get(i).getQtiteStock() + " exemplaire(s) de " + stock.get(i).getNom() + " dans le stock ! ");
			System.out.println("Cet article est vendu " + stock.get(i).getPrix() + " € l'unité.");
			}
		}
}