package DAO;
import org.example.Professor;

import java.sql.*;
import java.util.ArrayList;

public class ProfessorDAO extends ConnectionDAO {
    public boolean sucesso = false;

    //INSERT
    public boolean insertProfessor(Professor professor) {
        connectToDB();
        String sql = "INSERT INTO Professor (nome, idade, registroAcademico, disciplinaMinistrada) values(?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, professor.getNome());
            pst.setInt(2, professor.getIdade());
            pst.setInt(3, professor.getRegistroAcademico());
            pst.setString(4, professor.getDisciplinaMinistrada());
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
    public boolean updateProfessor(int registroAcademico, Professor professor) {
        connectToDB();
        String sql = "UPDATE Professor SET nome=?, idade = ?, registroAcademico=?, disciplinaMinistrada=? where registroAcademico=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, professor.getNome());
            pst.setInt(2, professor.getIdade());
            pst.setInt(3, professor.getRegistroAcademico());
            pst.setString(4, professor.getDisciplinaMinistrada());
            pst.setInt(5,registroAcademico);
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
    public boolean deleteProfessor(int registroAcademico) {
        connectToDB();
        String sql = "DELETE FROM Professor where registroAcademico =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,registroAcademico);
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
    public ArrayList<Professor> selectProfessor(){
       ArrayList<Professor> professors = new ArrayList<>();
       connectToDB();
       String sql = "SELECT * FROM Professor";

       try {
           st = con.createStatement();
           rs = st.executeQuery(sql);

           System.out.println("Lista de Professores: ");

           while (rs.next()) {
               Professor professorAux = new Professor(rs.getString("nome"), rs.getInt("idade"), rs.getInt("registroAcademico"), rs.getString("disciplinaMinistrada"));

               System.out.println("Nome = " + professorAux.getNome());
               System.out.println("Idade = " + professorAux.getIdade());
               System.out.println("Registro Academico = " + professorAux.getRegistroAcademico());
               System.out.println("Disciplina Ministrada = " + professorAux.getDisciplinaMinistrada());
               System.out.println("--------------------------------");

               professors.add(professorAux);
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
       return professors;
    }
}
