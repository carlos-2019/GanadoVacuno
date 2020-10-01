package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.impl.CMGanadoVacuno;

public class CVGanadoVacunoXML {
	private static final Logger log = LoggerFactory.getLogger("CVGanadoVacunoXML");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-hembraBovina.xml");

		CEGanadoVacuno oCEHembraBovina = (CEGanadoVacuno) oCntx.getBean("idCEGanadoVacuno");
		CMGanadoVacuno oCMHembraBovina = (CMGanadoVacuno) oCntx.getBean("idCMGanadoVacuno");
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
		((ConfigurableApplicationContext) oCntx).close();
	}
}
