public class ComputadorC extends Computador {

	ComputadorC(String nome, String tipo) {
		super(nome,tipo);
	}
	
	/*metodo responsavel pelo algoritmo de escolha de qual quadrante será marcado pela maquinaC*/
	
	public int numberQuadranteC(Tabuleiro tabuleiro) {
		
		/*ComputadorC o quadrante marcado será o primeiro quadrante vazio a partir do inicio do tabuleiro*/
		
		/*Realiza um loop a partir do final sobre o tabuleiro até encontrar um quadrante vazio*/
				/*Ao encontrar um quadrante vazio, o mesmo é retornado*/
		for(int i=9; i > 0; i --) {
			switch(i) {
			case 1:
				if((tabuleiro.getQ1().getTipo()).equals(" "+"1"+" ")) {
					return 1;
				}else {
				}
			case 2:
				if((tabuleiro.getQ2().getTipo()).equals(" "+"2"+" ")) {
					return 2;
				}else {	
				}
			case 3:
				if((tabuleiro.getQ3().getTipo()).equals(" "+"3"+" ")) {
					return 3;
				}else {
				}
			case 4:
				if((tabuleiro.getQ4().getTipo()).equals(" "+"4"+" ")) {
					return 4;
				}else {
				}
			case 5:
				if((tabuleiro.getQ5().getTipo()).equals(" "+"5"+" ")) {
					return 5;
				}else {
				}
			case 6:
				if((tabuleiro.getQ6().getTipo()).equals(" "+"6"+" ")) {
					return 6;
				}else {
				}
			case 7:
				if((tabuleiro.getQ7().getTipo()).equals(" "+"7"+" ")) {
					return 7;
				}else {
				}
			case 8:
				if((tabuleiro.getQ8().getTipo()).equals(" "+"8"+" ")) {
					return 8;
				}else {
				}
			case 9:
				if((tabuleiro.getQ9().getTipo()).equals(" "+"9"+" ")) {
					return 9;
					
				}else {
				}
			}
		}
		
		return 400;
	}
	




}