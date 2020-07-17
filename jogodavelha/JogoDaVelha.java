import java.util.Scanner;
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
			partida.play();
		}

	}

}