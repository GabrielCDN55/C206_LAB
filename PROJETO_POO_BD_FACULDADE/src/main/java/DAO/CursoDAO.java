package DAO;

import org.example.Curso;
import org.example.Professor;

import java.sql.SQLException;
import java.util.ArrayList;

public class CursoDAO extends ConnectionDAO{
    public boolean sucesso = false;

    //INSERT
    public boolean insertCurso(Curso curso) {
        connectToDB();
        String sql = "INSERT INTO Curso (nome) values(?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, curso.getNome());
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
    public boolean updateCurso(int id, Curso curso) {
        connectToDB();
        String sql = "UPDATE Curso SET nome=? where id=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, curso.getNome());
            pst.setInt(2,id);
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
    public boolean deleteCurso(int id) {
        connectToDB();
        String sql = "DELETE FROM Curso where id =?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
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
    public ArrayList<Curso> selectCurso(){
        ArrayList<Curso> cursos  = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Curso";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("Lista de Cursos: ");

            while (rs.next()) {
                Curso cursoAux = new Curso(rs.getString("nome"));

                System.out.println("Nome = " + cursoAux.getNome());
                System.out.println("--------------------------------");

                cursos.add(cursoAux);
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
        return cursos;
    }
}
