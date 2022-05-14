package entities;

public class Conta {
  private double saldo;
  private String nome;
  private int num_conta;
  
  
  
  
  
  public Conta(String nome, int num_conta, double deposito) {
	super();
	this.nome = nome;
	this.num_conta = num_conta;
	
}




public double getSaldo() {
	return saldo;
}




public void setSaldo(double saldo) {
	this.saldo = saldo;
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


 public void depositar(double valor) {
	 saldo += valor;
 }


}
