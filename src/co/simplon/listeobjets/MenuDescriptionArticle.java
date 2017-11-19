package co.simplon.listeobjets;

import java.util.Scanner;

public class MenuDescriptionArticle {
	
	Scanner input = new Scanner(System.in);
	
	int choix = 0;
	
		System.out.println("Résumé des principales caractéristiques de chaque produit");
		System.out.println();
		System.out.println("1 - Timbre Prioritaire			2 - Timbre Lettre Verte			3 - Timbre Economique");
		System.out.println("4 - Lettre PAP					5 - Lettre Reco. sans AR		6 - Lettre Reco. avec AR");
		System.out.println("7 - Colissimo					8 - Coliéco");
		System.out.println("9 - Retour au menu principal");
		System.out.println();
		System.out.println("Entrez votre choix : ");

				// choix dans le menu
				while ((choix < 1) || (choix > 10)) {
					System.out.println("Choix invalide : ressaisissez un numéro entre 1 et 9 ! ");
				    choix = input.nextInt();
				} 
				if (choix == 1) {
					gestionnaireStock.timbrePrio();
				} 
				else if (choix == 2) {
					gestionnaireStock.timbreLV();
				} 
				else if (choix == 3) {
					gestionnaireStock.timbreEco();
				} 
				else if (choix == 4) {
					gestionnaireStock.lettrePAP();
				} 
				else if (choix == 5) {
					gestionnaireStock.lattreSAR();
				} 
				else if (choix == 6) {
					gestionnaireStock.lettreAAR();
				} 
				else if (choix == 7) {
					gestionnaireStock.colissimo();
				}	
				else if (choix == 8) {
					gestionnaireStock.colieco();
				} 
				else if (choix == 9) {
					System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
					System.out.println(" Vous retournez au menu principal ... ");
					System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
					System.exit(0);
				}
			}
}