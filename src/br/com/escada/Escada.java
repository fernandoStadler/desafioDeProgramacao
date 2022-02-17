package br.com.escada;
import java.util.*;

public class Escada {
	
	public static void main(String[] args) {
		
		Scanner inpScanner = new Scanner(System.in);
		int n, j , i;
		System.out.println("Informe um número igual ou maior que 6");
		n = inpScanner.nextInt();
		
		if(n<6) {
			System.out.print("Por favor, digite um número igual ou maior que 6");
			
		}else {
			
			for (i = 1; i <= n; i++) {
				for (j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		
	}			
}
		
		
	
