public class Computador extends Participante {

	Computador(String nome, String tipo) {
		super(nome,tipo);
	}
	
	public int numberQuadrante(Tabuleiro tabuleiro) {
		
		for(int i=1; i < 10; i ++) {
			switch(i) {
			case 1:
				if((tabuleiro.getQ1().getTipo()).equals(" "+"1"+" ")) {
					System.out.println("IGUAL");
					return 1;
				}else {
					System.out.println("JA PREENCHIDO");
				}
			case 2:
				if((tabuleiro.getQ2().getTipo()).equals(" "+"2"+" ")) {
					System.out.println("IGUAL");
					return 2;
				}else {
					System.out.println("JA PREENCHIDO");
					
				}
			case 3:
				if((tabuleiro.getQ3().getTipo()).equals(" "+"3"+" ")) {
					System.out.println("IGUAL");
					return 3;
				}else {
					System.out.println("JA PREENCHIDO");
				}
			case 4:
				if((tabuleiro.getQ4().getTipo()).equals(" "+"4"+" ")) {
					System.out.println("IGUAL");
					return 4;
				}else {
					System.out.println("JA PREENCHIDO");
				}
			case 5:
				if((tabuleiro.getQ5().getTipo()).equals(" "+"5"+" ")) {
					System.out.println("IGUAL");
					return 5;
				}else {
					System.out.println("JA PREENCHIDO");
				}
			case 6:
				if((tabuleiro.getQ6().getTipo()).equals(" "+"6"+" ")) {
					System.out.println("IGUAL");
					return 6;
				}else {
					System.out.println("JA PREENCHIDO");
				}
			case 7:
				if((tabuleiro.getQ7().getTipo()).equals(" "+"7"+" ")) {
					System.out.println("IGUAL");
					return 7;
				}else {
					System.out.println("JA PREENCHIDO");
				}
			case 8:
				if((tabuleiro.getQ8().getTipo()).equals(" "+"8"+" ")) {
					System.out.println("IGUAL");
					return 8;
				}else {
					System.out.println("JA PREENCHIDO");
				}
			case 9:
				if((tabuleiro.getQ9().getTipo()).equals(" "+"9"+" ")) {
					System.out.println("IGUAL");
					return 9;
					
				}else {
					System.out.println("JA PREENCHIDO");
				}
			}
		}
		System.out.println("------");
		System.out.println(tabuleiro.getQ1().getTipo());
		System.out.println(tabuleiro.getQ2().getTipo());
        System.out.println(tabuleiro.getQ3().getTipo());
	
		System.out.println(tabuleiro.getQ4().getTipo());
		System.out.println(tabuleiro.getQ5().getTipo());
		System.out.println(tabuleiro.getQ6().getTipo());
		System.out.println(tabuleiro.getQ7().getTipo());
		System.out.println(tabuleiro.getQ8().getTipo());
		System.out.println(tabuleiro.getQ9().getTipo());
		
		
		
		return 7;
	}
	




}