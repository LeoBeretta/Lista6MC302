package ex04e5;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class AgregadorTopico extends Noticiario implements ConsomeNoticia {
	
	ArrayList<ConsomeNoticia> observers = new ArrayList<ConsomeNoticia>();
	int count = 0;
	String noticias = "";
	String topico;
	
	public AgregadorTopico(String topico) {
		this.topico = topico;
	}
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		if (topico == this.topico) {
			count++;
			noticias = noticias.concat(System.getProperty("line.separator")).concat(textoNoticia);
			if (count == 2) {	
				for (ConsomeNoticia obs : observers) {
					obs.notificaNoticia(noticias, dia, mes, topico);
				}
				noticias = "";
				count = 0;
			}
		}
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
