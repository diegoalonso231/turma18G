package CLASSES;

public class ContaEstudantil extends Conta {
	private double limiteEstudantil= 5000.00;
	
	public ContaEstudantil ( int numero, String cpf,double limiteEstudantil) {
		super(numero,cpf);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	public void  usarEstudantil (double Saldo) {
		double valor = 0.00;
		super.getSaldo();
		if(Saldo != Saldo) {
			for(int i = 0;i<10;i++)
			{
				valor = super.getSaldo()+limiteEstudantil;
				super.credito(valor);
			}
		
		
		}
	}	
}