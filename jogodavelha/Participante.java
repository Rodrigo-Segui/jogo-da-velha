public class Participante {

	private String nome;
	private String tipo;

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