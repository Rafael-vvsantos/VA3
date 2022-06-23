package Va3;

public class Arma {
	private String nome ;
	private TipoArma tipo;
	private int poderDeAtaque;
	protected int aux;
	
	Arma(String nome, TipoArma tipo , int poder){
		this.nome = nome;
		this.tipo = tipo;
		this.poderDeAtaque = poder;
	}
	
	public int danoDaArma() {
		this.getPoderDeAtaque();
		
		if(this.getTipo() == TipoArma.Espada ) {
			this.aux = this.getPoderDeAtaque() * 2 ;
			this.setPoderDeAtaque(aux);
			return this.getPoderDeAtaque();
		}else 
			if(this.getTipo() == TipoArma.Machado ) {
			this.aux = this.getPoderDeAtaque() * 3;
			this.setPoderDeAtaque(aux);
			
			return this.getPoderDeAtaque();
		}else 
			this.aux = this.getPoderDeAtaque() * 1;
			this.setPoderDeAtaque(aux);
			return this.getPoderDeAtaque();
	};
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoArma getTipo() {
		return tipo;
	}
	public void setTipo(TipoArma tipo) {
		this.tipo = tipo;
	}
	public int getPoderDeAtaque() {
		return poderDeAtaque;
	}
	public void setPoderDeAtaque(int poderDeAtaque) {
		this.poderDeAtaque = poderDeAtaque;
	}
	
	
}
