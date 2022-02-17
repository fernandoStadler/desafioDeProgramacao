package br.com.senha;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {
	private static Scanner inpScanner;
	public static void main(String[] args) {
		

        Pattern uppercase = Pattern.compile(".*[A-Z].*");
        Pattern lowcase = Pattern.compile(".*[a-z].*");
        Pattern number = Pattern.compile(".*[0-9].*");
        Pattern caracter = Pattern.compile(".*(?=.*[!@#$%^&*()-+]).*");
       
        Matcher mNumber,mUppercase,mLowcase,mCarcater;
        
		
		System.out.println("Cadastre a sua Senha!"
				+ "\nA sua senha deve conter:\n"
				+ "\n-Possui no mínimo 6 caracteres."
				+ "\n-Conter no mínimo 1 número."
				+ "\n-Conter no mínimo 1 letra em minúsculo."
				+ "\n-Conter no mínimo 1 letra em maiúsculo."
				+ "\n-Conter no mínimo 1 caractere especial.\n"
				+ "\n Os caracteres especiais aceitos são: !@#$%^&*()-+\r\n"
				+ "");
		
		inpScanner = new Scanner(System.in);
		String senha = inpScanner.next();
		
		mNumber  = number.matcher(senha);
		mUppercase  = uppercase.matcher(senha);
		mLowcase  = lowcase.matcher(senha);
		mCarcater  = caracter.matcher(senha);
		
		if(mNumber.matches()==true &&
		   mUppercase.matches()==true &&
		   mLowcase.matches()==true && 
		   mCarcater.matches()==true && 
		   senha.length()>=6) {
			
			System.out.println("Sua senha é forte.");
		}else {
			System.out.println("Tente outra senha, a sua senha é fraca!");

		}

	}
}
