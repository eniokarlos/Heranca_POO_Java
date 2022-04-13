public class FuncionarioComissionado extends Funcionario{
    private int numeroVendas;
    public FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario, int numeroVendas) {
    super(primeiro_nome, segundo_nome, salario);
    this.numeroVendas = numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas){
        this.numeroVendas = numeroVendas;
    }

    public int getNumeroVendas(){
        return this.numeroVendas;
    }
    public double getSalario(double val_comissao){
        return this.numeroVendas * val_comissao + getSalario();
    }
}