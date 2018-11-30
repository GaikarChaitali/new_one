package StreamAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestNews {
	public static void main(String[] args) {
		News news1=new News(124, "Chaitali", "Simer", "good");
		News news2=new News(136, "Poojitha", "Priti", "nice");
		News news3=new News(174, "Abhay", "Urvi", "poor");
		News news4=new News(124, "Swati", "mallika", "good");
		
		List<News> list=new ArrayList<>();
		list.add(news1);
		list.add(news2);
		list.add(news3);
		list.add(news4);
		
		for(News n:list){
			System.out.println(n);
		}
		


		
	}
}
