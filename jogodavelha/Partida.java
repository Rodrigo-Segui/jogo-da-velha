import java.util.Scanner;
import java.util.Random;
/*---Classe Partida---*/
/*Responsável por configurar a partida */

public class Partida {
	
	
	public ComputadorA maquinaA;
	private ComputadorB maquinaB;
	private ComputadorC maquinaC;
	private int controleJogada;
	private Scanner scan;
	private Jogador jogador;
	private Tabuleiro tabuleiro;
	private int escolhaMaquina;
	
/*-------get and setters metodo escolhaMaquina -------*/
	public int getEscolhaMaquina() {
		return escolhaMaquina;
	}

	public void setEscolhaMaquina(int escolhaMaquina) {
		this.escolhaMaquina = escolhaMaquina;
	}

	/*---------------------------------classe partida----------------------------------------------------*/
	public Partida() {
		scan = new Scanner(System.in);
		Random rnd = new Random();
		int tmp = rnd.nextInt(2);
		controleJogada = 2;
		if (tmp<2) {
			controleJogada = 1;
		}
		/*Configura o tabuleiro através da criação do objeto tabuleiro*/
		tabuleiro = new Tabuleiro();
		
		/*Solicita inputs do usuário e o configura como jogador X*/
		System.out.println("Você será o Jogador X, Digite Seu Nome :");
		String nome1 = scan.next();
		this.jogador = new Jogador(nome1,"X");
		
		/*Solicita ao usuário qual configuração de maquina ele quer enfrentar*/
		/*Existem três opçoes*/
			/*|0|ComputadorA escolhe o primeiro quadrante vazio a partir do inicio do tabuleiro para jogar*/
		    /*|1|ComputadorB escolhe o sorteia um quadrante vazio do tabuleiro para jogar*/
		    /*|2|ComputadorC escolhe o primeiro quadrante vazio a partir do final do tabuleiro para jogar*/
		System.out.println("O Computador será o Jogador O, Escolha uma opcão de Máquina: ");
		System.out.println("|0| ComputadorA");
		System.out.println("|1| ComputadorB");
		System.out.println("|2| ComputadorC");
		System.out.println("Opcao: ");
		int opcaoComputador = scan.nextInt();
		if (opcaoComputador == 0) {
			
			/*escolhe a maquinaA*/
			/*coloca 1 que é uma abstração para maquinaA*/
			String nome2 = "ComputadorA";
			this.maquinaA = new ComputadorA(nome2,"O");
			this.setEscolhaMaquina(1);
			System.out.println("\nVocê vai enfrentar o ComputadorA, Boa Sorte!\n");
			
		}else if(opcaoComputador  == 1) {
			
			/*escolhe a maquinaB*/
			/*coloca 2 que é uma abstração para maquinaA*/
			String nome2 = "ComputadorB";
			this.maquinaB = new ComputadorB(nome2,"O");
			this.setEscolhaMaquina(2);
			System.out.println("\nVocê vai enfrentar o ComputadorB, Boa Sorte!\n");
			
		}else if(opcaoComputador == 2) {
			
			/*escolhe a maquinaC*/
			/*coloca 3 que é uma abstração para maquinaA*/
			String nome2 = "ComputadorC";
			this.maquinaC = new ComputadorC(nome2,"O");
			this.setEscolhaMaquina(3);
			System.out.println("\nVocê vai enfrentar o ComputadorC, Boa Sorte!\n");
			
		}else {
			
			/*Se nenhum opçãofor escolhida, por padrão o usuario jogará com a maquinaA*/
			/*escolhe a maquinaA*/
			/*coloca 1 que é uma abstração para maquinaA*/
			System.out.println("Opção Padrão ComputadorA");
			System.out.println("\nVocê vai enfrentar o ComputadorA, Boa Sorte!\n");
			String nome2 = "ComputadorA";
			this.maquinaA = new ComputadorA(nome2,"O");
			this.setEscolhaMaquina(1);
			
		}
	}
/*---------------------------------classe iniciarPartida----------------------------------------------------*/
	public void iniciarpartida() {
		
		/*partida roda enquanto ninguem ganhar ou o numero da jogada ser menor que 9 */
		while (!tabuleiro.ganhou() && tabuleiro.getNJogada()<9) {
			
			/* controla de quem é a vez de jogar*/
			/* |1| Rodada da maquina*/
			/* |2| Rodada do humano*/
			if (controleJogada==1) {
				controleJogada=2;
				/* set jogador como participante da rodada*/
				tabuleiro.setparticipanteAtual(jogador);
				System.out.printf("\n%s é a sua vez! informe o número do quadrante que deseja marcar: \r\n",tabuleiro.getparticipanteAtual().getNome());
			} else if (controleJogada==2) {
				controleJogada=1;
				/* set maquina(dependendo da escolha) como participante da rodada*/
				if(getEscolhaMaquina() == 1) {
					tabuleiro.setparticipanteAtual(maquinaA);
					System.out.printf("\nRodada da %s ! Aguarde...\r\n",tabuleiro.getparticipanteAtual().getNome());
				}else if(getEscolhaMaquina() == 2){
					tabuleiro.setparticipanteAtual(maquinaB);
					System.out.printf("\nRodada da %s ! Aguarde...\r\n",tabuleiro.getparticipanteAtual().getNome());
				}else if(getEscolhaMaquina() == 3) {
					tabuleiro.setparticipanteAtual(maquinaC);
					System.out.printf("\nRodada da %s ! Aguarde...\r\n",tabuleiro.getparticipanteAtual().getNome());
				}else {
					return;
				}
			}
			
			
			/*metodo desenha formato do tabuleiro*/
			System.out.println("\n---Tabuleiro Atualizado!---\n");
			tabuleiro.desenharTabuleiro();
			
			if(controleJogada==2) {
				/*Rodada do Jogador*/
				/*Solicita o input do quadrante a ser marcado*/
			int num = jogador.inputNumeroQuadrante(tabuleiro);
			System.out.printf("\nQuadrante escolhido: %d. Marcando Tabuleiro ...", num);
			tabuleiro.jogar(num);
			}else{
				/*Rodada da Maquina*/
				/*Joga a partir do algoritmos especifico da maquina escolhida*/
				if(getEscolhaMaquina() == 1) {
					
					/*ComputadorA o quadrante marcado será o primeiro quadrante vazio a partir do inicio do tabuleiro*/
					int num = maquinaA.numberQuadranteA(tabuleiro);
					System.out.printf("\nQuadrante escolhido: %d. Marcando Tabuleiro ...", num);
					tabuleiro.jogar(num);
					
				}else if(getEscolhaMaquina() == 2){
					
					/*ComputadorB quadrante marcado será escolhido a partir do sorteio de um quadrante vazio do tabuleiro para jogar*/
					int num = maquinaB.numberQuadranteB(tabuleiro);
					System.out.printf("\nQuadrante escolhido: %d. Marcando Tabuleiro ...", num);
					tabuleiro.jogar(num);
					
				}else if(getEscolhaMaquina() == 3) {
					
					/*ComputadorA o quadrante marcado será o primeiro quadrante vazio a partir do final do tabuleiro*/
					int num = maquinaC.numberQuadranteC(tabuleiro);
					System.out.printf("\nQuadrante escolhido: %d. Marcando Tabuleiro ...", num);
					tabuleiro.jogar(num);
					
				}else {
					return;
				}
				
				
			}
			
			/*redesenha tabuleiro após jogada*/
			System.out.println("\n---Tabuleiro Atualizado!---\n");
			tabuleiro.desenharTabuleiro();
			
			/*verifica se alguem ganhou*/
			if  (tabuleiro.ganhou()) {
				break;
			}
		}
		if (tabuleiro.ganhou()) {
			
			/*Se obtivemos um vencedor será retornado o nome input no inicio do programa*/
			Participante vencedor = tabuleiro.getparticipanteAtual();
			System.out.printf("%s você ganhou!!",vencedor.getNome());
			
		} else {
			
			/*Se obtivemos não um vencedor será retornado a string ninguem ganhou*/
			System.out.println("Ninguém ganhou!");
			
		}
	}

}