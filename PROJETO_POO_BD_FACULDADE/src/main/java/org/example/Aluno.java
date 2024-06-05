package org.example;
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private int periodo;
    public Aluno(String nome, int idade, int periodo, int matricula, String curso) {
        super(nome, idade);
        this.periodo = periodo;
        this.matricula = matricula;
        this.curso = curso;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public void mostraInfo()
    {
        super.mostraInfo();
        System.out.println("Periodo: " + periodo);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}

