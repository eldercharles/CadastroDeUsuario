
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


public class UsuarioDAO {
    
    Connection con;
    
    public UsuarioDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    
    public void create(ClassUsuario user) {
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO usuario (nome,sobrenome) VALUES(?,?)");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getSobreNome());
            
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
        public List<ClassUsuario>read() {
            
            
        
        PreparedStatement stmt = null;
        ResultSet Result = null;   
        
        List<ClassUsuario> usuarios = new ArrayList<>();
       
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            Result = stmt.executeQuery();
            
            while (Result.next()) {
                
            
                ClassUsuario usuario = new ClassUsuario();
                
                usuario.setId(Result.getInt("id_usuario"));
                usuario.setNome(Result.getString("nome"));
                usuario.setSobreNome(Result.getString("sobrenome"));
                usuarios.add(usuario);
                
      
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ConnectionFactory.closeConnection(con,stmt, Result);
        
        return usuarios;
    }
        }
      public List<ClassUsuario> readDescre(String descre) {

        PreparedStatement stmt = null;
        ResultSet Result = null;

        List<ClassUsuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome LIKE ?");
            stmt.setString(1, "%"+descre+"%");
            
            Result = stmt.executeQuery();

            while (Result.next()) {

                ClassUsuario usuario = new ClassUsuario();

                usuario.setId(Result.getInt("id_usuario"));
                usuario.setNome(Result.getString("nome"));
                usuario.setSobreNome(Result.getString("sobrenome"));
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, Result);
        }

        return usuarios;

    }
        
         public void update(ClassUsuario user) {
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE usuario SET nome = ?, sobrenome = ? WHERE id_usuario = ?");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getSobreNome());
            stmt.setInt(3, user.getId());
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
         public void delete(ClassUsuario user) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE id_usuario = ?");
            stmt.setInt(1, user.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
        
}
