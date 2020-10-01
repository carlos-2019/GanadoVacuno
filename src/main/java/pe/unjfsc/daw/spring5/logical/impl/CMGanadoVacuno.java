package pe.unjfsc.daw.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.CAGanadoVacuno;
import pe.unjfsc.daw.spring5.model.CDHembraBovina;

public class CMGanadoVacuno extends CAGanadoVacuno{

	private static final Logger log = LoggerFactory.getLogger("CAGanadoVacuno");
	//Entidad Hembra Bovina
	CEGanadoVacuno[] oCEHembraBovina = new CEGanadoVacuno[10];
	
	//Modelo Hembra Bovina
	CDHembraBovina oCDHembraBovina = new CDHembraBovina();
		
	//Atributos para el manejo de métodos
	private int[] CUIA 				= oCDHembraBovina.getCUIA();
	private String[] alias 			= oCDHembraBovina.getAlias();
	private String[] fechNacimiento = oCDHembraBovina.getFechNacimiento();
	private double[] peso 			= oCDHembraBovina.getPeso();
	private double[] talla 			= oCDHembraBovina.getTalla();
	private int[] estaAnimal 		= oCDHembraBovina.getEstaAnimal();
	private String[] tipo 			= oCDHembraBovina.getTipo();
	private String[] estaActivo 	= oCDHembraBovina.getEstaActivo();
	private String[] origen 		= oCDHembraBovina.getOrigen();
	private String[] observacion 	= oCDHembraBovina.getObservacion();
	private String[] sexo 			= oCDHembraBovina.getSexo();
 	@Override
	public void create() {
 		log.info("CREANDO REGISTROS...");
		for (int i = 0; i < oCEHembraBovina.length; i++) {
			oCEHembraBovina[i] = new CEGanadoVacuno(
					CUIA[i],
					alias[i],
					fechNacimiento[i],
					peso[i],
					talla[i],
					estaAnimal[i],
					tipo[i],
					estaActivo[i],
					origen[i],
					observacion[i],
					sexo[i]
					);
			log.info("Hembra Bovina "+(i+1)+": {}",oCEHembraBovina[i]);
		}
	}

	@Override
	public void read(int cuia) {
		log.info("LEYENDO EL CUIA "+cuia+"...");
		for (int i = 0; i < oCEHembraBovina.length; i++) {
			if (cuia == oCEHembraBovina[i].getCUIA()) {
				log.info(":{}",oCEHembraBovina[i]);
				break;
			}
		}
	}

	@Override
	public void update(CEGanadoVacuno oCEHembraBovina2) {
		log.info("ACTUALIZANDO EL REGISTRO CON EL CUIA "+oCEHembraBovina2.getCUIA()+"...");
		for (int i = 0; i < oCEHembraBovina.length; i++) {
			if (oCEHembraBovina2.getCUIA() == oCEHembraBovina[i].getCUIA()) {
				oCEHembraBovina[i] = new CEGanadoVacuno(
						oCEHembraBovina2.getCUIA(),
						oCEHembraBovina2.getAlias(),
						oCEHembraBovina2.getFechNacimiento(),
						oCEHembraBovina2.getPeso(),
						oCEHembraBovina2.getTalla(),
						1,
						oCEHembraBovina2.getTipo(),
						oCEHembraBovina2.getEstaActivo(),
						oCEHembraBovina2.getOrigen(),
						oCEHembraBovina2.getObservacion(),
						oCEHembraBovina2.getSexo()
						);
			}
		}
	}

	@Override
	public void delete(int cuia) {
		log.info("ELIMINANDO EL REGISTRO CON EL CUIA "+cuia+"...");
		for (int i = 0; i < oCEHembraBovina.length; i++) {
			if (cuia == oCEHembraBovina[i].getCUIA()) {
				oCEHembraBovina[i].setEstaAnimal(0);
				break;
			}
		}
		
	}

	@Override
	public void showAll() {
		log.info("MOSTRANDO REGISTROS EXISTENTES");
		for (int i = 0; i < oCEHembraBovina.length; i++) {
			if (oCEHembraBovina[i].getEstaAnimal() == 1) {
				log.info("Mostrando Hembras Bovinas con estado 1: {}", oCEHembraBovina[i]);
			}
		}
		
	}

	
	
}
