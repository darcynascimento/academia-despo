
public class Compra{
int valorTotal;
int numeroParcelas;
int valorParcela;


//� vista
public Compra(int valor){
valorTotal = valor;
numeroParcelas = 1;
}


//parcelado
public Compra(int qtdParcelas, int valorPacela){
numeroParcelas = qtdParcelas;
valorTotal = valorParcela * qtdParcelas;
}


public int getValorTotal(){
return valorTotal;
}


public int getnumeroParcelas(){
return numeroParcelas;
}

public int getvalorParcela(){
return valorTotal/numeroParcelas;
}


}