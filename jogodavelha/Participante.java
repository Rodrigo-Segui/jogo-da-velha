public class Participante {
	/*---Classe Partipante---*/
	/* classe Pai*/
		/*Jogador*/
		/*Computador*/
	
	private String nome;
	private String tipo;

	/*responsavel por setar*/
	/*nome de cada jogador participante*/
	/*tipo de cada jogador participante*/

	public Participante(String nome, String tipo) {
		this.nome  = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return this.nome;
	}
	public String getTipo() {
		return this.tipo;
	}

}