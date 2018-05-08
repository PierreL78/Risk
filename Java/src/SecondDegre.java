// Author : Pierre Legentil 

import java.util.Scanner;

public class SecondDegre {
	
		public static void main (String [] args){
		// résolution d'une équation du second degré
			
			Scanner scan = new Scanner(System.in);
			// Création des variables  
			int a;
			int b;
			int c;
			double delta;
			double solution0;
			double solution1;
			double solution2;
			// On donne aux varibales (int) les valeurs saisies par l'utilisateur 
			System.out.println("Entrez la valeur du paramètre de second degré");
			a=scan.nextInt();
			System.out.println("Entrez la valeur du paramètre de premier degré");
			b=scan.nextInt();
			System.out.println("Entrez la valeur du paramètre de degré zéro ");
			c=scan.nextInt();
			System.out.println("L'equation à resoudre est donc "+a+"x^2 +"+b+"x+"+c+"=0");
			
			// on calcule la valeur de delta
			delta= Math.pow(b, 2)-4*a*c;
			
			// En fonction du résultat, notamment par rapport à la valeur de delta, on effectue un calcul précis
			if (delta<0)
			{
				System.out.println("Delta est négatif, l'équation n'a pas de solutions réelles ");
			}
				else if (delta==0)
				{
				solution0= -b/(2*a);
				System.out.println("Delta vaut 0, il y a une unique solution x0 = "+solution0);
				
				}
					else 
					{ 
						delta= Math.sqrt(delta);
						solution1= (-b-delta)/(2*a);
						solution2=(-b+delta)/(2*a);
						System.out.println("Delta est supérieur à 0, il y a deux reponses possibles x1 = "+solution1+" et x2 = "+solution2);
					}
			
			
			scan.close();		
}
}
