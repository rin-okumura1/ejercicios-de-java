package ensayo;

public class Calculadora {
	public static int sumar(int n1,int n2) {
		return n1+n2;
	}

	public static int multiplicar(int n1,int n2) {
		return n1*n2;
	}
	public static int restar(int n1,int n2) {
		return n1-n2;
	}
	public static int dividir(int n1,int n2) {
		if(n1==0 || n2==0) {
			return 0;
		}
		else {
			return n1/n2;	
		}
		
	}
}
