import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	public void compraAVista(){
	Compra c = new Compra(500);
	assertEquals(1, c.getnumeroParcelas());
	assertEquals(500, c.getValorTotal());
	assertEquals(500, c.getvalorParcela());
	}


	@Test
	public void compraParcelada(){
	Compra c = new Compra(4, 250);
	assertEquals(4, c.getnumeroParcelas());
	assertEquals(1000, c.getValorTotal());
	assertEquals(250, c.getvalorParcela());
	}

}
