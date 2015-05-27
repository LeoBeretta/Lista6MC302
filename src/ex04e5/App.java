package ex04e5;

public class App {

	public static void main(String[] args) {
		NoticiarioAssina subject = new NoticiarioAssina();
		Publicador p1 = new Publicador("p1");
		Publicador p2 = new Publicador("p2");
		Publicador p3 = new Publicador("p3");
		Publicador p4 = new Publicador("p4");
		Publicador p5 = new Publicador("p5");
		Publicador p6 = new Publicador("p6");
		AgregadorMes    agrmes = new AgregadorMes();
		AgregadorTopico agrtop = new AgregadorTopico("Donuts");
		
		
		p1.subscribe(subject);
		p2.subscribe(agrmes);
		p3.subscribe(agrtop);
		agrmes.subscribe(subject);
		agrtop.subscribe(subject);
		
		
		subject.notificaNoticia("Noticia1", 10, 1, "Donuts");
		subject.notificaNoticia("Noticia2", 15, 1, "Donutss");
		subject.notificaNoticia("Noticia3", 18, 1, "Donuts");
		subject.notificaNoticia("Noticia4", 25, 1, "Donutss");
		subject.notificaNoticia("Noticia5", 10, 2, "Donuts");
		subject.notificaNoticia("Noticia6", 17, 2, "Donutss");
		subject.notificaNoticia("Noticia7", 18, 3, "Donuts");
		subject.notificaNoticia("Noticia8", 19, 3, "Donutss");
		subject.notificaNoticia("Noticia9", 22, 3, "Donutss");
		subject.notificaNoticia("Noticia10", 28, 3, "Donutss");
		
		
	}

}
