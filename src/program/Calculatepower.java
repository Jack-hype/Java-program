package program;

public class Calculatepower {
	public static void main(String[] args) {
		//5^3=5*5*5=125
		
		int a=5;
		int b=3;
		int result =1;
		for(int i=1; i<=b; i++)
		{
			result=a*result;
		}
		System.out.println(result);
	}

}
