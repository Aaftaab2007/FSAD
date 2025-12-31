
public class excep_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=0;
		try {
			int a=10/0;
			er=0;
		}
		catch(Exception e) {
			er=1;
		}
		finally {
			if(er==1)
				System.out.println("Error found");
			else
				System.out.println("No error");
		}

	}

}
