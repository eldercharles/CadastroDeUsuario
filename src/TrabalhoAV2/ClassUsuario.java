
package TrabalhoAV2;


public class ClassUsuario {

       
    private int id;
    private String Nome;
    private String sobreNome;
    
    
    

    public ClassUsuario() {
    }
       
      
    public ClassUsuario(int id, String Nome, String sobreNome) {
        this.id = id;
        this.Nome = Nome;
        this.sobreNome = sobreNome;
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
    public String getNome() {
        return Nome;
    }

    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    
    public String getSobreNome() {
        return sobreNome;
    }

    
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    
    
}
