package Taller;

import java.util.Scanner;

public class punto6 {
	public static void main(String[] args) 
	  { 
	 double average;  double daysAbsent; 
		 	boolean exempt=false; 
	 	 
		 	Scanner reader= new Scanner(System.in); 
	 	System.out.println("================Bienvenido a programa para saber si eres exonerado===========");  	
	 	System.out.println("Por favor responda las siguientes preguntas"); 
	 	 
		 	System.out.println("Cual es tu promedio? :"); 
		 	average=reader.nextDouble(); 
	 	 
	 	System.out.println("Ha cuantas clases falto? : ");  	
	 	daysAbsent=reader.nextInt(); 
	 	 
		if ((average ==90 ) && (daysAbsent <= 3) ){
			System.out.println("Estas exonerado del examen");
		} 	
		else if ((average == 80)  && (daysAbsent == 0 ))  
			System.out.println("No estas exonerado ");
		
	  }
	  
	  }




