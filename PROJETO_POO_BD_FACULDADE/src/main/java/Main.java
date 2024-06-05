import DAO.AlunoDAO;
import DAO.CursoDAO;
import DAO.FaculdadeDAO;
import DAO.ProfessorDAO;
import org.example.Aluno;
import org.example.Curso;
import org.example.Faculdade;
import org.example.Professor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FaculdadeDAO faculdadeDAO = new FaculdadeDAO();
        CursoDAO cursoDAO = new CursoDAO();
        ProfessorDAO professorDAO = new ProfessorDAO();
        AlunoDAO alunoDAO = new AlunoDAO();
        Scanner entrada = new Scanner(System.in);
        int auxEntrada = 1;
        while(auxEntrada == 1)
        {
            System.out.println("Caso deseje adicionar nova faculdade, digite 1: ");
            System.out.println("Caso deseje adicionar novo curso, digite 2: ");
            System.out.println("Caso deseje adicionar novo professor, digite 3: ");
            System.out.println("Caso deseje adicionar novo aluno, digite 4: ");
            System.out.println("Caso deseja pausar a entrada de dados, digite 0: ");
            int aux_dados = entrada.nextInt();

            switch (aux_dados)
            {
                case 0:
                    auxEntrada = 0;
                    break;
                case 1:
                    System.out.println("Indique o nome da faculdade: ");
                    Faculdade faculdade1 = new Faculdade(entrada.next());
                    faculdadeDAO.insertFaculdade(faculdade1);
                    break;
                case 2:
                    System.out.println("Indique o nome do curso: ");
                    Curso curso1 = new Curso(entrada.next());
                    cursoDAO.insertCurso(curso1);
                    break;
                case 3:
                    System.out.println("Indique o nome, idade, registro academico e a disciplina ministrada do professor: ");
                    Professor professor1 = new Professor(entrada.next(), entrada.nextInt(), entrada.nextInt(), entrada.next());
                    professorDAO.insertProfessor(professor1);
                    break;
                case 4:
                    System.out.println("Indique o nome, idade, período, matricula e curso do aluno: ");
                    Aluno aluno1 = new Aluno(entrada.next(), entrada.nextInt(), entrada.nextInt(), entrada.nextInt(), entrada.next());
                    alunoDAO.insertAluno(aluno1);
                    break;
            }
        }
        auxEntrada = 1;
        while (auxEntrada == 1)
        {
            System.out.println("O que você deseja?");
            System.out.println("Deletar membros das tabelas - Digite 1");
            System.out.println("Atualizar as tabelas - Digite 2");
            System.out.println("Mostrar os dados - Digite 3");
            System.out.println("Finalizar as operações - Digite 0");

            switch (entrada.nextInt())
            {
                case 0:
                    auxEntrada = 0;
                    break;
                case 1: //DELETE
                    System.out.println("Deseja deletar membros de qual tabela?");
                    System.out.println("Digite: 1(faculdade), 2(curso), 3(professor) ou 4(aluno)");
                    switch (entrada.nextInt())
                    {
                        case 1:
                            System.out.println("Indique o id da faculdade que irá deletar:");
                            faculdadeDAO.deleteFaculdade(entrada.nextInt());
                            break;
                        case 2:
                            System.out.println("Indique o id do curso que irá deletar:");
                            cursoDAO.deleteCurso(entrada.nextInt());
                            break;
                        case 3:
                            System.out.println("Indique o registro academico do professor que irá deletar:");
                            professorDAO.deleteProfessor(entrada.nextInt());
                            break;
                        case 4:
                            System.out.println("Indique a matricula do aluno que irá deletar:");
                            alunoDAO.deleteAluno(entrada.nextInt());
                            break;
                    }
                    break;
                case 2: //UPDATE
                    System.out.println("Deseja atualizar membros de qual tabela?");
                    System.out.println("Digite: 1(faculdade), 2(curso), 3(professor) ou 4(aluno)");
                    switch (entrada.nextInt())
                    {
                        case 1:
                            System.out.println("Indique o nome da faculdade nova que irá para a tabela:");
                            Faculdade faculdade2 = new Faculdade(entrada.next());
                            System.out.println("Indique o id da faculdade queserá atualizada: ");
                            faculdadeDAO.updateFaculdade(entrada.nextInt(), faculdade2);
                            break;
                        case 2:
                            System.out.println("Indique o nome do curso novo que irá para a tabela:");
                            Curso curso2 = new Curso(entrada.next());
                            System.out.println("Indique o id do curso que será atualizado: ");
                            cursoDAO.updateCurso(entrada.nextInt(), curso2);
                            break;
                        case 3:
                            System.out.println("Indique os dados do novo professor que irá para a tabela: nome, idade, registro academico e disciplina ministrada");
                            Professor professor2 = new Professor(entrada.next(), entrada.nextInt(), entrada.nextInt(), entrada.next());
                            System.out.println("Indique o registro academico do professor que será atualizado: ");
                            professorDAO.updateProfessor(entrada.nextInt(), professor2);
                            break;
                        case 4:
                            System.out.println("Indique os dados do novo aluno que irá para a tabela: nome, idade, periodo, matricula, curso");
                            Aluno aluno2 = new Aluno(entrada.next(), entrada.nextInt(), entrada.nextInt(), entrada.nextInt(), entrada.next());
                            System.out.println("Indique a matricula do aluno que será atualizado");
                            alunoDAO.updateAluno(entrada.nextInt(), aluno2);
                            break;
                    }
                    break;
                case 3: //SELECT
                    System.out.println("Deseja mostrar os membros de qual tabela?");
                    System.out.println("Digite: 1(faculdade), 2(curso), 3(professor) ou 4(aluno)");
                    switch (entrada.nextInt())
                    {
                        case 1:
                            faculdadeDAO.selectFaculdade();
                            break;
                        case 2:
                            cursoDAO.selectCurso();
                            break;
                        case 3:
                            professorDAO.selectProfessor();
                            break;
                        case 4:
                            alunoDAO.selectAluno();
                            break;
                    }
                    break;
            }
        }
        System.out.println("Encerrando operações no banco de dados");
    }
}