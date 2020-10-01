package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEConfig;
import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.impl.CMGanadoVacuno;

public class CVGanadoVacunoAnnotation {
	private static final Logger log = LoggerFactory.getLogger("CVGanadoVacunoAnnotation");
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext();
		
		annotation.register(CEConfig.class);
		annotation.refresh();
		
		CEGanadoVacuno oCEHembraBovina = (CEGanadoVacuno) annotation.getBean("idCEGanadoVacuno");
		CMGanadoVacuno oCMHembraBovina = (CMGanadoVacuno) annotation.getBean("idCMGanadoVacuno");
		oCMHembraBovina.create();
		oCMHembraBovina.read(2002);
		
		oCEHembraBovina = new CEGanadoVacuno(2009,
				"Alias editado", "fecha editada",
				500, 1.6, 1, "Leche editada",
				"Producción", "Comprada",
				"observación editada","Hembra");
		
		
		oCMHembraBovina.update(oCEHembraBovina);
		oCMHembraBovina.showAll();
		oCMHembraBovina.delete(2001);
		oCMHembraBovina.showAll();
		((ConfigurableApplicationContext) annotation).close();
	}
}
