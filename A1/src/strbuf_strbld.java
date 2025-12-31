public class strbuf_strbld {

	public static void main(String[] args) {
		String str="Welcome";
		System.out.println(str.concat("to java quest"));
		System.out.println(str);
		
		// String builder
		
		StringBuilder sbl=new StringBuilder("Welcome ");
		System.out.println(sbl.append("to java quest"));
		System.out.println(sbl);
		
		// String buffer
		
		StringBuffer sbuf=new StringBuffer("Hello");
		System.out.println(sbuf.append(" to java"));
		System.out.println(sbuf);
	}

}