import java.util.Scanner;

/*---Classe Pricipal Jogo da Velha---*/
/*Inicia a partida criando um objeto da classe Partida()*/
/*Solicita um input com |0|cancelar partida ou |1| iniciar a partida*/
	/*Se |0| o programa será finalizado*/
    /*Se |1| o programa será redirecionado para o metodo iniciarpartida() da classe Partida*/
public class JogoDaVelha {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("\nIniciando Partida :)\n");
			Partida partida = new Partida();
			System.out.println("\nPartida Configurada, Vamos iniciar?");
			System.out.println("|0| cancelar partida");
			System.out.println("|1| iniciar  partida");
			System.out.println("Opcao: ");
			
			int start = scan.nextInt();
			if (start==0) {
				System.out.println("A partida terminou!");
				break;
			}
			partida.iniciarpartida();
		}

	}

}