package Va3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Word!");
		Castelo castelo1 = new Castelo(100 , 200);
		
		Arma arma1 = new Arma("Machadinha" , TipoArma.Machado , 50);
		
		Masmorra masmorra1 = new Masmorra("Barbie" , "Kids" , 10);
		
		Jogador jogador1 = new Jogador("Rafael" , "Jup" , castelo1  , arma1 );//instancia do jogador
		
		Bau bau1 = new Bau(2 , "Bau Pirata" , 50);
		Bau bau2 = new Bau(2 , "Bau Perdido" , 80);
		Ouro our1 = new Ouro("Roubado" , 600);
		
		//Adiconando tesouros 
		jogador1.adicionarTesourosEncontrados(bau1);
		jogador1.adicionarTesourosEncontrados(bau2);
		jogador1.adicionarTesourosEncontrados(our1);
		
		System.out.println("Total de items " + jogador1.calcularTotal());
		System.out.println("Maior Valor do teosuro " + jogador1.retornarTesouroMaiorValor());
		System.out.println(arma1.getNome() +"  Dano da Arma " + arma1.danoDaArma());
	
		
		masmorra1.relatorio();
		System.out.println("Vida Castelo: " +castelo1.getVida()+ "  Dano: " +castelo1.receberAtaque(100));
		System.out.println("Apos o Dano:" +castelo1.getVida());
		
	}

}
