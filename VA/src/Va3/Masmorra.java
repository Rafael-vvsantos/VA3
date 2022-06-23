package Va3;

public class Masmorra {
	private String nome;
	private String nivelDeDificuldade;
	private int ouroASerEncontrado;
	
	Masmorra(String nome, String nivel, int ouro){
		this.nome = nome;
		this.nivelDeDificuldade = nivel;
		this.ouroASerEncontrado = ouro;
	}
	
	
	public void relatorio() {
		System.out.println("Relatorio Masmorra");
		System.out.println(this.getNome());
		System.out.println(this.getNivelDeDificuldade());
		System.out.println(this.getOuroASerEncontrado());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivelDeDificuldade() {
		return nivelDeDificuldade;
	}

	public void setNivelDeDificuldade(String nivelDeDificuldade) {
		this.nivelDeDificuldade = nivelDeDificuldade;
	}

	public int getOuroASerEncontrado() {
		return ouroASerEncontrado;
	}

	public void setOuroASerEncontrado(int ouroASerEncontrado) {
		this.ouroASerEncontrado = ouroASerEncontrado;
	}
}
