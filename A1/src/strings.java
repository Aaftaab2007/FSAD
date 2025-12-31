public class strings {

	public static void main(String[] args) {
		int ages[]= {20,10,11,54,43,51,95};
		float avg, sum=0;
		int length=ages.length;
		for(int age :ages)
		{
			sum+=age;
		}
		avg=sum/length;
		System.out.println(avg);

	}

}