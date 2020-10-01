package pe.unjfsc.daw.spring5.model;

public class CDHembraBovina {
	private int[] CUIA;
	private String[] alias;
	private String[] fechNacimiento;
	private double[] peso;
	private double[] talla;
	private int[] estaAnimal;
	private String[] tipo;
	private String[] estaActivo;
	private String[] origen;
	private String[] observacion;
	private String[] sexo;
	public CDHembraBovina() {
		int size = 10;
		
		//Inyección de datos CUIA
		CUIA = new int[size];
		for (int i = 0; i < size; i++) {
			CUIA[i] = 2000 + i + 1;
		}
		
		//Inyección de datos Alias
		alias = new String[size];
		alias[0] = "Maria";
		alias[1] = "Juana";
		alias[2] = "Alicia";
		alias[3] = "Maria II";
		alias[4] = "Gloria";
		alias[5] = "Pinta";
		alias[6] = "MARTINA";
		alias[7] = "PAULA";
		alias[8] = "GERALDINE";
		alias[9] = "ALISON";	
		
		//Inyección de datos Fecha Nacimiento
		fechNacimiento = new String[size];
		for (int i = 0; i < size; i++) {
			String fecha = "/09/2020";
			int conta = i+1;
			fechNacimiento[i] =String.valueOf(conta) +fecha;
		}
		//Inyección de datos peso
		peso = new double[size];
		peso[0] = 400;
		peso[1] = 410;
		peso[2] = 420;
		peso[3] = 430;
		peso[4] = 440;
		peso[5] = 450;
		peso[6] = 460;
		peso[7] = 470;
		peso[8] = 480;
		peso[9] = 490;
		
		//Inyección de datos talla
		
		talla = new double[size];
		talla[0] = 1.5;
		talla[1] = 1.4;
		talla[2] = 1.39;
		talla[3] = 1.6;
		talla[4] = 1.61;
		talla[5] = 1.5;
		talla[6] = 1.4;
		talla[7] = 1.45;
		talla[8] = 1.51;
		talla[9] = 1.55;
		
		//Inyección de datos estado
		estaAnimal = new int[size];
		for (int i = 0; i < size; i++) {
			estaAnimal[i] = 1;
		}
		//Inyección de datos tipo
		tipo = new String[size];
		for (int i = 0; i < size; i++) {
			if (i%2 == 0) {
				tipo[i] = "Leche";
			}else {
				tipo[i] = "Carne";
			}
		}
				
		
		//Inyección de datos estado activo
		estaActivo = new String[size];
		for (int i = 0; i < size; i++) {
			if (i%2 == 0) {
				estaActivo[i] = "Enferma";
			}else {
				estaActivo[i] = "Producción";
			}
		}
		
		//Inyección de datos origen
		origen = new String[size];
		for (int i = 0; i < size; i++) {
			if (i%2 == 0) {
				origen[i] = "Comprado";
			}else {
				origen[i] = "Autoctono";
			}
		}
		
		//Inyección de datos observacion
		observacion = new String[size];
		for (int i = 0; i < size; i++) {
			observacion [i]  = "Ninguna";
		}		
		
		//Inyección de datos sexo
		sexo = new String[size];
		for(int i=0; i<size ; i++) {
			sexo[i] = "Hembra";
		}
		
	}
	public int[] getCUIA() {
		return CUIA;
	}
	public void setCUIA(int[] cUIA) {
		CUIA = cUIA;
	}
	public String[] getAlias() {
		return alias;
	}
	public void setAlias(String[] alias) {
		this.alias = alias;
	}
	public String[] getFechNacimiento() {
		return fechNacimiento;
	}
	public void setFechNacimiento(String[] fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}
	public double[] getPeso() {
		return peso;
	}
	public void setPeso(double[] peso) {
		this.peso = peso;
	}
	public double[] getTalla() {
		return talla;
	}
	public void setTalla(double[] talla) {
		this.talla = talla;
	}
	public int[] getEstaAnimal() {
		return estaAnimal;
	}
	public void setEstaAnimal(int[] estaAnimal) {
		this.estaAnimal = estaAnimal;
	}
	public String[] getTipo() {
		return tipo;
	}
	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}
	public String[] getEstaActivo() {
		return estaActivo;
	}
	public void setEstaActivo(String[] estaActivo) {
		this.estaActivo = estaActivo;
	}
	public String[] getOrigen() {
		return origen;
	}
	public void setOrigen(String[] origen) {
		this.origen = origen;
	}
	public String[] getObservacion() {
		return observacion;
	}
	public void setObservacion(String[] observacion) {
		this.observacion = observacion;
	}
	public String[] getSexo() {
		return sexo;
	}
	public void setSexo(String[] sexo) {
		this.sexo = sexo;
	}
	
	
}
