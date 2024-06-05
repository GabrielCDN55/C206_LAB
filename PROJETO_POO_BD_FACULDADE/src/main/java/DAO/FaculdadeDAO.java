package DAO;

import org.example.Curso;
import org.example.Faculdade;
import org.example.Professor;

import java.sql.SQLException;
import java.util.ArrayList;

public class FaculdadeDAO extends ConnectionDAO {
    public boolean sucesso = false;

    //INSERT
    public boolean insertFaculdade(Faculdade faculdade) {
        connectToDB();
        String sql = "INSERT INTO Faculdade (nome) values(?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, faculdade.getNome());
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
    public boolean updateFaculdade(int id, Faculdade faculdade) {
        connectToDB();
        String sql = "UPDATE Faculdade SET nome=? where id=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, faculdade.getNome());
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
    public boolean deleteFaculdade(int id) {
        connectToDB();
        String sql = "DELETE FROM Faculdade where id =?";
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
    public ArrayList<Faculdade> selectFaculdade(){
        ArrayList<Faculdade> faculdades  = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Faculdade";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("Lista de Faculdades: ");

            while (rs.next()) {
                Faculdade faculdadeAux = new Faculdade(rs.getString("nome"));
                System.out.println("Nome = " + faculdadeAux.getNome());
                System.out.println("--------------------------------");

                faculdades.add(faculdadeAux);
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
        return faculdades;
    }
}
