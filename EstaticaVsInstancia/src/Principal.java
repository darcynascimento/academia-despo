
public class Principal {

	public static void main(String[] args) {
		Somador soma1 = new Somador();
		soma1.nome = "Somador1";
		Somador soma2 = new Somador();
		soma2.nome = "Somador2";
		Somador soma3 = new Somador();
		soma3.nome = "Somador3";
	

		for(int i=0; i<3; i++) {
			soma1.somar();
			soma2.somar();
			soma3.somar();
			
		}
		
		soma1.imprimir();
		soma2.imprimir();
		soma3.imprimir();

	}
}