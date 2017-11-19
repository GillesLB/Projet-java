package co.simplon.listeobjets;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double valeurStock = 0;
		
		// création des objets
		Article timbrePrio 	 = new TimbrePrio(1234, "Timbre Prioritaire", 0.85, 100);
		Article timbreLV 	 = new TimbreLV  (6108, "Timbre Lettre Verte", 0.73, 250);
		Article timbreEco	 = new TimbreEco (3942, "Timbre Economique", 0.70, 120);
		Article lettrePAP    = new LettrePAP (2017, "Lettre Pret à Poster", 1.33, 50);
		Article lettreSansAR = new LettreSAR (1975, "Lettre recommandée sans AR", 3.95, 80);
		Article lettreAvecAR = new LettreAAR (9876, "Lettre recommandée avec AR", 5.10, 70);
		Article colissimo	 = new Colissimo (5555, "Colissimo", 8, 40);
		Article colieco 	 = new Colieco   (4567, "Coliéco", 4.50, 20);
				
		// tableau des objets
		ArrayList<Article> listeArticles = new ArrayList<Article>();
		
		listeArticles.add(timbrePrio);
		listeArticles.add(timbreLV);
		listeArticles.add(timbreEco);
		listeArticles.add(lettrePAP);
		listeArticles.add(lettreSansAR);
		listeArticles.add(lettreAvecAR);
		listeArticles.add(colissimo);
		listeArticles.add(colieco);
		
		GestionnaireStock gestionnaireStock = new GestionnaireStock();
		gestionnaireStock.setStock(listeArticles);
		
		// caratéristique des produits
		System.out.println();
		System.out.println("<<<  Description des articles en vente :  >>>");
		System.out.println();
		for(int i = 0 ; i < listeArticles.size(); i++){
			System.out.println(listeArticles.get(i).getNom() + "  === >  " + listeArticles.get(i).getQtiteStock() + " articles, vendus " + listeArticles.get(i).getPrix() + " € pièce ");
			valeurStock = valeurStock + (listeArticles.get(i).getPrix() * listeArticles.get(i).getQtiteStock());
		}
		
		System.out.println();
		System.out.println(" -------------------------------------");
		System.out.println("| Valeur actuelle du stock : " + valeurStock + " € |");
		System.out.println(" -------------------------------------");
		System.out.println();
		
		/* transféré dans sa propre classe
		// menu général
		System.out.println("*** Voici le menu du stock ***");
		System.out.println();
		System.out.println("1 - Rechercher un article (par référence)");
		System.out.println("2 - Rechercher un article (par nom)");
		System.out.println("3 - Rechercher un article (par intervalle de prix)");
		System.out.println("4 - Ajouter un article au stock");
		System.out.println("5 - Supprimer un article (par référence)");
		System.out.println("6 - Supprimer un article (par nom)");
		System.out.println("7 - Afficher tous les articles en stock");
		System.out.println("8 - Quitter le menu");
		System.out.println();
		System.out.println("Entrez votre choix : ");
		int choix = input.nextInt();
				
		// choix dans le menu
		while ((choix < 1) || (choix > 8)) {
			System.out.println("Choix invalide : ressaisissez un numéro entre 1 et 8 ! ");
		    choix = input.nextInt();
		} 
		if (choix == 1) {
			gestionnaireStock.trouverParRef();
		} 
		else if (choix == 2) {
			gestionnaireStock.trouverParNom();
		} 
		else if (choix == 3) {
			gestionnaireStock.trouverParIntervalle();
		} 
		else if (choix == 4) {
			gestionnaireStock.ajouterAuStock();
		} 
		else if (choix == 5) {
			gestionnaireStock.supprimerDuStockParRef();
		} 
		else if (choix == 6) {
			gestionnaireStock.supprimerDuStockParNom();
		} 
		else if (choix == 7) {
			gestionnaireStock.toutAfficher();
		} 
		else if (choix == 8) {
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println(" Ce programme est terminé : au revoir ... ");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.exit(0);
		}*/
	}
}
