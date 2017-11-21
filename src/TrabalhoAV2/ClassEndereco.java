
package TrabalhoAV2;


public class ClassEndereco {

    private int id_endereco;
    private String Logradouro;
    private String Complemento;
    private String Bairro;
    private String Numero;
    private String CEP;

    public ClassEndereco() {
    }
    
    

    public ClassEndereco(String Logradouro, String Complemento, String Bairro, String Numero, String CEP) {
        this.id_endereco = id_endereco;
        this.Logradouro = Logradouro;
        this.Complemento = Complemento;
        this.Bairro = Bairro;
        this.Numero = Numero;
        this.CEP = CEP;
    }
    
    
      public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }
    
    
    public String getLogradouro() {
        return Logradouro;
    }

    
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    
    public String getComplemento() {
        return Complemento;
    }

    
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    
    public String getBairro() {
        return Bairro;
    }

    
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    
    public String getNumero() {
        return Numero;
    }

    
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    
    public String getCEP() {
        return CEP;
    }

    
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    
    
}
