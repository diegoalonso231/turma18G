package CLASSES;

public class Conta {

	
	
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;
	//private double correcao;

	
	//contrutor - ze pedreiro
	
	public Conta(int numero, String cpf) 
	{
		this.numero = numero;
		this.cpf = cpf;
	}
	
	//sobrecarga

	public Conta(int numero) 
	{
		this.numero = numero;
	}

	public Conta(int numero, String cpf, boolean ativa) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	
	//metodos credito
	public void credito(double valor) 
	{
		this.saldo = this.saldo + valor;
		System.out.println("Saldo atual = "+saldo);
	}
	
	//metodo debito, assim pode ficar negativo
	public void debito(double valor)
	{
		if(this.saldo>=valor) 
		{
			this.saldo = this.saldo - valor;
		System.out.println("Saldo atual = "+saldo);
		}
		
	}
	
	
	
	
	
	}
	
	
	//Segurança total - encapsulamento - getter and setters
	//Segurança total-encapsulamento -getter and setters o saldo não pode ser alterado manualmente - não tem set.
	//tira o set do saldo
	
	
	
	//o saldo só pode ser mexido pelos metodos e as classes.
	
	
	
	//metodo
/*	saldo = saldo - valor debitado
			não pode deixar a conta negativa ou seja o valor debitado não pode ser maior que o saldo atual.
	saldo = saldo + valor creditado

	
credito
debito 

get e set quando for fazer conta no min tem que ter numero e cpf,
*
*/

}
