/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Ana Paula Soares Tôrres Cassimiro - 124111031
 */

import java.util.Scanner;

public class DobroTriplo {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int dobro = 2 * numero;
		int triplo = 3 * numero;
		
		System.out.println("dobro: " + dobro + ", " + "triplo: " + triplo);
	}
}

