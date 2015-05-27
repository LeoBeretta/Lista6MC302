package ex04e5;

public class Publicador implements ConsomeNoticia {
	
	private String name;
	
	public Publicador(String name) {
		this.name = name;
	}
	
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println(textoNoticia + "," + dia + "," + mes + "," + topico + "    Publicado por " + name + System.getProperty("line.separator"));
	}
	
	public void subscribe(Noticiario subject) {
		subject.attach(this);
	}
	
}
