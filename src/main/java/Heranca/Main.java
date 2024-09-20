package Heranca;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        carro.acelerar();
        carro.exibirInformacao();
        carro.abrirPortaMalas();
        
        System.out.println();

        Moto moto = new Moto("Honda", "CB500", 2019, true);
        moto.acelerar();
        moto.exibirInformacao();
        moto.empinar();
        
        System.out.println();

        Pessoa pessoa = new Pessoa("Joao", 30, "123.456.789-00");
        pessoa.exibirInformacao();
        
        System.out.println();

        Funcionario funcionario = new Funcionario("Maria", 25, "987.654.321-00", "Desenvolvedora", 5000.0);
        funcionario.exibirDetalhesFuncionario();
    }
}