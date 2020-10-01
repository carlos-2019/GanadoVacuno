package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CERecria;
import pe.unjfsc.daw.spring5.logical.impl.CMRecria;


public class CVRecriaXML {
	private static final Logger LOG = LoggerFactory.getLogger("CVRecriaXML");
	
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-recria.xml");
		
	
		CERecria oCERecria = (CERecria) oCntx.getBean("idCERecria");
		CMRecria oCMRecria=(CMRecria) oCntx.getBean("idobjCMRecria");
		LOG.info("CERecria {}",oCERecria);
		LOG.info("CERecria {}",oCMRecria);
		
		
        oCMRecria.create();
		oCMRecria.read(4001);
		
		oCERecria=new CERecria(4001, "Yulia", "2222", "Hembra", 4,
				"etapMach", "etapHemb", 34.2, 30.2, 1);
		oCMRecria.update(oCERecria);
		oCMRecria.showAll();
		oCMRecria.delete(4010);
		oCMRecria.showAll();
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
