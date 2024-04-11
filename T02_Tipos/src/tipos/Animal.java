package tipos;

public record Animal(Familia familia, String nombre, Double pesoMedio, 
		Integer edadMedia, Boolean puedeSerDomestico) implements Comparable<Animal> {
	
	public Animal(Familia familia, String nombre) {
		this(familia, nombre, 0d, 0, false);
	}
	
	public Animal(Familia familia, String nombre, Boolean puedeSerDomestico) {
		this(familia, nombre,0d, 0, puedeSerDomestico);
	}
		
	public Familia getFamilia() {
		return this.familia;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPesoMedio() {
		return this.pesoMedio;
	}
	
	public Integer getEdadMedia() {
		return this.edadMedia;
	}
	
	public Boolean getPuedeSerDomestico() {
		return this.puedeSerDomestico;
	}
	
	public String toString() {
		return this.nombre()+"["+this.familia()+"]";
	}
	
	public boolean equals(Object o) {  //criterio de igualdad
		boolean res = false;
		if (o instanceof Animal) {
			Animal a = (Animal)o;
			res = this.nombre().equals(a.nombre()) && this.familia().equals(a.familia());
		}
		return res;
	}
	
	/*public boolean equals(Animal a) {
		boolean res = false;
		if (a instanceof Animal) {
			res = this.nombre().equals(a.nombre()) && this.familia().equals(a.familia());
		}
		return res;
	}*/
	
	public int hashCode() {
		return 11*this.nombre().hashCode()+13*this.familia().hashCode();
	}
	
	public int compareTo(Animal a) {  //criterio de orden natural
		int res = this.pesoMedio().compareTo(a.pesoMedio());
		if (res == 0) {
			res = this.edadMedia().compareTo(a.edadMedia());
			if (res == 0) {
				res = this.familia().compareTo(a.familia());
			}
		}
		return res;
	}
}
