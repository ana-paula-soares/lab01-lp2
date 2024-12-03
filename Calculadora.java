/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Ana Paula Soares Tôrres Cassimiro - 124111031
 */
 import java.util.Scanner;
 public class Calculadora{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
		 String simbol = sc.nextLine();
		 float num1; 
		 float num2;
		 
		 switch (simbol) {
			 case "+":
			    num1 = sc.nextFloat();
			    num2 = sc.nextFloat(); 
				System.out.println("RESULTADO: " + (num1 + num2));
				break;
			 case "-":
			    num1 = sc.nextFloat();
			    num2 = sc.nextFloat(); 
				System.out.println("RESULTADO: " + (num1 - num2));
				break;
			 case "*":
			    num1 = sc.nextFloat();
			    num2 = sc.nextFloat(); 
			    System.out.println("RESULTADO: " + (num1 * num2));
			    break;
			 case "/":
			    num1 = sc.nextFloat();
			    num2 = sc.nextFloat();
			    float divisao = num1/num2;  
			    if (num2 == 0) {
					System.out.println("ERRO");	
				} else {
					 System.out.println("RESULTADO: " + divisao);
				}
				break;   	
			 default: 
			     System.out.println("ENTRADA INVALIDA");
			 }	 
	
	}
}
