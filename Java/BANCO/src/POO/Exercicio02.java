/*
Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
package POO;


public class Exercicio02 {
	public static void main(String[] args) {
		
		
		Aviao aviaozinho = new Aviao();
		aviaozinho.companhia ="Latam";
		aviaozinho.bancos =200;
		aviaozinho.porta =2;
		
		System.out.printf("\nA empresa de avia��o %s\nCom a quantidade de bancos %d\ne com a quantidade de portas %d\n",aviaozinho.companhia,aviaozinho.bancos,aviaozinho.porta);
		
		
		aviaozinho.aviaoligado();
		aviaozinho.colocarvoo();
		
		
		
	}
}