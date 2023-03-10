package poo;

import java.util.Scanner;

public class uso_coche {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		coche micoche= new coche();// INSTANCIAR UNA CLASE
		
		micoche.establece_color();
		
		System.out.println(micoche.dime_color());
		System.out.println(micoche.dime_largo());
		System.out.println(micoche.dime_ancho());
		System.out.println(micoche.dime_motor());
		System.out.println(micoche.dime_peso_plataforma());
		
		
		
		
			
		}
		
		
		
		
		

	}

	
	

