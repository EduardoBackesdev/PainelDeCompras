package desafioOOP;
import java.util.Scanner;

public class painelDeCompra {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        String sairFalso = "sim";
        String sairVerdadeiro = "";
        cliente Cliente = new cliente();
        produto Produto = new produto();
        compra Compras = new compra();

        // (PRIMEIRA MENSAGEM) digite seu nome e sua idade; YES
        System.out.println("Qual seu nome:");
        String nome = entrada.next();
        Cliente.setarCliente(nome);
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();
        Cliente.setarIdade(idade);

        while (!sairVerdadeiro.equals(sairFalso)){

        // (SEGUNDA MENSAGEM) adicione o produto;
        System.out.println("Adicione seu produto:");
        String nomeProduct = entrada.next();
        Produto.adicionarProduto(nomeProduct);

        // (TERCEISA MENSAGEM) digite o preco do produto;
        System.out.println("Qual o valor do produto:");
        double preco = entrada.nextDouble();
        Compras.adicionarPreco(preco);

        // (QUARTA MENSAGEM) digite a quantidade do produto;
        System.out.println("Quantidade do seu item:");
        int quantidade = entrada.nextInt();
        Produto.adicionarQuantidade(quantidade);

        //mensagem para sair da compra
        System.out.println("Desaja sair da compra, SIM ou NAO: ");
        String desejaSair = entrada.next();
        sairVerdadeiro = desejaSair;
        }

        // Total da compra e dados
        String retornaNome = Cliente.retornaNome();
        System.out.println("Nome do cliente:"+retornaNome);
        int retornaIdade = Cliente.retornaIdade();
        System.out.println("Idade do cliente:"+retornaIdade);

        System.out.println("Itens da sua compra:");
        Produto.listaProdutos();
        System.out.println("Quantidade de cada item:");
        Produto.listaQuantidade();
        Compras.totalCompra();






















    }
}


