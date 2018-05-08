// Author : Pierre Legentil 

import java.util.Scanner;

public class SecondDegre {
	
		public static void main (String [] args){
		// r�solution d'une �quation du second degr�
			
			Scanner scan = new Scanner(System.in);
			// Cr�ation des variables  
			int a;
			int b;
			int c;
			double delta;
			double solution0;
			double solution1;
			double solution2;
			// On donne aux varibales (int) les valeurs saisies par l'utilisateur 
			System.out.println("Entrez la valeur du param�tre de second degr�");
			a=scan.nextInt();
			System.out.println("Entrez la valeur du param�tre de premier degr�");
			b=scan.nextInt();
			System.out.println("Entrez la valeur du param�tre de degr� z�ro ");
			c=scan.nextInt();
			System.out.println("L'equation � resoudre est donc "+a+"x^2 +"+b+"x+"+c+"=0");
			
			// on calcule la valeur de delta
			delta= Math.pow(b, 2)-4*a*c;
			
			// En fonction du r�sultat, notamment par rapport � la valeur de delta, on effectue un calcul pr�cis
			if (delta<0)
			{
				System.out.println("Delta est n�gatif, l'�quation n'a pas de solutions r�elles ");
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
						System.out.println("Delta est sup�rieur � 0, il y a deux reponses possibles x1 = "+solution1+" et x2 = "+solution2);
					}
			
			
			scan.close();		
}
}
