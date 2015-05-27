package ex03;

import java.util.Random;

import ex02.*;

public class ExperimentoMonitorado extends Experimento {
	
	private int micro = 0;
	private enum tipoMutacao {TROCA,AUSENTE,DUPLICADA}
	
	
	public int contaMicro() {
		return this.micro;
	}
	
	public Experimento cloneMutant() {
		Experimento expMut;
		Random rnd = new Random();
		tipoMutacao mutation;
		int pos;
		
		expMut = super.clona();
		mutation = tipoMutacao.values()[rnd.nextInt(2)];
		pos = rnd.nextInt(super.lista.size()-1);
		
		switch (mutation) {
		case TROCA:
			RoboAction r1, r2;
			int pos2 = rnd.nextInt(super.lista.size()-1);
			r1 = expMut.getElementLista(pos);
			r2 = expMut.getElementLista(pos2);
			expMut.addLista(r1, pos2);
			expMut.addLista(r2, pos);
			break;
		case AUSENTE:
			expMut.removeLista(pos);
			break;
		case DUPLICADA:
			expMut.addLista(expMut.getElementLista(pos));
			break;
		}
		
		return expMut;
	}
	
}
