import java.util.Scanner;
import java.util.Random;
public class Partida {
	private Scanner scan;
	private Jogador jogador1;
	private Jogador jogador2;
	private int controleJogada;
	private Tabuleiro tabuleiro;

	public Partida() {
		scan = new Scanner(System.in);
		Random rnd = new Random();
		int tmp = rnd.nextInt(2);
		controleJogada = 2;
		if (tmp<2) {
			controleJogada = 1;
		}
		tabuleiro = new Tabuleiro();
		System.out.println("Você será o Jogador X, Digite Seu Nome :");
		String nome1 = scan.next();
		this.jogador1 = new Jogador(nome1,"X");
		System.out.println("O Computador será o Jogador O, Escolha a opcão de Máquina: ");
		System.out.println("|0| ComputadorA");
		System.out.println("|1| ComputadorB");
		System.out.println("|2| ComputadorC");
		System.out.println("Opcao: ");
		int opcaoComputador = scan.nextInt();
		if (opcaoComputador == 0) {
			String nome2 = "ComputadorA";
			this.jogador2 = new Jogador(nome2,"O");
		}else if(opcaoComputador  == 1) {
			String nome2 = "ComputadorB";
			this.jogador2 = new Jogador(nome2,"O");
		}else if(opcaoComputador == 2) {
			String nome2 = "ComputadorC";
			this.jogador2 = new Jogador(nome2,"O");
		}else {
			System.out.println("Opção Padrao ComputadorA");
			String nome2 = "ComputadorA";
			this.jogador2 = new Jogador(nome2,"O");
		}
	}

	public void play() {
		tabuleiro.desenharTabuleiro();
		while (!tabuleiro.ganhou() && tabuleiro.getNJogada()<9) {
			if (controleJogada==1) {
				controleJogada=2;
				tabuleiro.setJogadorAtual(jogador1);
			} else if (controleJogada==2) {
				controleJogada=1;
				tabuleiro.setJogadorAtual(jogador2);
			}
			System.out.printf("%s é a sua vez! informe o número do quadrante que deseja marcar!\r\n",tabuleiro.getJogadorAtual().getNome());
			int num = scan.nextInt();
			tabuleiro.jogar(num);
			tabuleiro.desenharTabuleiro();
			if  (tabuleiro.ganhou()) {
				break;
			}
		}
		if (tabuleiro.ganhou()) {
			Jogador vencedor = tabuleiro.getJogadorAtual();
			System.out.printf("%s você ganhou!!",vencedor.getNome());
		} else {
			System.out.println("Ninguém ganhou!");
		}
	}

}