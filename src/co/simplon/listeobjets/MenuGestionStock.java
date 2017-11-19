package co.simplon.listeobjets;

import java.util.Scanner;

public class MenuGestionStock {
	
	Scanner input = new Scanner(System.in);
	
	gestionnaireStock.setStock(listeArticles);
	
			// menu général du stock
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
			}
		}

}