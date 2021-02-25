import java.util.Scanner;
public class OiMundo {

		public static void main(String[] args) {
			System.out.println("Ola Mundo");
			
	//PRIMEIRO PROGRAMA EM JAVA NEXTGENERATION!! BORA TIME
			Scanner userEscreva = new Scanner(System.in); 
			String nomePai;
			String nomeMae;
			System.out.println("Meu pai chama: ");
			nomePai = userEscreva.nextLine();
			System.out.println("Minha mãe chama: ");
			nomeMae= userEscreva.nextLine();
			System.out.println("Meu pai chama: "+nomePai);
			System.out.println("Minha mãe chama: "+nomeMae);
			
		}
}
