package Heranca;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cpf, String cargo, double salario) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirDetalhesFuncionario() {
        exibirInformacao();
        System.out.println("Cargo: " + cargo + ", Salario: " + salario);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}