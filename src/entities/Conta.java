package entities;
import java.util.concurrent.TimeUnit;
public class Conta {
  
  private String nome;
  private int num_conta;
  protected double saldo = 0.0;

  
  
  
  
  
  
  public Conta(String nome, int num_conta) {
	super();
	this.nome = nome;
	this.num_conta = num_conta;
}




  public void descontar_taxa() {
	}



public double getSaldo() {
	return saldo;
}








public void setSaldo(double saldo) {
	this.saldo = saldo;
}


public void depositar(Double valor) {
	this.saldo += valor;
	 System.out.println("transação realizada con sucesso, Retornando...");
	
	try {
		TimeUnit.SECONDS.sleep(2);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
 }


public void sacar(Double valor)  {
  
   if(valor < saldo) {
	   this.saldo -= valor; 
	   System.out.println("transação realizada com sucesso, Retornando...");
	   try {
		TimeUnit.SECONDS.sleep(2);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   
   }
   
   else {
	   System.out.println("Saldo insuficiente, Retornando...");
	   try {
		TimeUnit.SECONDS.sleep(2);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   }
}
   



public String getNome() {
	return nome;
}








public void setNome(String nome) {
	this.nome = nome;
}




public int getNum_conta() {
	return num_conta;
}




public void setNum_conta(int num_conta) {
	this.num_conta = num_conta;
}






}
