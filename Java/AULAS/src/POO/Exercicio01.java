/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
package POO;

public class Exercicio01 {

	public static void main(String[] args) {
		int id=0 ,anoNascimento=1992;
		
		Cliente cliente01 = new Cliente();
		Cliente jorel = new Cliente();

		
		cliente01.nome = "Pedro ";
	
		
		System.out.println("Nome do cliente " + cliente01.nome);
		System.out.println("Idade do cliente "+cliente01.idade(anoNascimento));
		System.out.println("ID do cliente " + cliente01.id(id));

	}

}