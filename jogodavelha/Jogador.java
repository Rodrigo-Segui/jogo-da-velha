import java.util.Scanner;

public class Jogador extends Participante{

	/*---Classe Jogador---*/
	/* classe filha da Participante */
	/*responsavel por setar*/
		/*nome de cada jogador participante*/
		/*tipo de cada jogador participante*/

	public Jogador(String nome, String tipo) {
		super(nome,tipo);
	}
	
		/*metodo responsavel por receber o input e retornar o quadrante escolhido pelo usuario*/
	public int inputNumeroQuadrante(Tabuleiro tabuleiro) {
		
		boolean preenchido = true;
		Scanner scan = new Scanner(System.in);
		while(preenchido == true) {
			
			int input = scan.nextInt();
			
				switch(input) {
					case 1:
						if((tabuleiro.getQ1().getTipo()).equals(" "+"1"+" ")) {
							preenchido = false;
							return 1;
						}else {
							System.out.println("\nQuadrante ja preenchido, digite novamente:");
							preenchido = true;
							break;
						}
						
					case 2:
						if((tabuleiro.getQ2().getTipo()).equals(" "+"2"+" ")) {
							preenchido = false;
							return 2;
						}else {
							System.out.println("\nQuadrante ja preenchido, digite novamente:");
							break;
						}
					case 3:
						if((tabuleiro.getQ3().getTipo()).equals(" "+"3"+" ")) {
							preenchido = false;
							return 3;
						}else {
							System.out.println("\nQuadrante ja preenchido, digite novamente:");
							break;
						}
					case 4:
						if((tabuleiro.getQ4().getTipo()).equals(" "+"4"+" ")) {
							preenchido = false;
							return 4;
						}else {
							System.out.println("\nQuadrante ja preenchido, digite novamente:");
							break;
						}
					case 5:
						if((tabuleiro.getQ5().getTipo()).equals(" "+"5"+" ")) {
							preenchido = false;
							return 5;
						}else {
							System.out.println("\nQuadrante ja preenchido, digite novamente:");
							break;
						}
					case 6:
						if((tabuleiro.getQ6().getTipo()).equals(" "+"6"+" ")) {
							preenchido = false;
							return 6;
						}else {
							System.out.println("\nQuadrante ja preenchido, digite novamente:");
							break;
						}
					case 7:
						if((tabuleiro.getQ7().getTipo()).equals(" "+"7"+" ")) {
							preenchido = false;
							return 7;
						}else {
							System.out.println("\nQuadrante ja preenchido, digite novamente:");
							break;
						}
					case 8:
						if((tabuleiro.getQ8().getTipo()).equals(" "+"8"+" ")) {
							preenchido = false;
							return 8;
						}else {
							System.out.println("\nQuadrante ja preenchido, digite novamente:");
							break;
						}
					case 9:
						if((tabuleiro.getQ9().getTipo()).equals(" "+"9"+" ")) {
							preenchido = false;
							return 9;
							
						}else {
							System.out.println("\nQuadrante ja preenchido, digite novamente:");
							break;
						}
					default: 
						System.out.println("\nQuadrante invalido, digite novamente:");
						break;
				}
			
			}

		
			return 400;
	
		//
	}


	
}