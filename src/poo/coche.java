package poo;

public class coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean cuero, climatizador; 
	
	
	public coche() {
		
		ruedas = 4;
		largo  = 2000;
		ancho  = 100;
		motor  = 1600;
		peso_plataforma   = 500; 
		
		
		
	}
	
	public String dime_largo() {
		
		return "El largo del coche es " + largo; 
	}
	
	public void establece_color() {
		
		color ="azul";
		
	}

	public String dime_color() {
		
		return "El color del coche es " + color;
	}
	public String dime_ancho () {
		return "El ancho del coche es " + ancho;
	}
	public String dime_motor () {
		return "El motor es "+motor;
	}
	public String dime_peso_plataforma () {
		return "El peso de la plataforma es "+ peso_plataforma;
	}
}
	

