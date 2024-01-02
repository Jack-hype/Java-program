package program;

public class FibonacciSeries {
public static void main(String[] args) {
	
	int n=6;
	int a=0;
	int b=1;
	int c;
	for(int i=0; i<=n; i++)
	{
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	
		
	}
}
}
