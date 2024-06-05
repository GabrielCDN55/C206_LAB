package org.example;
public class Pessoa {
    private String nome;
    private int idade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void mostraInfo()
    {
        System.out.println("Seguem os dados:");
        System.out.println("Nome: " + nome + " Idade: " + idade);
    }
}
