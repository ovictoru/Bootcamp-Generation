import java.util.Scanner;

public class Soma_Simples {

	public static void main(String[] args) {

		Scanner Leia = new Scanner (System.in);
		
		int n1, n2;
	
		System.out.println("Leia dois valores inteiros, no caso para variáveis A e B. \nA seguir, calcule a soma entre elas e atribua à variável SOMA. \nA seguir escrever o valor desta variável.\n");
		System.out.println("Resolução: \n");
		
		System.out.println("Digite o primeiro número: ");
		n1 = Leia.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = Leia.nextInt();
		
		System.out.println("\nSoma = " + (n1 + n2 ));
		
		
		
		
		
		
		
		
		
		
		
		Leia.close();
		
	}

}
