package DAO;
import org.example.Aluno;

import java.sql.*;
import java.util.ArrayList;

public class AlunoDAO extends ConnectionDAO {
    public boolean sucesso = false;

    //INSERT
    public boolean insertAluno(Aluno aluno) {
        connectToDB();
        String sql = "INSERT INTO Aluno (nome, idade, matricula, curso, periodo) values(?,?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, aluno.getNome());
            pst.setInt(2, aluno.getIdade());
            pst.setInt(3, aluno.getMatricula());
            pst.setString(4, aluno.getCurso());
            pst.setInt(5, aluno.getPeriodo());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //UPDATE
    public boolean updateAluno(int matricula, Aluno aluno) {
        connectToDB();
        String sql = "UPDATE Aluno SET nome=?, idade = ?, matricula=?, curso=?, periodo=? where matricula=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, aluno.getNome());
            pst.setInt(2, aluno.getIdade());
            pst.setInt(3, aluno.getMatricula());
            pst.setString(4, aluno.getCurso());
            pst.setInt(5, aluno.getPeriodo());
            pst.setInt(6,matricula);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //DELETE
    public boolean deleteAluno(int matricula) {
        connectToDB();
        String sql = "DELETE FROM Aluno where matricula =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,matricula);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    //SELECT
    public ArrayList<Aluno> selectAluno(){
        ArrayList<Aluno> alunos = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Aluno";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("Lista de Alunos: ");

            while (rs.next()) {
                Aluno alunoAux = new Aluno(rs.getString("nome"), rs.getInt("idade"), rs.getInt("periodo"),rs.getInt("matricula"), rs.getString("curso"));

                System.out.println("Nome = " + alunoAux.getNome());
                System.out.println("Idade = " + alunoAux.getIdade());
                System.out.println("Matricula = " + alunoAux.getMatricula());
                System.out.println("Curso = " + alunoAux.getCurso());
                System.out.println("Periodo = " + alunoAux.getPeriodo());
                System.out.println("--------------------------------");

                alunos.add(alunoAux);
            }
            sucesso = true;
        }
        catch (SQLException e)
        {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return alunos;
    }
}

