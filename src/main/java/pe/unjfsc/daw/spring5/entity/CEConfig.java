package pe.unjfsc.daw.spring5.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.unjfsc.daw.spring5.logical.impl.CMGanadoVacuno;

@Configuration
public class CEConfig {

	@Bean 
	public CEGanadoVacuno idCEGanadoVacuno() {
		return new CEGanadoVacuno();
	}
	
	@Bean public CMGanadoVacuno idCMGanadoVacuno() {
		return new CMGanadoVacuno();
	}
	
	//beanes de recria
	@Bean
	public CERecria idRecria() {
		return new CERecria();
	}
	@Bean
	public CMRecria idCMRecria() {
		return new CMRecria();
	}
}
