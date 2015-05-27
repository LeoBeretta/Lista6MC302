package ex02;

public class App {

	public static void main(String args[]) {
		Ambient ambient = new Ambient();
		RoboProdutoQuimico rQuimico = new RoboProdutoQuimico(ambient);
		RoboTemperatura rTemperatura = new RoboTemperatura(ambient);
		
		Experimento exp1 = new Experimento();
		Experimento exp2 = new Experimento();
		
		exp1.addLista(rTemperatura);
		exp1.addLista(rTemperatura);
		exp1.addLista(rTemperatura);
		exp1.addLista(rTemperatura);
		exp1.addLista(rTemperatura);
		exp1.addLista(rQuimico);
		exp1.addLista(rTemperatura);
		exp1.addLista(rTemperatura);
		exp1.addLista(rTemperatura);
		
		exp1.executeExperiment();
		exp2 = exp1.clona();
		
		exp2.executeExperiment();
		
	}
	
}
