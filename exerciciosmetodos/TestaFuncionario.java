package exerciciosmetodos;

public class TestaFuncionario {

    public static void main(String[] args){
   
    Funcionario func1 = new Funcionario();
    Funcionario func2 = new Funcionario();
    
    func1.nome = "Lucas Gonçalves";
    func2.nome = "Marcos Costa";
    
    func1.salario = 100.10;
    func2.salario = 8000.20;
    
        System.out.println("Nome dos Funcionarios");
    System.out.println("Nome do Funcionario 1: "+ func1.nome);
    System.out.println("Nome do Funcionario 2: "+ func2.nome + "\n");
    
    
        System.out.println("Salario dos Funcionarios");
    System.out.println("Salario do Funcionario 1: " + func1.salario);
    System.out.println("Salario do Funcionario 2: " + func2.salario + "\n");
    
    // ---
    
    func1.getFuncionario();
    func1.getSalario();
    func1.setSalario(1500.50);
    func1.getSalario();
    
    // --
        System.out.println("\n");
    func2.getFuncionario();
    func2.getSalario();
    func2.setSalario(7800.30);
    func2.getSalario();
    
        
    }
      
}
