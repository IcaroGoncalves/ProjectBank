package treino;
import java.util.Scanner;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaEstudantil;

public class Main {
	
	
	public static void Clear() {
	    int cont;
		for (cont = 0 ; cont < 100 ; cont++) {
			System.out.println();
		}
	}
	private static int opcao;

	public static void main(String[] args){
		 Scanner let = new Scanner(System.in);
		 
		 
		 System.out.print("Insira o numero da conta:");
		 int numero = let.nextInt();
		 System.out.print("Insira o nome do cliente:");
		 String nome = let.next();
		 System.out.println();
		 Conta corrente = new ContaCorrente(nome, numero);
		 Conta estudante = new ContaEstudantil(nome, numero);

		
	     System.out.println();
		do {
			 
			 Clear();
			 double valor;
			
			//Funcao para limpar a interface ^
			
	    System.out.println(corrente.getNome()+"               "+ corrente.getSaldo());
		System.out.println("Informe qual operação deseja realizar:");
		System.out.println("===========================================");
		System.out.println("  1 - SAQUE  ");
		System.out.println("  2 - Depósito  ");
		System.out.println("  3 - Finalizar  ");
		System.out.println("===========================================");
		int opcao = let.nextInt();
		
		
		 if (opcao == 4) {
			 System.out.println("Operação finalizada");
			 break;
		 }
		 switch(opcao){
		 case 1 :
			 System.out.print("Informe o valor de saque:");
			valor = let.nextDouble();
			corrente.sacar(valor);
			 break;
		 case 2:
			 System.out.print("Informe o valor de deposito:");
			 valor = let.nextDouble();
			 corrente.depositar(valor);
			 corrente.descontar_taxa();	
			 break;
		 
		   
		 }
		 Clear();
		 
		 }while(opcao != 4);
		 
		 
		
	}
	
	
	
}

