package Va3;

public class Ouro extends Tesouro{
	
	Ouro( String tipo, int valor ){
		this.setTipo(tipo);
		this.setValor(valor);
	}
	
	@Override
	public float calcularQuantia() {
	
		return this.getValor();
	}

}
