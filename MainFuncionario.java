import java.util.ArrayList;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args){

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<FuncionarioComissionado> funcionariosC = new ArrayList<FuncionarioComissionado>();

        funcionarios.add(new Funcionario("Joao", "Paulo", 1200.25));
        funcionarios.add(new Funcionario("Maria", "Paula", 1500.5));
        funcionarios.add(new Funcionario("Sergio", "Carlos", 2000));
        funcionarios.add(new Funcionario("Antonio", "Henrique", 2500));
        funcionariosC.add(new FuncionarioComissionado("Paulo", "Coelho", 3000,5));
        funcionariosC.add(new FuncionarioComissionado("Gerson", "Reboucas", 1200, 7));
        funcionariosC.add(new FuncionarioComissionado("Mario", "Henrique", 3500,8));
        funcionariosC.add(new FuncionarioComissionado("Mateus", "Fernandes", 2100.75, 5));

        Scanner in = new Scanner(System.in);
        System.out.println("digite 1 para pesquisar um funcionario\n"+
        "digite 0 para sair\n");

        int input = in.nextInt();
        while(input != 0){
            switch(input){
                case 1:
                    String aux = in.next();
                    for(int i=0; i < 4; i++){

                    if(funcionarios.get(i).getPrimeiro_nome().equalsIgnoreCase(aux)){

                        System.out.printf("Funcionario Econtrado.\nNome: %s %s\n", funcionarios.get(i).getPrimeiro_nome(),

                        funcionarios.get(i).getSegundo_nome());
                        System.out.printf("Salario a ser pago: R$ %.2f\n\n",

                        funcionarios.get(i).getSalario());
                        break;
                    }
                    if(funcionariosC.get(i).getPrimeiro_nome().equalsIgnoreCase(aux)){

                        System.out.printf("Funcionario Econtrado.\nNome: %s %s\n", funcionariosC.get(i).getPrimeiro_nome(),
                        
                        funcionariosC.get(i).getSegundo_nome());
                        System.out.printf("Salario a ser pago + comissao: R$ %.2f\n\n", funcionariosC.get(i).getSalario(50.0));
                        
                    break;
                    }
                }
            break;
            }
        input = in.nextInt();
        }
    }
}