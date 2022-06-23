package Va3;

public class Bau extends Tesouro {
	public float multiplicador;
	protected float aux;
	
	Bau (float multi, String tipo, int valor ){
		this.multiplicador = multi;
		this.setTipo(tipo);
		this.setValor(valor);
	}
	
	@Override
	public float calcularQuantia() {
		aux  = this.multiplicador * this.getValor() ;
		return aux;
	}
}
