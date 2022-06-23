package Va3;

public class Castelo {
	private int poderDeDefesa;
	private int vida;
	
	Castelo (int poder , int vida){
		this.poderDeDefesa = poder;
		this.vida = vida;
	}
	public boolean receberAtaque(int dano) {
		dano = this.getVida() - dano ;
		this.setVida(dano);
		return true;
	}

	public int getPoderDeDefesa() {
		return poderDeDefesa;
	}

	public void setPoderDeDefesa(int poderDeDefesa) {
		this.poderDeDefesa = poderDeDefesa;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
}
