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


public class EnderecoDAO {
    
    Connection con;
    
public EnderecoDAO() {
    con = ConnectionFactory.getConnection();
}
    public void create(ClassEndereco ender) {
        
        
        PreparedStatement stmt = null;
        
        try {
stmt = con.prepareStatement("INSERT INTO endereco (logradouro,complemento,bairro,numero,cep) VALUES(?,?,?,?,?)");
            stmt.setString(1,ender.getLogradouro());
            stmt.setString(2,ender.getComplemento());
            stmt.setString(3,ender.getBairro());
            stmt.setString(4,ender.getNumero());
            stmt.setString(5,ender.getCEP());
            
              
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            } finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
    public List<ClassEndereco> read() {
        
        
        PreparedStatement stmt = null;
        ResultSet Result = null;
        
        
        List<ClassEndereco> enderecos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM endereco");
            Result = stmt.executeQuery();
            
            while (Result.next()) {
                
                ClassEndereco endereco = new ClassEndereco();
                
                endereco.setId_endereco(Result.getInt("id_endereco"));
                endereco.setLogradouro(Result.getString("logradouro"));
                endereco.setComplemento(Result.getString("complemento"));
                endereco.setBairro(Result.getString("bairro"));
                endereco.setNumero(Result.getString("numero"));
                endereco.setCEP(Result.getString("cep"));
                enderecos.add(endereco);
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        ConnectionFactory.closeConnection(con, stmt, Result);
    }
        
            return enderecos;
    }
    
    
    
      public List<ClassEndereco> readDescre(String descre) {

        PreparedStatement stmt = null;
        ResultSet Result = null;

        List<ClassEndereco> enderecos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM endereco WHERE logradouro LIKE ?");
            stmt.setString(1, "%"+descre+"%");
            
            Result = stmt.executeQuery();

            while (Result.next()) {

                ClassEndereco endereco = new ClassEndereco();

                endereco.setId_endereco(Result.getInt("id_endereco"));
                endereco.setLogradouro(Result.getString("logradouro"));
                endereco.setComplemento(Result.getString("complemento"));
                endereco.setBairro(Result.getString("bairro"));
                endereco.setNumero(Result.getString("numero"));
                endereco.setCEP(Result.getString("cep"));
                
                enderecos.add(endereco);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, Result);
        }

        return enderecos;

    }

    
         public void update(ClassEndereco ender) {
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE endereco SET logradouro = ?, complemento = ?, bairro = ?, numero = ?, cep = ? WHERE id_endereco = ?");
            stmt.setString(1, ender.getLogradouro());
            stmt.setString(2, ender.getComplemento());
            stmt.setString(3, ender.getBairro());
            stmt.setString(4, ender.getNumero());
            stmt.setString(5, ender.getCEP());
            stmt.setInt(6, ender.getId_endereco());
           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
         public void delete(ClassEndereco ender) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM endereco WHERE id_endereco= ?");
            stmt.setInt(1, ender.getId_endereco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
        
}



