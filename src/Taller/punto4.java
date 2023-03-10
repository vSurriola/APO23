package Taller;

import java.util.Scanner;

public class punto4 {

	public static void main(String[] args) {
		
		
	         
		       Scanner sn = new Scanner(System.in);
		       boolean salir = false;
		       int opcion; 
		       double peso = 0; 
		       double mercurio = 0.38;
		       double venus = 0.91;
		       double marte = 0.38;
		       double jupiter = 2.36;
		       double saturno = 0.92;
		    	double urano = 0.89;
		    	double neptuno = 1.13;
		    		   
		        
		       while(!salir){
		            System.out.println("================BIENVENIDO==============");
		            System.out.println("===Calculadora de tu peso en otro Planeta===");
		           System.out.println("1.     Mercurio");
		           System.out.println("2.     Venus");
		           System.out.println("3.     Marte");
		           System.out.println("4.     Jupiter ");
		           System.out.println("5.     Saturno");
		           System.out.println("6.     Urano");
		           System.out.println("7.     Neptuno");
		           System.out.println("8.     Salir");
		            
		           System.out.println("Escribe una de las opciones");
		           opcion = sn.nextInt();
		            
		           switch(opcion) {
		           
		           case 1:
		        	   System.out.println("Digita tu peso en Mercurio :");
		        	   peso = sn.nextDouble();
		        	   double resultado = peso * mercurio;
		        	   System.out.println("Tu peso en Mercurio es : "+ resultado);
		        	   break;
		           case 2:
		        	   System.out.println("Digita tu peso en Venus :");
		        	   peso= sn.nextDouble();
		        	   double resultado2 = peso* venus;
		        	   System.out.println("Tu peso en venus es :"+resultado2);
		        	   break;
		           case 3 :
		        	   System.out.println("Digita tu peso en Marte : ");
		        	   peso= sn.nextDouble();
		        	   double resultado3= peso* marte;
		        	   System.out.println("Tu peso en marte es :"+ resultado3);
		        	   break;
		           case 4 : 
		        	   System.out.println("Digita tu peso en Jupiter : ");
		        	   peso= sn.nextDouble();
		        	   double resultado4 = peso * jupiter;
		        	   System.out.println("Tu peso en jupiter es :"+ resultado4);
		        	   break; 
		           case 5 : 
		        	   System.out.println("Digita tu peso en Saturno : ");
		        	   peso = sn.nextDouble();
		        	   double resultado5 = peso * saturno;
		        	   System.out.println("Tu peso en Saturno es :" + resultado5);
		        	   break;
		           case 6 :
		        	   System.out.println("Digita tu peso en Urano :");
		        	   peso = sn.nextDouble();
		        	   double resultado6 = peso* urano; 
		        	   System.out.println("Tu peso en Urano es :" + resultado6);
		        	   break;
		           case 7 : 
		        	   System.out.println("Digita tu peso en Neptuno :");
		        	   peso = sn.nextDouble();
		        	   double resultado7 = peso* neptuno;
		        	   System.out.println("Tu peso en Neptuno es :"+ resultado7);
		        	   break;
		           case 8 : 
		        	   salir=true;
	                   break;
		           default:
	                   System.out.println("Solo números entre 1 y 8");
		        	   
		           }
		           
		           
		       
		        
		    }
		     
		}
	}
	
	