public class Funcionario{
    private String primeiro_nome;
    private String segundo_nome;
    private double salario;
    
    public Funcionario(String primeiro_nome, String segundo_nome, double salario){
    this.primeiro_nome = primeiro_nome;
    this.segundo_nome = segundo_nome;
    this.salario = salario;
    }
    public String getPrimeiro_nome(){
    return this.primeiro_nome;
    }
    public void setPrimeiro_nome(String primeiro_nome){
    this.primeiro_nome = primeiro_nome;
    }
    public String getSegundo_nome(){
    return this.segundo_nome;
    }
    public void setSegundo_nome(String segundo_nome){
    this.segundo_nome = segundo_nome;
    }
    public double getSalario(){
    return this.salario;
    }
    public void setSalario(double salario){
    this.salario = salario;
    }
}