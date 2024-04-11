package tipos.test;

import tipos.Electrodomestico;

public class TestElectrodomestico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico e1 = new Electrodomestico("1111","Batidora",24,50f,21f);
		Electrodomestico e2 = new Electrodomestico("2222","Centro de Planchado",36,315.95f,10f);
		
		System.out.println("e1: " + e1);
		System.out.println("e2: " + e2);
		
		e2.setIva(21f);
		System.out.println("Importe total de e2: "+ e2.importeTotal());
	}
}
