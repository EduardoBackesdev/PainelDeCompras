package desafioOOP;
import java.util.ArrayList;

public class compra {
    ArrayList<Double> precoProdutos = new ArrayList<>();


    public void adicionarPreco (double preco){
        boolean precoProd = precoProdutos.add(preco);
    }

    public void totalCompra(){
        double total = 0;
        for (double preco : precoProdutos){
            total += preco;
        };
        System.out.println("Valor total da compra: R$"+total);
    }






}
