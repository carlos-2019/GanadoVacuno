package pe.unjfsc.daw.spring5.entity;

public class CEGanadoVacuno {
	private int CUIA;
	private String alias;
	private String fechNacimiento;
	private double peso;
	private double talla;
	private int estaAnimal;
	private String tipo;
	private String estaActivo;
	private String origen;
	private String sexo;
	private String observacion;
	public CEGanadoVacuno() {
		
	}
	
	public CEGanadoVacuno(int cUIA, String alias, String fechNacimiento, double peso, double talla, int estaAnimal,
			String tipo, String estaActivo, String origen, String sexo, String observacion) {
		super();
		CUIA = cUIA;
		this.alias = alias;
		this.fechNacimiento = fechNacimiento;
		this.peso = peso;
		this.talla = talla;
		this.estaAnimal = estaAnimal;
		this.tipo = tipo;
		this.estaActivo = estaActivo;
		this.origen = origen;
		this.sexo = sexo;
		this.observacion = observacion;
	}
	public int getCUIA() {
		return CUIA;
	}
	public void setCUIA(int cUIA) {
		CUIA = cUIA;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getFechNacimiento() {
		return fechNacimiento;
	}
	public void setFechNacimiento(String fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTalla() {
		return talla;
	}
	public void setTalla(double talla) {
		this.talla = talla;
	}
	public int getEstaAnimal() {
		return estaAnimal;
	}
	public void setEstaAnimal(int estaAnimal) {
		this.estaAnimal = estaAnimal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstaActivo() {
		return estaActivo;
	}
	public void setEstaActivo(String estaActivo) {
		this.estaActivo = estaActivo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEGanadoVacuno [CUIA=");
		builder.append(CUIA);
		builder.append(", alias=");
		builder.append(alias);
		builder.append(", fechNacimiento=");
		builder.append(fechNacimiento);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", talla=");
		builder.append(talla);
		builder.append(", estaAnimal=");
		builder.append(estaAnimal);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", estaActivo=");
		builder.append(estaActivo);
		builder.append(", origen=");
		builder.append(origen);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", observacion=");
		builder.append(observacion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
