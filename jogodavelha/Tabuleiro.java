public class Tabuleiro {
	
			/*CLASSE TABULEIRO*/
/*------------------Cria o Tabuleiro, assim como cada quadrante-------------------------------*/
	
	private Quadrante q1;
	private Quadrante q2;
	private Quadrante q3;
	private Quadrante q4;
	private Quadrante q5;
	private Quadrante q6;
	private Quadrante q7;
	private Quadrante q8;
	private Quadrante q9;

	private Participante participanteAtual;
	private int nJogada = 0;

	/*--------------------------construtor- cria cada quadrante-------------------------------*/
	public Tabuleiro() {
		this.q1 = new Quadrante("1");
		this.q2 = new Quadrante("2");
		this.q3 = new Quadrante("3");
		this.q4 = new Quadrante("4");
		this.q5 = new Quadrante("5");
		this.q6 = new Quadrante("6");
		this.q7 = new Quadrante("7");
		this.q8 = new Quadrante("8");
		this.q9 = new Quadrante("9");
		this.participanteAtual = null;
		
		
	}
/*--------------------------------------------getters de cada quadrante---------------------------------------*/

	public Quadrante getQ1() {
		return q1;
	}

	public Quadrante getQ2() {
		return q2;
	}

	public Quadrante getQ3() {
		return q3;
	}

	public Quadrante getQ4() {
		return q4;
	}

	public Quadrante getQ5() {
		return q5;
	}

	public Quadrante getQ6() {
		return q6;
	}

	public Quadrante getQ7() {
		return q7;
	}

	public Quadrante getQ8() {
		return q8;
	}

	public Quadrante getQ9() {
		return q9;
	}
/*-------------------------metodo responsavel por desenha o tabuleiro-----------------------------------*/
									/* --------------------
									 	 1	|	2	|  3
									   --------------------
									 	 4	|	5	|  6
									   --------------------
										 7	|	8	|  9
									   --------------------*/
	public void desenharTabuleiro() {
		for(int i=0; i<13;i++) {
			System.out.print(".");
		}
		System.out.print("\r\n");
		String formato = "";
		for (int j=0; j <3; j++) {
			for (int l =0; l<3; l++) {
				formato+="|%s";	
			}
			formato+="|\r\n";
			for (int m =0; m<13; m++) {
				formato+="'";
			}
			formato+="\r\n";
		}
		System.out.printf(formato,
				this.q1.getTipo(),
				this.q2.getTipo(),
				this.q3.getTipo(),
				this.q4.getTipo(),
				this.q5.getTipo(),
				this.q6.getTipo(),
				this.q7.getTipo(),
				this.q8.getTipo(),
				this.q9.getTipo()
				);
	}
	
	public int getNJogada() {
		return this.nJogada;
	}
	
/*-------------------------------metodo responsavel por realizar jogadas------------------------------------*/
	public void jogar(int quadrante) {
		
		/*Seleciona tipo do participante(0 -> maquina, X-> humano) e preenche o quadrante*/
		if (this.participanteAtual!=null) {
			switch (quadrante) {
				case 1:
					this.q1.setTipo(this.participanteAtual.getTipo());
					this.q1.preencher(); 
				break;
				case 2:
					this.q2.setTipo(this.participanteAtual.getTipo());
					this.q2.preencher(); 
				break;
				case 3:
					this.q3.setTipo(this.participanteAtual.getTipo());
					this.q3.preencher(); 
				break;
				case 4:
					this.q4.setTipo(this.participanteAtual.getTipo());
					this.q4.preencher(); 
				break;
				case 5:
					this.q5.setTipo(this.participanteAtual.getTipo());
					this.q5.preencher(); 
				break;
				case 6:
					this.q6.setTipo(this.participanteAtual.getTipo());
					this.q6.preencher(); 
				break;
				case 7:
					this.q7.setTipo(this.participanteAtual.getTipo());
					this.q7.preencher(); 
				break;
				case 8:
					this.q8.setTipo(this.participanteAtual.getTipo());
					this.q8.preencher(); 
				break;
				case 9:
					this.q9.setTipo(this.participanteAtual.getTipo());
					this.q9.preencher(); 
				break;
				default:
				 break;
			}
		}
		nJogada++;
	}
/*--------------------------------------getter e setter partipanteAtual---------------------------------------*/	
	public Participante getparticipanteAtual() {
		return this.participanteAtual;
	}
	public void setparticipanteAtual(Participante participanteAtual){
		this.participanteAtual = participanteAtual;
	}
	
/*--------------------------------metodo reponsavel por verificar se há um vencedor--------------------------*/
	public boolean ganhou() {
		
		/*Verifica se quadrante 1, 2, 3 estão preenchidos com mesmo tipo*/
		if (q1.isPreenchido()&&q2.isPreenchido()&&q3.isPreenchido()) {
			if ( q1.getTipo().equals(q2.getTipo()) && q2.getTipo().equals(q3.getTipo())) {
				return true;
			}
		}
		/*Verifica se quadrante 4, 5, 6 estão preenchidos com mesmo tipo*/
		if (q4.isPreenchido()&&q5.isPreenchido()&&q6.isPreenchido()) {
			if ( q4.getTipo().equals(q5.getTipo()) && q5.getTipo().equals(q6.getTipo())) {
				return true;
			}
		}
		/*Verifica se quadrante 7, 8, 9 estão preenchidos com mesmo tipo*/
		if (q7.isPreenchido()&&q8.isPreenchido()&&q9.isPreenchido()) {
			if ( q7.getTipo().equals(q8.getTipo()) && q8.getTipo().equals(q9.getTipo())) {
				return true;
			}
		}
		/*Verifica se quadrante 1, 5, 9 estão preenchidos com mesmo tipo*/
		if (q1.isPreenchido()&&q5.isPreenchido()&&q9.isPreenchido()) {
			if ( q1.getTipo().equals(q5.getTipo()) && q5.getTipo().equals(q9.getTipo())) {
				return true;
			}
		}
		/*Verifica se quadrante 3, 5, 7 estão preenchidos com mesmo tipo*/
		if (q3.isPreenchido()&&q5.isPreenchido()&&q7.isPreenchido()) {
			if ( q3.getTipo().equals(q5.getTipo()) && q5.getTipo().equals(q7.getTipo())) {
				return true;
			}
		}
		/*Verifica se quadrante 1, 4, 7 estão preenchidos com mesmo tipo*/
		if (q1.isPreenchido()&&q4.isPreenchido()&&q7.isPreenchido()) {
			if ( q1.getTipo().equals(q4.getTipo()) && q4.getTipo().equals(q7.getTipo())) {
				return true;
			}
		}
		/*Verifica se quadrante 2, 5, 8 estão preenchidos com mesmo tipo*/
		if (q2.isPreenchido()&&q5.isPreenchido()&&q8.isPreenchido()) {
			if ( q2.getTipo().equals(q5.getTipo()) && q5.getTipo().equals(q8.getTipo())) {
				return true;
			}
		}
		/*Verifica se quadrante 3, 6, 9 estão preenchidos com mesmo tipo*/
		if (q3.isPreenchido()&&q6.isPreenchido()&&q9.isPreenchido()) {
			if ( q3.getTipo().equals(q6.getTipo()) && q6.getTipo().equals(q9.getTipo())) {
				return true;
			}
		}

		return false;
	}


}