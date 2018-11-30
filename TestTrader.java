package StreamAssignment;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestTrader {
	private static Function getName;

	public static void main(String[] args) {

		Trader trader=new Trader("nikhil", "pune");
		Trader trader2=new Trader("ajinkya", "mumbai");
		Trader trader3=new Trader("amey", "pune");
		Trader trader4=new Trader("sahil", "delhi");
		Trader trader5=new Trader("kajal", "delhi");

		Transaction transaction1=new Transaction(trader, 1996, 2000);
		Transaction transaction2=new Transaction(trader2, 2011, 23000);
		Transaction transaction3=new Transaction(trader3, 2011, 4000);
		Transaction transaction4=new Transaction(trader4, 2000, 4563);
		Transaction transaction5=new Transaction(trader5, 2011,  500);

		List<Transaction> list=new ArrayList<Transaction>();
		list.add(transaction1);
		list.add(transaction2);
		list.add(transaction3);
		list.add(transaction4);
		list.add(transaction5);
		System.out.println("********Original data***********");
		for(Transaction t:list){
			System.out.println(t);
		}

		System.out.println("*******after sorting*********");
		list.stream().filter(n->n.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

		System.out.println("*******after sorting*********");
		
		list.stream().map(i->i).filter(n->n.trader.getCity()=="pune").sorted();
		System.out.println("*******after sorting*********");
		list.stream().map(n->n.trader.getCity()=="Indore").forEach(System.out::println);

		System.out.println("*******after sorting*********");

		list.stream().filter(n->n.trader.getCity()=="delhi").sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

		System.out.println("************************");


		//	list.stream()

	}
}
