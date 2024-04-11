package tipos.test;

import tipos.*;

public class TestAnimal03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal(Familia.AVE, "pajaro", 1.2d, 10, true);
		Animal a2 = new Animal(Familia.TERRESTRE, "Gato", true);
		Animal a3 = new Animal(Familia.AVE, "Buitre",false);
		Animal a4 = new Animal(Familia.TERRESTRE,"guepardo",55.5,12,false);
		Animal a5 = new Animal(Familia.AVE,"gorrión",0.04,3,true);
		
		System.out.println("Nuestro Animal: "+a1);
		System.out.println("a1: " + a1.toString());
		System.out.println("a4.pesoMedio: " + a4.pesoMedio());
		System.out.println("a5.edadMedia: " + a5.edadMedia());
		System.out.println("a3.puedeSerDomestico: " + a3.puedeSerDomestico());
		System.out.println("a1.equals(a2): " + a1.equals(a2));
		System.out.println("hashCode a3: " + a3.hashCode());
		System.out.println("a1 comparado con a4: " + a1.compareTo(a4));
		System.out.println("a1 comparado con a2: " + a1.compareTo(a2));
	}
}
