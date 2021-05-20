package desafioletranumero;

public class Desafioletranumero {

	public static void main(String[] args) {
		
		String teste[] = {"1234,00 eur","1243,00 usd","14405,00 brl"};
		String resultado = "";
		for(int index = 0;index<teste.length;index++) {
			resultado = teste[index].substring(0,teste[index].indexOf(' '));
			System.out.println(resultado);
		}
	}

}
