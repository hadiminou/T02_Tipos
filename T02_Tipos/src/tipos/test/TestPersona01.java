package tipos.test;

import java.time.LocalDate; 

import tipos.*;

public class TestPersona01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona yo = new Persona("Y9894625Q","Mahmood","Minoueian",LocalDate.of(1997, 12, 25));
		Persona miCompi1 = new Persona("27279439J","Alfonso Maria Merchor","Bengoa Diaz",
				LocalDate.of(1958,2,10));
		Persona miCompi2 = new Persona("49387556R","Iván J.","Sevillano Plaza",
				LocalDate.of(2005,2,12));
		Persona miCompi3 = new Persona("12345678A","Arturo","Rodríguez Gómez",
				LocalDate.of(2000,1,1));
		Persona kid = new Persona("Harry", "Potter");
		//Persona futuro = new Persona("00000000Z","Joe", "Smith", LocalDate.of(2030, 12, 12));
		
		System.out.println("new born: "+kid);
		System.out.println("yo: "+yo);
		System.out.println("MiCompi1: "+miCompi1);
		System.out.println("Mis apellidos: "+yo.apellidos());
		System.out.println("Mis apellidos: "+yo.getApellidos());
		System.out.println("Edad de miCompi1: "+miCompi1.getEdad());
		
		System.out.println("miCompi1.equals(yo)="+miCompi1.equals(yo));
		System.out.println("hashCode yo="+yo.hashCode());
		System.out.println("yo comparado con miCompi1= "+yo.compareTo(miCompi1));
		
		System.out.println("miCompi2 comparado con miCompi3= " + miCompi2.compareTo(miCompi3));
		System.out.println("hashCode miCompi3: " + miCompi3.hashCode());
		
		//System.out.println("Persona de Futuro: " + futuro);
	}
}
