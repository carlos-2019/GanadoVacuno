package pe.unjfsc.daw.spring5.logical.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CERecria;
import pe.unjfsc.daw.spring5.logical.CARecria;
import pe.unjfsc.daw.spring5.model.CDRecria;

public class CMRecria extends CARecria {
	private static final Logger LOG = LoggerFactory.getLogger("CMRecria");

	// clase entidad de Recria
	CERecria[] oCERecria = new CERecria[10];
	// modelo Recria
	CDRecria oCDRecria = new CDRecria();

	// atributos para el manejo de metodos
	private int[] idRecria = oCDRecria.getIdRecria();
	private String[] aliasRecria = oCDRecria.getAliasRecria();
	private String[] natalidad = oCDRecria.getNatalidad();
	private String[] sexo = oCDRecria.getSexo();
	private int[] edad = oCDRecria.getEdad();
	private String[] etapaMacho = oCDRecria.getEtapaMacho();
	private String[] etapaHembra = oCDRecria.getEtapaHembra();
	private double[] peso = oCDRecria.getPeso();
	private double[] talla = oCDRecria.getTalla();
	private int[] estado = oCDRecria.getEstado();

	@Override
	public void create() {
		LOG.info("[DZS] => Creando Registros :");
		for (int i = 0; i < oCERecria.length; i++) {
			oCERecria[i] = new CERecria(idRecria[i], aliasRecria[i], natalidad[i], sexo[i], edad[i], etapaMacho[i],
					etapaHembra[i], peso[i], talla[i], estado[i]);
			LOG.info("[DZS] => Registro de Recria:" + (i + 1) + ":{}", oCERecria[i]);

		}
	}

	@Override
	public void read(int _idRecria) {
		LOG.info("[DZS] => Leyendo idRecria:" + _idRecria + ".");
		for (int i = 0; i < oCERecria.length; i++) {
			if (_idRecria == oCERecria[i].getIdRecria()) {
				LOG.info(":{}", oCERecria[i]);
				break;
			}
		}

	}

	@Override
	public void update(CERecria _oCERecria) {
		LOG.info("[DZS] => Actualizando los Registros segun el idRegistr:" + _oCERecria.getIdRecria() + ".");
		for (int i = 0; i < oCERecria.length; i++) {
			if (_oCERecria.getIdRecria() == oCERecria[i].getIdRecria()) {
				oCERecria[i] = new CERecria(_oCERecria.getIdRecria(), _oCERecria.getAliasRecria(),
						_oCERecria.getNatalidad(), _oCERecria.getSexo(), _oCERecria.getEdad(),
						_oCERecria.getEtapaMacho(), _oCERecria.getEtapaHembra(), _oCERecria.getPeso(),
						_oCERecria.getTalla(), _oCERecria.getEstado());
			}
		}
	}

	@Override
	public void delete(int _idRecria) {
		LOG.info("[DZS] => ELIMINANDO EL REGISTRO CON EL idRecria "+_idRecria+".");
		for (int i = 0; i < oCERecria.length; i++) {
			if (_idRecria == oCERecria[i].getIdRecria()) {
				oCERecria[i].setEstado(0);
				break;
			}
		}

	}

	@Override
	public void showAll() {
		LOG.info("[DZS] => MOSTRANDO REGISTROS EXISTENTES");
		for (int i = 0; i < oCERecria.length; i++) {
			if (oCERecria[i].getEstado() == 1) {
				LOG.info("[DZS] => Mostrando Hembras Bovinas con estado 1: {}", oCERecria[i]);
			}
		}

	}

}
