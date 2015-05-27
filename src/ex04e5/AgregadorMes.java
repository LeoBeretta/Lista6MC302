package ex04e5;

import java.util.ArrayList;

public class AgregadorMes extends Noticiario implements ConsomeNoticia {
	
	ArrayList<ConsomeNoticia> observers = new ArrayList<ConsomeNoticia>();
	int mes = 0;
	String noticias = "";
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		
		if (this.mes == 0) {
			this.mes = mes;
		} else if (this.mes != mes) {
			for (ConsomeNoticia obs : observers) {
				obs.notificaNoticia(noticias, 0, mes, "Mensal");
			}
			this.mes = mes;
			noticias = "";
		}
		noticias = noticias.concat(System.getProperty("line.separator")).concat(textoNoticia).concat(" dia " + dia);
		
	}
	
	public void subscribe(NoticiarioAssina subject) {
		subject.attach(this);
	}
	
	public void attach(ConsomeNoticia observer) {
		this.observers.add(observer);
	}
	
	public void detach(ConsomeNoticia observer) {
		this.observers.remove(observer);
	}

}
