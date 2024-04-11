package tipos;

import java.time.LocalDate;

public record Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimiento)
	implements Comparable<Persona>{
	
	public Persona{
		if(fechaNacimiento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Error en la fecha de nacimiento");
		}
	}
	
	public Persona(String nombre, String apellidos) { // Constructor de Persona con sólo apellidos y nombre
		this("", nombre, apellidos, LocalDate.now());
	}
	
	public Integer getEdad() {
		return this.fechaNacimiento.until(LocalDate.now()).getYears();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String toString() {  // representacion textual
		return "("+this.dni+";"+this.apellidos+";"+this.nombre+")";
	}
	
	public boolean equals(Object o) {  //criterio de igualdad
		boolean res = false;
		if (o instanceof Persona) {
			Persona p = (Persona)o;
			res = this.dni().equals(p.dni()) && 
				  this.nombre().equals(p.nombre()) &&
				  this.apellidos().equals(p.apellidos);
		}
		return res;
	}
	
	public int hashcode() {
		return 11*this.dni().hashCode()+
			   13*this.nombre().hashCode()+
			   17*this.apellidos().hashCode();
	}

	public int compareTo(Persona p) {   //criterio de orden natural
		int res = this.dni().compareTo(p.dni());
		return res;
	}
}
