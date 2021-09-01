package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato ();
        System.out.println(gato);


        Livro livro1= new Livro(  "O problemas dos 3 corpos", npage:300);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Olá Mundo " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private String npage;

    public Livro() {}

    public Livro(String nome, String npage) {
        this.nome = nome;
        this.npage = npage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNpage() {
        return npage;
    }

    public void setNpage(String npage) {
        this.npage = npage;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npage='" + npage + '\'' +
                '}';
    }
}