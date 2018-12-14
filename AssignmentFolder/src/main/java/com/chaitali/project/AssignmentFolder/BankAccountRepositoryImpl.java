package com.chaitali.project.AssignmentFolder;

import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	List<BankAccount> bankAccount=null;

	BankAccount account1;
	BankAccount acount2;

	public BankAccountRepositoryImpl(){

	}

	public BankAccountRepositoryImpl(List<BankAccount> bankAccount,
			BankAccount account1, BankAccount acount2) {
		super();
		this.bankAccount = bankAccount;
		this.account1 = account1;
		this.acount2 = acount2;
	}

	
	public List<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(List<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}

	public BankAccount getAccount1() {
		return account1;
	}

	public void setAccount1(BankAccount account1) {
		this.account1 = account1;
	}

	public BankAccount getAcount2() {
		return acount2;
	}

	public void setAcount2(BankAccount acount2) {
		this.acount2 = acount2;
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub

		BankAccount account=getNewAccountId(accountId);
		if(account!=null){
			return account.getAccountBalance();
		}


		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub


		BankAccount account=getNewAccountId(accountId);
		if(account!=null){
			if(account.getAccountBalance()==accountId){
				return account.getAccountBalance()+  newBalance;
			}
		}
		return 0;
	}



	public BankAccount getNewAccountId(long accountId){
		if(bankAccount != null){
			for(BankAccount account: bankAccount)
			{		
				if(account.getAccountId()==accountId)
					return account;}
		}

		return null;
	}

	@Override
	public String toString() {
		return "BankAccountRepositoryImpl [bankAccount=" + bankAccount
				+ ", account1=" + account1 + ", acount2=" + acount2 + "]";
	}

}
