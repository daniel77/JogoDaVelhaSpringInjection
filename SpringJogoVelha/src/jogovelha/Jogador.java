package jogovelha;

import java.util.Random;

public class Jogador {
	
	public Jogador() {
		super();

	}
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	
	public Jogador(String nome, Tile tipoJogo) {
		super();
		this.nome = nome;
		this.tipoJogo = tipoJogo;
	}
	
	public int jogar()
	{
		return new Random().nextInt(9);
	}

	private String nome;
	private Tile tipoJogo;

	public Tile getTipoJogo() {
		return tipoJogo;
	}

	public void setTipoJogo(Tile tipoJogo) {
		this.tipoJogo = tipoJogo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
