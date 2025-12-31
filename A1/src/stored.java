import java.util.*;
public class stored {
	int getSoap(int money,int dis) {
		System.out.println("Soap Purchased");
		int c=money-dis;
		return c;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the price:");
		int n=s.nextInt();
		System.out.print("Discount:");
		int d=s.nextInt();
		stored obj1=new stored();
		int c=obj1.getSoap(n,d);
		System.out.println("Final Price="+n+"-"+d+"="+c);
	}
}