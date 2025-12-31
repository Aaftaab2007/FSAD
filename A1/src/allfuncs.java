import java.util.*;
public class allfuncs {
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	int sub(int a,int b) {
		int d=a-b;
		return d;
	}
	boolean eve(int n) {
		boolean e;
		if(n%2==0) {
			e=true;
		}
		else {
			e=false;
		}
		return e;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a:");
		int a=s.nextInt();
		System.out.print("Enter b:");
		int b=s.nextInt();
		allfuncs fun=new allfuncs();
		int c=fun.add(a,b);
		System.out.println("Add="+c);
		int d=fun.sub(a,b);
		System.out.println("Sub:"+d);
		
		System.out.print("Enter number:");
		int n=s.nextInt();
		
		boolean e=fun.eve(n);
		if(e==true) {
			System.out.println("The given number is even");
		}
		else {
			System.out.println("The given number is odd");
		}
	}

}
