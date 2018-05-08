// Author: Pierre Legentil

/*  - 5.1 -  */

/*  -5.1.1- 
(1) Nous avons besoin de la longueur, de la largeur et de la hauteur du Pav� droit.
(2) Nous devons taper les valeurs au clavier, r�ponse c.
(3) Nous devons ensuite afficher le r�sultat, r�ponse b.
(4) La formule est : Hauteur x Largeur x Longueur.
*/ 

/*  -5.1.2- 
- Si des valeurs sont n�gatives, il faut afficher une erreur car c'est impossible. Pour cela il faut v�rifier la valeur de la variable � l'aide d'une boucle
- Il faut utiliser des floats pour ces valeurs.
*/

/*  -5.1.3- 
Les �tapes n�cessaires sont : 
1- demander la valeur de la hauteur (rentrer par l'utilisateur)
2- demander la valeur de la largeur	(rentrer par l'utilisateur)
3- demander la valeur de la longueur (rentrer par l'utilisateur)
4- faire le calcul hauteur x longueur x largeur 
5- afficher le r�sulat
*/

/* 5.1.4 */


import java.util.Scanner;

public class VolumePave {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			float longueur ;				// cr�ation d'une variable correspondant � la longueur
			System.out.println("Que vaut la longueur ?"); 
			longueur = scan.nextFloat();	// attribut � la varaible longueur la valeur rentr�e par l'utilisateur 
			float largeur ;
			System.out.println("Que vaut la largeur ?");
			largeur = scan.nextFloat();
			float hauteur ;
			System.out.println("Que vaut la hauteur ?");
			hauteur = scan.nextFloat();
			
			if (largeur <0  ||  longueur <0  || hauteur<0)
			{
				System.out.println("Erreur ! Au moins l'une des valeurs est n�gative");
			}
				else 
				{
				System.out.println("Le volume du Pav� droit est "+longueur*largeur*hauteur ); // affiche le r�sultat apr�s r�alisation du calcul.
				scan.close();
			    }
												}
            			}
		    
			
			
				
