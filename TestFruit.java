package StreamAssignment;

import java.util.*;
import java.util.stream.Collectors;

public class TestFruit {
	public static void main(String[] args) {
		/*Fruit fruit1=new Fruit("Apple", 56,150, "Red");
		Fruit fruit2=new Fruit("Banana", 111, 60, "Yellow");
		Fruit fruit3=new Fruit("Grapes", 104,80, "Purple");
		Fruit fruit4=new Fruit("Kiwi", 12, 150, "Green");
		Fruit fruit5=new Fruit("cherry", 90, 50, "Red");*/

		List<Fruit> fruits=new ArrayList<Fruit>();
		fruits.add(new Fruit("Apple", 56,150, "Red"));
		fruits.add(new Fruit("Banana", 111, 60, "Yellow"));
		fruits.add(new Fruit("Grapes", 104,80, "Purple"));
		fruits.add(new Fruit("Kiwi", 12, 150, "Green"));
		fruits.add(new Fruit("cherry", 90, 50, "Red"));
		
		System.out.println("                             ");
		System.out.println("******Fruits*******");
		for(Fruit f1:fruits)
		{
			System.out.println(f1);
		}

		Comparator<Fruit> calories= (i1,i2)->{
			if(i1.getCalories()>i2.getCalories()){
				return -1;
			}else if(i1.getCalories()<i2.getCalories()){
				return 1;
			}
			return 0;
		};

		Comparator<Fruit> price= (i1,i2)->{
			if(i1.getCalories()>i2.getCalories()){
				return 1;
			}else if(i1.getCalories()<i2.getCalories()){
				return -1;
			}
			return 0;
		};

		List<Fruit> fruits1=fruits.stream().filter(s->s.calories<100).sorted(calories).collect(Collectors.toList());
	    System.out.println("                             ");
		System.out.println("******sorting fruits with calories less than 100 in descending order ********");
		for(Fruit f2:fruits1)
		{
			System.out.println(f2);
		}


		Comparator<Fruit> color=(c1,c2)->c1.getColor().compareTo(c2.getColor());
		List<Fruit> fruits2=fruits.stream().sorted(color).collect(Collectors.toList());
		System.out.println("                             ");
		System.out.println("******sorting accoding to colors********");
		for(Fruit f3:fruits2)
		{
			System.out.println(f3);
		}
		
		List<Fruit> fruits3=fruits.stream().sorted(color.thenComparing(price)).collect(Collectors.toList());
		System.out.println("                             ");
		System.out.println("******sorting accoding to colors and price********");
		for(Fruit f4:fruits3)
		{
			System.out.println(f4);
		}
	}
}
