package tipos;

public class Electrodomestico implements Comparable<Electrodomestico> {  // metodo constructor
	private String numerodeSerie;
	private String descripcion;
	private Integer mesesdegarantia;
	private Float importe;
	private Float iva;
	
	public Electrodomestico(String numerodeSerie, String descripcion, Integer mesesdegarantia,
			Float importe,Float iva)  {  // metodo constructor 1
		this.numerodeSerie = numerodeSerie;
		this.descripcion = descripcion;
		this.mesesdegarantia = mesesdegarantia;
		this.importe = importe;
		this.iva = iva;
	}
	
	public Electrodomestico(String numerodeSerie, String descripcion) {  // metodo constructor 2
		this.numerodeSerie = numerodeSerie;
		this.descripcion = descripcion;
		this.mesesdegarantia = 0;
		this.importe = 0f;
		this.iva = 0f;
	}

	
	public Float getImporte() {  // metodo consultor
		return importe;
	}

	public void setImporte(Float importe) {  // metodo modificador
		this.importe = importe;
	}

	public Float getIva() {  // metodo consultor
		return iva;
	}

	public void setIva(Float iva) {  // metodo modificador
		this.iva = iva;
	}

	public String getNumerodeSerie() {  // metodo consultor
		return numerodeSerie;
	}

	public String getDescripcion() {  // metodo consultor
		return descripcion;
	}

	public Integer getMesesdegarantia() {  // metodo consultor
		return mesesdegarantia;
	}
	
	public Float importeTotal() {
		return this.getImporte()*(1+this.getIva()/100);
	}

	@Override
	public String toString() {  // criterio de representacion textual
		return "Electrodomestico [numerodeSerie=" + numerodeSerie +", descripcion="
				+ descripcion + ", mesesdegarantia=" + mesesdegarantia + ", importe=" + 
				importe + ", iva=" + iva + ", importeTotal()=" + importeTotal() + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((importe == null) ? 0 : importe.hashCode());
		result = prime * result + ((numerodeSerie == null) ? 0 : numerodeSerie.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {  // criterio de igualdad
		if (this == obj)
			return true;
		if (!(obj instanceof Electrodomestico))
			return false;
		Electrodomestico other = (Electrodomestico) obj;
		if (importe == null) {
			if (other.importe != null)
				return false;
		} else if (!importe.equals(other.importe))
			return false;
		if (numerodeSerie == null) {
			if (other.numerodeSerie != null)
				return false;
		} else if (!numerodeSerie.equals(other.numerodeSerie))
			return false;
		return true;
	}

	@Override
	public int compareTo(Electrodomestico e) {  // criteriio de orden natural
		// TODO Auto-generated method stub
		int res = this.getNumerodeSerie().compareTo(e.getNumerodeSerie());
		//int res = this.numerodeSerie.compareTo(e.numerodeSerie());
		if (res == 0) {
			res = this.importe.compareTo(e.importe);
			//res = this.getImporte().compareTo(e.getImporte()); cual es la manera correcta? 
			                             //si Electrodomestico fuera un record cual seria correcto?
						//es mejor escribirlo con get en todas clases, pero en record porque 
			//internamente tiene el metodo getter no hace falta anadir get
		}
		return res;
	}
} 
