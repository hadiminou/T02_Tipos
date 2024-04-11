package tipos;

import java.time.LocalTime;


import java.util.List;

import utiles.Checkers;

import java.util.ArrayList;

public class Zoo {
	private String nombre;
	private LocalTime horarioApertura;
	private LocalTime horarioCierre;
	private List<Animal> animales;
	
	public Zoo(String nombre, LocalTime horarioApertura, LocalTime horarioCierre,
			List<Animal> animales) {
		Checkers.checkNoNull(nombre,horarioApertura,horarioCierre,animales);
		Checkers.check("La hora de apertura debe ser anterior a la de cierre",
				horarioApertura.isBefore(horarioCierre));
		this.nombre = nombre;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.animales = animales;
	}
	
	public Zoo(String nombre, LocalTime horarioApertura, LocalTime horarioCierre) {
		Checkers.checkNoNull(nombre,horarioApertura,horarioCierre);
		Checkers.check("La hora de apertura debe ser anterior a la de cierre",
				horarioApertura.isBefore(horarioCierre));
		this.nombre = nombre;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.animales = new ArrayList<Animal>();  // new LinkedList<Animal>()  
	}
	
	public LocalTime getHorarioApertura() {
		Checkers.checkNoNull(horarioApertura);
		Checkers.check("La hora de apertura debe ser anterior a la de cierre",
				horarioApertura.isBefore(horarioCierre));
		return horarioApertura;
	}
	public void setHorarioApertura(LocalTime horarioApertura) {
		Checkers.checkNoNull(horarioApertura);
		Checkers.check("La hora de apertura debe ser anterior a la de cierre",
				horarioApertura.isBefore(horarioCierre));
		this.horarioApertura = horarioApertura;
	}
	public LocalTime getHorarioCierre() {
		Checkers.checkNoNull(horarioCierre);
		Checkers.check("La hora de apertura debe ser anterior a la de cierre",
				horarioApertura.isBefore(horarioCierre));
		return horarioCierre;
	}
	public void setHorarioCierre(LocalTime horarioCierre) {
		Checkers.checkNoNull(horarioCierre);
		Checkers.check("La hora de apertura debe ser anterior a la de cierre",
				horarioApertura.isBefore(horarioCierre));
		this.horarioCierre = horarioCierre;
	}
	
	public List<Animal> getAnimales() {
		Checkers.checkNoNull(animales);
		return animales;
	}
	public void setAnimales(List<Animal> animales) {
		Checkers.checkNoNull(animales);
		this.animales = animales;
	}
	public String getNombre() {
		return nombre;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Zoo))
			return false;
		Zoo other = (Zoo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String toString() {
		return "Zoo [nombre=" + nombre + ", horarioApertura=" + horarioApertura + ", horarioCierre=" + horarioCierre
				+ ", animales=" + animales.size() + "]";
	}
} 
