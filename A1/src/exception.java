import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        	int result =10/2;
        	String s=null;
        	s.length();
        }
        catch(ArithmeticException e) {
        	System.out.println("Arithmetic error:" + e.getMessage());
        }
        catch(NullPointerException e) {
        	System.out.println("Null pointer exception:" + e.getMessage());
        }
        catch(Exception e) {
        	System.out.println("General error:" + e.getMessage());
        }
        finally {
        	System.out.println("Finally executed");
        }

        sc.close();
    }
}
