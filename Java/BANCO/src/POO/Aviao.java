/*
Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
*/
package POO;
import java.util.Scanner;


public class Aviao {
	Scanner leia = new Scanner(System.in);

	String companhia;
	int bancos;
	int porta;
	
	public boolean aviaoligado() {
		int pergunta=0;
		System.out.println("avi�o esta ligado ? 1 para Sim, 2 para N�o");
		pergunta= leia.nextInt();
		boolean ligado;
		
		if(pergunta==1) {
			ligado = true;
		}else 
		{ligado = false;
		}
		return ligado(ligado);
	}
	
	    public boolean colocarvoo() {
			int pergunta2=0;
			boolean voo;

	    	System.out.println("Deseja colocar o avi�o em voo? 1 para Sim, 2 para N�o");
			pergunta2= leia.nextInt();
			if(pergunta2==1) {
				voo = true;
			}else{
				voo = false;
			}
	    	
			return emVoo(voo);

	    }
	
	    
	    
	    
	    
	    
	    
	public boolean ligado(boolean estado) {
		if (estado == true) {
		System.out.println("O avi�o esta ligado !");
		estado = true;
		}else {
			System.out.println("O avi�o esta desligado !");
			estado = false;

		}
		return estado;
	}
	
	public boolean emVoo(boolean estado) {
		if (estado == true) {
			System.out.println("O avi�o esta em voo !");
			estado = true;
			}else {
				System.out.println("O avi�o n�o esta em voo !");
				estado = false;
			}
		return estado;
	}
}