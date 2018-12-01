package com.chaitali.assignment;

public class SavingAccount implements Comparable<SavingAccount> {
	double acc_balance;
	int acc_Id;
	String acc_HolderName;
	boolean isSalaryAccount;
	public SavingAccount(double acc_balance, int acc_Id, String acc_HolderName, boolean isSalaryAccount) {
		this.acc_balance=acc_balance;
		this.acc_HolderName=acc_HolderName;
		this.acc_Id=acc_Id;
		this.isSalaryAccount=isSalaryAccount;
	}
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_Id="
				+ acc_Id + ", acc_HolderName=" + acc_HolderName
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_Id() {
		return acc_Id;
	}
	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}
	public String getAcc_HolderName() {
		return acc_HolderName;
	}
	public void setAcc_HolderName(String acc_HolderName) {
		this.acc_HolderName = acc_HolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	@Override
	public int compareTo(SavingAccount abc) {
		if(acc_Id>abc.acc_Id)
		{return 1;}
		else if(acc_Id<abc.acc_Id)
		{return -1;}
		else return 0;
	}

}
