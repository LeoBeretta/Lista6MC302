package ex04e5;

import java.util.ArrayList;

public class NoticiarioAssina extends Noticiario {
	
	ArrayList<ConsomeNoticia> observers = new ArrayList<ConsomeNoticia>();
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		for (ConsomeNoticia obs : observers) {
			obs.notificaNoticia(textoNoticia, dia, mes, topico);
		}
	}
	
	@Override
	public void attach(ConsomeNoticia observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void detach(ConsomeNoticia observer) {
		this.observers.remove(observer);
	}
	
}
