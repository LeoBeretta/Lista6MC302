package ex02;

public class Ambient {
	
	private double temperatura = 30.0f;
	private String nomeProduto = null;
	private boolean produtoAtivado = false;
	
	public void MudaTemperatura(Double temp) {
		this.temperatura += temp;
		System.out.println("Nova temperatura: " + temperatura);
	}
	
	public void ativaProduto(String produto) {
		this.nomeProduto = produto;
		this.produtoAtivado = true;
		System.out.println("Produto Ativado: " + nomeProduto);
	}
}
