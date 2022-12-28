
public class Pontos {
	
	static int Acerto = 0;
	static int Erro = 0;
	
	public static void  Acertou() {
		Acerto++;
	}
	
	public static void  Errou() {
		Erro++;
	}
	
	public static int getAcertos() {
		return Acerto;
	}public static int getErros() {
		return Erro;
	}
	
}
