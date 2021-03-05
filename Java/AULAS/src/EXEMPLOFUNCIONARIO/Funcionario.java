package EXEMPLOFUNCIONARIO;

public class Funcionario 
{

    //atributos - � / tem / estar
    private String nome;
    private int matricula;
    protected int horasTrabalhadas;
    protected double valorPorHora;


    //construtor - como eu fa�o o objeto do tipo Funcionario no programa principal
    public Funcionario(String nome, int matricula, int horasTrabalhadas, double valorPorHora) 
    {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;

    }

    //encapsulamento - getters and setters - seguran�a - como eu mexo nas coisas se t� tudo travado
    public String getNome() 
    {
        return nome;
    }


    public void setNome(String nome) 
    {
        this.nome = nome;
    }


    public int getMatricula() 
    {
        return matricula;
    }


    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }


    public int getHorasTrabalhadas() 
    {
        return horasTrabalhadas;
    }


    public void setHorasTrabalhadas(int horasTrabalhadas) 
    {
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public double getValorPorHora() 
    {
        return valorPorHora;
    }


    public void setValorPorHora(double valorPorHora) 
    {
        this.valorPorHora = valorPorHora;
    }


    //metodos - tudo que classe faz 
    public double salario() {

        return (horasTrabalhadas * valorPorHora);
    }
    //sobrecarga do metodo salario
    public double salario(double imposto) {

        return (horasTrabalhadas * valorPorHora)-((horasTrabalhadas * valorPorHora)*imposto);
    }




} //aqui � o fim