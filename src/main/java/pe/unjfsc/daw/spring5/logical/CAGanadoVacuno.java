package pe.unjfsc.daw.spring5.logical;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;

public abstract class CAGanadoVacuno {
	public abstract void create();
	public abstract void read(int cuia);
	public abstract void update(CEGanadoVacuno oCEHembraBovina2);
	public abstract void delete(int cuia);
	public abstract void showAll();
}
 