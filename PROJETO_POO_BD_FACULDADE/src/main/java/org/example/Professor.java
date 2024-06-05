package org.example;
public class Professor extends Pessoa{
    private int registroAcademico;
    private String disciplinaMinistrada;
    private int id;

    public Professor(String nome, int idade, int registroAcademico, String disciplinaMinistrada) {
        super(nome, idade);
        this.registroAcademico = registroAcademico;
        this.disciplinaMinistrada = disciplinaMinistrada;
    }
    public int getRegistroAcademico() {
        return registroAcademico;
    }
    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }
    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public void mostraInfo()
    {
        super.mostraInfo();
        System.out.println("Registro academico: " + registroAcademico);
        System.out.println("Segue as disciplina ministrada pelo professor: " + disciplinaMinistrada);
    }
}

