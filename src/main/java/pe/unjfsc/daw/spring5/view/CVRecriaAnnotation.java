package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEConfig;
import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.entity.CERecria;
import pe.unjfsc.daw.spring5.logical.impl.CMGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.impl.CMRecria;

public class CVRecriaAnnotation {
	private static final Logger LOG = LoggerFactory.getLogger("CVRecriaAnnotation");
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext();
		
		annotation.register(CEConfig.class);
		annotation.refresh();
		

		CERecria oCERecria = (CERecria) annotation.getBean("idRecria");
		CMRecria oCMRecria=(CMRecria) annotation.getBean("idCMRecria");
		
		oCMRecria.create();
		oCMRecria.read(4001);
		
		oCERecria=new CERecria(4001, "Yulia", "2222", "Hembra", 4,
				"etapMach", "etapHemb", 34.2, 30.2, 1);
		oCMRecria.update(oCERecria);
		oCMRecria.showAll();
		oCMRecria.delete(4010);
		oCMRecria.showAll();
		
		((ConfigurableApplicationContext) annotation).close();
	}
}
