package ex02;

import java.util.ArrayList;

public class Experimento {
	protected ArrayList<RoboAction> lista = new ArrayList<RoboAction>();

	public void addLista(RoboAction r) {
		this.lista.add(r);
	}
	
	public void addLista(RoboAction r, int index) {
		this.lista.add(index, r);
	}
	
	public void removeLista(int index) {
		this.lista.remove(index);
	}
	
	public RoboAction getElementLista(int index) {
		return this.lista.get(index);
	}
	
	public void executeExperiment() {
		for (RoboAction ra : lista) {
			ra.execute();
		}
	}
	
	
	
	public Experimento clona() {
		Experimento exp2 = new Experimento();
		for (RoboAction r : lista) {
			exp2.addLista(r);
		}
		
		return exp2;
	}
	
}