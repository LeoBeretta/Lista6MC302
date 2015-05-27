package ex02;

public class RoboProdutoQuimico implements RoboAction {
	
	private Ambient ambient;
	
	public RoboProdutoQuimico(Ambient amb) {
		this.ambient = amb;
	}

	@Override
	public void execute() {
		ambient.ativaProduto("Produto X");
	}
}
