package pe.unjfsc.daw.spring5.logical;

import pe.unjfsc.daw.spring5.entity.CERecria;

public abstract class CARecria {
	public abstract void create();
	public abstract void read(int _idRecria);
	public abstract void update(CERecria _oCERecria);
	public abstract void delete(int _idRecria);
	public abstract void showAll();
}
 