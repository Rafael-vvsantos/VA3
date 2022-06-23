package Va3;
import java.util.*;

public class Jogador {
	private String nome;
	private String raca;
	private Castelo castelo;
	private Tesouro list;
	private Masmorra list1;
	private Arma arma;
	protected int maxValue;
	
	Jogador(String nome, String raca,Castelo castelo, Arma arma) {
		this.nome = nome;
		this.raca = raca;
		this.castelo = castelo;
		this.arma = arma;
		
	}
	
	private List<Tesouro> tesourosEncontrados = new ArrayList<Tesouro>();
	
	private List<Masmorra> masmorraVisitdadas = new ArrayList<Masmorra>();
	
	public int calcularTotal() {
		return tesourosEncontrados.size();
	}
	
	public int retornarTesouroMaiorValor() {
		for (int i = 0; i < tesourosEncontrados.size(); i++) {
            if (tesourosEncontrados.get(i).getValor() > maxValue)
                maxValue = (int) tesourosEncontrados.get(i).getValor();
        }
		return maxValue;
	}
	
	public void adicionarTesourosEncontrados(Tesouro list) {
		tesourosEncontrados.add(list);
    }
	
	public void adicionarmasmorraVisitdadas(Masmorra list1) {
		masmorraVisitdadas.add(list1);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Castelo getCastelo() {
		return castelo;
	}

	public void setCastelo(Castelo castelo) {
		this.castelo = castelo;
	}

	public Tesouro getList() {
		return list;
	}

	public void setList(Tesouro list) {
		this.list = list;
	}

	public Masmorra getList1() {
		return list1;
	}

	public void setList1(Masmorra list1) {
		this.list1 = list1;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public List<Tesouro> getTesourosEncontrados() {
		return tesourosEncontrados;
	}

	public void setTesourosEncontrados(List<Tesouro> tesourosEncontrados) {
		this.tesourosEncontrados = tesourosEncontrados;
	}

	public List<Masmorra> getMasmorraVisitdadas() {
		return masmorraVisitdadas;
	}

	public void setMasmorraVisitdadas(List<Masmorra> masmorraVisitdadas) {
		this.masmorraVisitdadas = masmorraVisitdadas;
	}
	
	
	
	
}
