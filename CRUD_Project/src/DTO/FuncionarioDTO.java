
package DTO;


public class FuncionarioDTO {
    
    private int Id;
    private String Nome;
    private String Setor;
    private String Cargo;
    private String DataAdmissao;
    
    
    public int getId(){
        return Id;
    }
    
    public void setId(int Id){
        this.Id = Id;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public String getSetor(){
        return Setor;
    }
    
    public void setSetor(String Setor){
        this.Setor = Setor;
    }
    
    public String getCargo(){
        return Cargo;
    }
    
    public void setCargo(String Cargo){
        this.Cargo = Cargo;
    }
    
        public String getDataAdmissao(){
        return DataAdmissao;
    }
    
    public void setDataAdmissao(String DataAdmissao){
        this.DataAdmissao = DataAdmissao;
    }
}
