
package TrabalhoAV2;


public class ClassPerfil {

    private int id_perfil;
    private String nomePerfil;
    private String Descricao;

    public ClassPerfil() {
    }
    
        

    public ClassPerfil(String nomePerfil, String Descricao) {
        this.id_perfil = id_perfil;
        this.nomePerfil = nomePerfil;
        this.Descricao = Descricao;
    }
    
    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }
    
    
    public String getNomePerfil() {
        return nomePerfil;
    }

    
    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    
    public String getDescricao() {
        return Descricao;
    }

    
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
    
}
