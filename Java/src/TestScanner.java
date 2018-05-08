// Author: Pierre Legentil 

/* 4.2.1 */

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name="";
		System.out.println("Quelle est votre nom ?");
		name = scan.nextLine();
		System.out.println("Bonjour " +name);
		scan.close();
	}
}