package ex04e5;

public class Assinante implements ConsomeNoticia {

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println(textoNoticia + "," + dia + "," + mes + "," + topico);
	}
	
	public void subscribe(NoticiarioAssina subject) {
		subject.attach(this);
	}
	
}
