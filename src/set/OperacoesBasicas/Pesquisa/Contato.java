package set.OperacoesBasicas.Pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;

    private int numero;

    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int setNumero(){return numero;}

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "{" + nome + "," + numero + "}";
    }
}
