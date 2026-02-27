package exerciciosmetodos;

public class Funcionario {
    
    String nome;
    double salario;
    
    // -------------  Metodos de Salario
    
    void setSalario(double salario){
        this.salario += salario;
    }
   
    void getSalario(){
        System.out.println("Consulta Salario do Funcionario:" + this.salario);
    }
    
    // ------------- Metodos de Nome
    
    void getFuncionario(){
        System.out.println("Chamando Funcionario: " + this.nome);
    }
    
}
