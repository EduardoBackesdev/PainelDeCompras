package desafioOOP;
import java.util.ArrayList;

public class produto {

    ArrayList<String> produtos = new ArrayList<>();
    ArrayList<Integer> quantidadeProdutos = new ArrayList<>();

    public void adicionarProduto(String nomeProduto){
        boolean prod =  produtos.add(nomeProduto);
    }

    public void adicionarQuantidade (int quantidade){
        boolean quantidadeProd = quantidadeProdutos.add(quantidade);
    }

    public void listaProdutos(){
        for(String produto : produtos){
            System.out.println(produto);
        }
    }

    public void listaQuantidade(){
        for(int quantidade : quantidadeProdutos){
            System.out.println(quantidade);
        }
    }










}
