package Entites;

public class Account {
	
	private int numberAccount;//numero da conta
	private String nameAccount; // nome
	private double balanceAccount; //saldo da conta
	
	
	public Account(int numberAccount, String nameAccount, double depositAccount) {
		super();
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		deposit(depositAccount); // Já que o depósito inicial é um depósito, insero logo no método
	}


	public Account(int numberAccount, String nameAccount) {
		super();
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
	}


	public int getNumberAccount() {
		return numberAccount;
	}

	public String getNameAccount() {
		return nameAccount;
	}


	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}


	public double getBalanceAccount() {
		return balanceAccount;
	}
	
	public double deposit(double deposit) {
		
		return this.balanceAccount += deposit;
		
	}
	
	public double remove(double remove) {
		
		return this.balanceAccount -= remove + 5;
	}
	
	public String toString() {
		
		return ">>> Número da conta:"+ getNumberAccount() + ">>>Titular da conta: "+ getNameAccount() + 
				" >>> Saldo da Conta: "+ getBalanceAccount();
	}

	

}
