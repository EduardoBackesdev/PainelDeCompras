package desafioOOP;

import java.util.ArrayList;

public class cliente {

    private String nomeCliente;
    private int idadeCliente;

    public void setarCliente(String nome){
        this.nomeCliente = nome;
    };

    public void setarIdade(int idade){
        this.idadeCliente = idade;
    }

    public String retornaNome(){
        return this.nomeCliente;
    }

    public int retornaIdade(){
        return this.idadeCliente;
    }





}
