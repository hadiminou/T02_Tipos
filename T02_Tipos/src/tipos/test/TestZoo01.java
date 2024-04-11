package tipos.test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import tipos.Animal;
import tipos.Familia;
import tipos.Zoo;

public class TestZoo01 {

	public static void main(String[] args) {
		testConstructor01();
		testConstructor02();
		testSetHorarioApertura();
		testSetHorarioCierre();
		testSetAnimales();
	}
	
	//Construye y carga una lista con tres animales para pasarlo como cuarto parametro
	private static List<Animal> construyeListaAnimales(){
		Animal a1=new Animal(Familia.AVE,"Buitre",7.5,20,false);
		Animal a2=new Animal(Familia.TERRESTRE,"Gato",3.7,15,true);
		Animal a3=new Animal(Familia.ANFIBIO,"Cocodrilo",1400d,60,false);
		List<Animal> res=new ArrayList<Animal>();
		res.add(a1);
		res.add(a2);
		res.add(a3);
		return res;
	}
	
	//Prueba el constructor-1 con todos los parámetros
	private static void testConstructor01() {
		List<Animal> misAnimales=construyeListaAnimales();
		try {
			System.out.println("Test constructor-1 con todos los parámetros correctos");
			Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30),misAnimales);
			System.out.println("\t"+z);
		}catch(Exception e) {
			System.out.println("\tHa habido un error al construir el zoo");
		}
		try {
			System.out.println("Test constructor-1 con todos los parámetros nulos");
			Zoo z=new Zoo(null,null,null,null);
			System.out.println("\t"+z);
		}catch(Exception e) {
			System.out.println("\tHa habido un error al construir el zoo");
		}
		try {
			System.out.println("Test constructor-1 con la fecha de apertura posterior a la de cierre");
			Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(9,00),misAnimales);
			System.out.println("\t"+z);
		}catch(Exception e) {
			System.out.println("\tHa habido un error al construir el zoo");
		}
	}
	//Prueba el constructor-2 que tiene sólo los tres primeros parametros	
	private static void testConstructor02() {
		try {
			System.out.println("\nTest constructor-2 con los tres parámetros correctos");
			Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30));
			System.out.println("\t"+z);
		}catch(Exception e) {
			System.out.println("\tHa habido un error al construir el zoo");
		}
		try {
			System.out.println("Test constructor-2 con todos los parámetros nulos");
			Zoo z=new Zoo(null,null,null);
			System.out.println("\t"+z);
		}catch(Exception e) {
			System.out.println("\tHa habido un error al construir el zoo");
		}
		try {
			System.out.println("Test constructor-2 con el horario de apertura posterior a lo de cierre");
			Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(9,00));
			System.out.println("\t"+z);
		}catch(Exception e) {
			System.out.println("\tHa habido un error al construir el zoo");
		}
	}
	
	//Prueba el método setHorarioApertura
		private static void testSetHorarioApertura() {
			List<Animal> misAnimales=construyeListaAnimales();
			try {
				System.out.println("\nTest setHorarioApertura correcto");
				Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30),misAnimales);
				z.setHorarioApertura(LocalTime.of(10,15));
				System.out.println("\t"+z);
			}catch(Exception e) {
				System.out.println("\tHa habido un error al modificar el horario de apertura");
			}
			try {
				System.out.println("Test setHorarioApertura con el horario de apertura posterior a lo de cierre");
				Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30),misAnimales);
				z.setHorarioApertura(LocalTime.of(21,0));
				System.out.println("\t"+z);
			}catch(Exception e) {
				System.out.println("\tHa habido un error al modificar el horario de apertura");
			}
			try {
				System.out.println("Test setHorarioApertura con el horario de apertura a nulo");
				Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30),misAnimales);
				z.setHorarioApertura(null);
				System.out.println("\t"+z);
			}catch(Exception e) {
				System.out.println("\tHa habido un error al modificar el horario de apertura");
			}
		}
	
	//Prueba el método setHorarioCierre
		private static void testSetHorarioCierre() {
			List<Animal> misAnimales=construyeListaAnimales();
			try {
				System.out.println("\nTest setHorarioCierre correcto");
				Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30),misAnimales);
				z.setHorarioCierre(LocalTime.of(21,15));
				System.out.println("\t"+z);
			}catch(Exception e) {
				System.out.println("\tHa habido un error al modificar el horario de cierre");
			}
			try {
				System.out.println("Test setHorarioCierre con el horario de cierre anterior a lo de apertura");
				Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30),misAnimales);
				z.setHorarioCierre(LocalTime.of(9,0));
				System.out.println("\t"+z);
			}catch(Exception e) {
				System.out.println("\tHa habido un error al modificar el horario de cierre");
			}
			try {
				System.out.println("Test setHorarioCierre con el horario de cierre a nulo");
				Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30),misAnimales);
				z.setHorarioCierre(null);
				System.out.println("\t"+z);
			}catch(Exception e) {
				System.out.println("\tHa habido un error al modificar el horario de cierre");
			}
		}
	//Prueba el método setAnimales
	private static void testSetAnimales() {
		List<Animal> misAnimales=construyeListaAnimales();
		try {
			System.out.println("\nTest setAnimales correcto");
			Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30),misAnimales);
			misAnimales.add(new Animal(Familia.MARINO,"Tiburón blanco",1000d,70,false));
			z.setAnimales(misAnimales);
			System.out.println("\t"+z);
		}catch(Exception e) {
			System.out.println("\tHa habido un error al modificar los animales");
		}
		try {
			System.out.println("Test setAnimales con la lista nula");
			Zoo z=new Zoo("Zoo de Nairobi",LocalTime.of(9,30),LocalTime.of(20,30),misAnimales);
			z.setAnimales(null);
			System.out.println("\t"+z);
		}catch(Exception e) {
			System.out.println("\tHa habido un error al modificar los animales");
		}
	}

}
