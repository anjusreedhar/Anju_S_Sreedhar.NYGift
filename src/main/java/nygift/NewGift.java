package nygift;
import java.util.*;
abstract class Sweets{
	protected int weight;
	public Sweets(int weight)
	{
		this.weight=weight;
	}
	abstract void display();
}

class Gulabjamun extends Sweets{
	public Gulabjamun(int weight)
	{
		super(weight);
	}
	void display()
	{
		System.out.println("Weight of Gulabjamun:"+weight+"grams");
	}
}

class Rasgulla extends Sweets{
	public Rasgulla(int weight)
	{
		super(weight);
	}
	void display()
	{
		System.out.println("Weight of Rasgulla:"+weight+"grams");
	}
}

abstract class Candies{
	protected int weight;
	public Candies(int weight)
	{
		this.weight=weight;
	}
	abstract void display();
}

class Chocolate extends Candies{
	public Chocolate(int weight)
	{
		super(weight);
	}
	void display()
	{
		System.out.println("Weight of Chocolate:"+weight+"grams");
	}
}

class Milkybar extends Candies{
	public Milkybar(int weight)
	{
		super(weight);
	}
	void display()
	{
		System.out.println("Weight of Milkybar:"+weight+"grams");
	}
}

public class NewGift {

	public static void main(String[] args) {
		int g,r,c,m,i,a,sum=0;
		System.out.print("Enter the number of Gulabjamun required:");
		Scanner sc=new Scanner(System.in);
		g=sc.nextInt();
		ArrayList<Sweets> list=new ArrayList<Sweets>();
		System.out.println("Enter the Weights of Gulabjamun:");
		for(i=0;i<g;i++)
		{
			a=sc.nextInt();
			sum=sum+a;
			Sweets obj=new Gulabjamun(a);
			obj.display();
			list.add(obj);
		}
		System.out.println("Total Weight of Gulabjamun:"+sum);
		sum=0;
		System.out.print("Enter the number of Rasgulla required:");
		r=sc.nextInt();
		ArrayList<Sweets> list1=new ArrayList<Sweets>();
		System.out.println("Enter the Weights of Rasgulla:");
		for(i=0;i<r;i++)
		{
			a=sc.nextInt();
			sum=sum+a;
			Sweets obj1=new Rasgulla(a);
			obj1.display();
			list1.add(obj1);
		}
		System.out.println("Total Weight of Rasgulla:"+sum);
		sum=0;
		System.out.print("Enter the number of Chocolates required:");
		c=sc.nextInt();
		ArrayList<Candies> list2=new ArrayList<Candies>();
		System.out.println("Enter the Weights of Chocolate:");
		for(i=0;i<c;i++)
		{
			a=sc.nextInt();
			sum=sum+a;
			Candies obj2=new Chocolate(a);
			obj2.display();
			list2.add(obj2);
		}
		System.out.println("Total Weight of Chocolate:"+sum);
		sum=0;
		System.out.print("Enter the number of Milkybar required:");
		c=sc.nextInt();
		ArrayList<Candies> list3=new ArrayList<Candies>();
		System.out.println("Enter the Weights of Milkybar:");
		for(i=0;i<c;i++)
		{
			a=sc.nextInt();
			sum=sum+a;
			Candies obj3=new Milkybar(a);
			obj3.display();
			list3.add(obj3);
		}
		System.out.println("Total Weight of Milkybar:"+sum);
		sum=0;
		Collections.sort(list2,new Comparator<Candies>()
		{
			public int compare(Candies o1,Candies o2)
			{
				return Integer.valueOf(o1.weight).compareTo(o2.weight);
			}
		});
		System.out.println("The Ascending Order of Chocolates:-");
	
		for(i=0;i<list2.size();i++)
			System.out.println("Order : "+list2.get(i).weight);
		
		Collections.sort(list3,new Comparator<Candies>()
		{
			public int compare(Candies o1,Candies o2)
			{
				return Integer.valueOf(o1.weight).compareTo(o2.weight);
			}
		});
		System.out.println("The Ascending Order of Milkybar:-");
	
		for(i=0;i<list3.size();i++)
			System.out.println("Order : "+list3.get(i).weight);
		

	}

}

