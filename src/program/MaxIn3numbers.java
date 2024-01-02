package program;

public class MaxIn3numbers {public static void main(String[] args) {
	int a=10;
	int b=15;
	int c=11;
	if(a>b)
	{
		if(a>c)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(c);
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}
}

}
