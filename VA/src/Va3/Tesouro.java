package Va3;

public abstract class Tesouro {
	private String tipo;
	private float valor;
	
	
	public abstract  float calcularQuantia();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
