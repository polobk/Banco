import java.util.Scanner;

public class Construtor {

	private static Scanner leitor;

	public static void main(String[] args) {
		
		Banco bank1 = new Banco();
		leitor = new Scanner(System.in);
		System.out.println("Digite Seu nome :");
		bank1.Nome = leitor.next();
		System.out.println("Digite Seu Cpf :");
		bank1.CPF =leitor.nextInt();
		System.out.println("Digite o N�mero da Agencia :");
		bank1.Agencia = leitor.nextInt();
		System.out.println("Digite o N�mero da Conta :");
		bank1.Conta = leitor.nextInt();
		
		
		
		 //M�todo
		bank1.Saldo();
		
		
		//Informa�oes
		
		System.out.println("Conta:"+ bank1.Conta);
		System.out.println("CPF:"+ bank1.CPF );
		System.out.println(bank1.Nome);
		System.out.println("Seu saldo � : " + bank1.salario);
		
		
	
		

	}

}
