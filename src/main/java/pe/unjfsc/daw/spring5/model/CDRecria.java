package pe.unjfsc.daw.spring5.model;

public class CDRecria {

	private int[] idRecria;
	private String[] aliasRecria;
	private String[] natalidad;
	private String[] sexo;
	private int[] edad;
	private String[] etapaMacho;
	private String[] etapaHembra;
	private double[] peso;
	private double[] talla;
	private int[] estado;

	public CDRecria() {
		int size = 10;
		// Inyección de los idecria
		idRecria = new int[size];
		for (int i = 0; i < size; i++) {
			idRecria[i] = 4000 + i + 1;
		}
		
		//Inyección de datos Alias de la recria
				aliasRecria = new String[size];
				aliasRecria[0] = "takpl";
				aliasRecria[1] = "zukly";
				aliasRecria[2] = "Alicia";
				aliasRecria[3] = "monikc";
				aliasRecria[4] = "retoir";
				aliasRecria[5] = "privitr";
				aliasRecria[6] = "routoi";
				aliasRecria[7] = "youprov";
				aliasRecria[8] = "maklowk";
				aliasRecria[9] = "primetk";
		
	    // Inyeccion de la Natalidad
				natalidad =new String[size];
				natalidad[0]="2001";
				natalidad[1]="2032";
				natalidad[2]="2032";
				natalidad[3]="2034";
				natalidad[4]="2041";
				natalidad[5]="2001";
				natalidad[6]="2045";
				natalidad[7]="2024";
				natalidad[8]="2099";
				natalidad[9]="2012";
				
		// inyeccion del sexo de la Recria
				sexo=new String[size];
				sexo[0]="Hembra";
				sexo[1]="Macho";
				sexo[2]="Hembra";
				sexo[3]="Hembra";
				sexo[4]="Macho";
				sexo[5]="Macho";
				sexo[6]="Hembra";
				sexo[7]="Macho";
				sexo[8]="Macho";
				sexo[9]="Hembra";
				
		// inyeccion de las edades de la Recria
				edad =new int[size];
				edad[0]=2;
				edad[1]=4;
				edad[2]=1;
				edad[3]=2;
				edad[4]=4;
				edad[5]=5;
				edad[6]=1;
				edad[7]=2;
				edad[8]=3;
				edad[9]=4;
	 // inyeccion de la etapa Macho
				etapaMacho=new String[size];
				etapaMacho[0]="";
				etapaMacho[1]="";
				etapaMacho[2]="";
				etapaMacho[3]="";
				etapaMacho[4]="";
				etapaMacho[5]="";
				etapaMacho[6]="";
				etapaMacho[7]="";
				etapaMacho[8]="";
				etapaMacho[9]="";
				
	 // inyeccion de la etapa Hembra
				etapaHembra=new String[size];
				etapaHembra[0]="";
				etapaHembra[1]="";
				etapaHembra[2]="";
				etapaHembra[3]="";
				etapaHembra[4]="";
				etapaHembra[5]="";
				etapaHembra[6]="";
				etapaHembra[7]="";
				etapaHembra[8]="";
				etapaHembra[9]="";
				
	//Inyección de datos peso
				peso = new double[size];
				peso[0] = 40.00;
				peso[1] = 41.00;
				peso[2] = 42.00;
				peso[3] = 43.00;
				peso[4] = 44.00;
				peso[5] = 35.00;
				peso[6] = 46.00;
				peso[7] = 17.00;
				peso[8] = 48.00;
				peso[9] = 29.00;		

	//Inyección de datos talla
				talla = new double[size];
				talla[0] = 0.5;
				talla[1] = 0.4;
				talla[2] = 0.39;
				talla[3] = 0.6;
				talla[4] = 0.61;
				talla[5] = 0.5;
				talla[6] = 0.4;
				talla[7] = 0.45;
				talla[8] = 0.51;
				talla[9] = 0.55;
				
	//Inyección de datos estado
				estado = new int[size];
				for (int i = 0; i < size; i++) {
					estado[i] = 1;
				}
	}

	public int[] getIdRecria() {
		return idRecria;
	}

	public void setIdRecria(int[] idRecria) {
		this.idRecria = idRecria;
	}

	public String[] getAliasRecria() {
		return aliasRecria;
	}

	public void setAliasRecria(String[] aliasRecria) {
		this.aliasRecria = aliasRecria;
	}

	public String[] getNatalidad() {
		return natalidad;
	}

	public void setNatalidad(String[] natalidad) {
		this.natalidad = natalidad;
	}

	public String[] getSexo() {
		return sexo;
	}

	public void setSexo(String[] sexo) {
		this.sexo = sexo;
	}

	public int[] getEdad() {
		return edad;
	}

	public void setEdad(int[] edad) {
		this.edad = edad;
	}

	public String[] getEtapaMacho() {
		return etapaMacho;
	}

	public void setEtapaMacho(String[] etapaMacho) {
		this.etapaMacho = etapaMacho;
	}

	public String[] getEtapaHembra() {
		return etapaHembra;
	}

	public void setEtapaHembra(String[] etapaHembra) {
		this.etapaHembra = etapaHembra;
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

	public int[] getEstado() {
		return estado;
	}

	public void setEstado(int[] estado) {
		this.estado = estado;
	}
	
	
}
