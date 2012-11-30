package jogovelha;

public class Jogo {

	private Casa[] casas = new Casa[9];
	private Jogador jogador1;
	private Jogador jogador2;
  
	public Jogo()
	{
		for (int i = 0; i < casas.length; i++) {
			casas[i] = new Casa(Tile.VAZIO);
		}
	}
	
	public void init()
	{
		for (int i = 0; i < 10; i++) {
			casas[jogador1.jogar()] = new Casa(jogador1.getTipoJogo());
			casas[jogador2.jogar()] = new Casa(jogador2.getTipoJogo());
		}
		
	}
	
	
	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}

	public Casa[] getCasas() {
		return casas;
	}

	public void setCasas(Casa[] casas) {
		this.casas = casas;
	}
	
	public void imprimir()
	{
		for (int i = 0; i < casas.length; i++) {
			if(i==3 || i==6)
			System.out.println();
			
			System.out.print("|" + casas[i]+ "|");
			
		}
	}
		
}
