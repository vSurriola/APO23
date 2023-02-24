package puntoOcho;

import puntoSiente.Person;

public class ManagingPeople {
	 public static void main(String[] args) {

		 Person p1 = new Person (37, "Arial");
		 Person p2 = new Person (15, "Joseph");
		 
		 if (p1.getAge()==p2.getAge()) {
			 
			 System.out.println(p1.getName()+"is the same age as"+ p2.getName());
		 }
		 
		 else {
			
			 System.out.println(p1.getName()+"is not the same age "+ p2.getName());
	 }

	 }
}