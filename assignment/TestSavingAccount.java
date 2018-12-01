package com.chaitali.assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestSavingAccount {
	public static void main(String[] args) {
		SavingAccount savingAccount1=new SavingAccount(30000, 134, "Chaitali", true);
		SavingAccount savingAccount2=new SavingAccount(50000,154,"swati", true);	
		SavingAccount savingAccount3=new SavingAccount(60000,124,"priti", false);
		SavingAccount savingAccount4=new SavingAccount(60000,124,"poojitha", false);
		TreeSet<SavingAccount> treeSet= new TreeSet<>();
		treeSet.add(savingAccount1);
		treeSet.add(savingAccount2);
		treeSet.add(savingAccount3);
		treeSet.add(savingAccount4);
		
		/*HashSet<SavingAccount> hashset= new HashSet<>();
		hashset.add(savingAccount1);
		hashset.add(savingAccount2);
		hashset.add(savingAccount3);*/
		
		//System.out.println(hashset);


		/*for(SavingAccount s1:hashset){  
			System.out.println(s1);*/
		
		Iterator<SavingAccount> iterator= treeSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}

