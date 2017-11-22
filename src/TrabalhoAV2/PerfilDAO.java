package TrabalhoAV2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PerfilDAO {
    
    Connection con;
    
    public PerfilDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    
    public void create(ClassPerfil perf) {
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO perfil (nomeperfil,descricao) VALUES(?,?)");
            stmt.setString(1, perf.getNomePerfil());
            stmt.setString(2, perf.getDescricao());
            
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
    public List<ClassPerfil>read() {
            
            
        
        PreparedStatement stmt = null;
        ResultSet Result = null;   
        
        List<ClassPerfil> perfill = new ArrayList<>();
       
        try {
            stmt = con.prepareStatement("SELECT * FROM perfil");
            Result = stmt.executeQuery();
            
            while (Result.next()) {
                
            
                ClassPerfil perfil = new ClassPerfil();
                
                perfil.setId_perfil(Result.getInt("id_perfil"));
                perfil.setNomePerfil(Result.getString("nomeperfil"));
                perfil.setDescricao(Result.getString("descricao"));
                perfill.add(perfil);
                
      
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con,stmt, Result);
        
        return perfill;
    }
}
    
    
    
      public List<ClassPerfil> readDescre(String descre) {

        PreparedStatement stmt = null;
        ResultSet Result = null;

        List<ClassPerfil> perfill = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM perfil WHERE nomeperfil LIKE ?");
            stmt.setString(1, "%"+descre+"%");
            
            Result = stmt.executeQuery();

            while (Result.next()) {

                ClassPerfil perfil = new ClassPerfil();

                perfil.setId_perfil(Result.getInt("id_perfil"));
                perfil.setNomePerfil(Result.getString("nomeperfil"));
                perfil.setDescricao(Result.getString("descricao"));
                
                
                perfill.add(perfil);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, Result);
        }

        return perfill;

    }

    
    
    public void update(ClassPerfil perf) {
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE perfil SET nomeperfil = ?, descricao = ? WHERE id_perfil= ?");
            stmt.setString(1, perf.getNomePerfil());
            stmt.setString(2, perf.getDescricao());
            stmt.setInt(3, perf.getId_perfil());
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
         public void delete(ClassPerfil perf) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM perfil WHERE id_perfil= ?");
            stmt.setInt(1, perf.getId_perfil());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}