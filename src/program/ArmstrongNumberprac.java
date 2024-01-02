package program;

public class ArmstrongNumberprac {public static void main(String[] args) {
   
	int n=8208; //153=1*1*1+5*5*5+3*3*3=153
	int c =n;
	int rem;
	int arm=0;
	while(n>0)
	{
		rem=n%10;
		arm=(rem*rem*rem*rem)+arm;
		n=n/10;
	}
	if(c==arm)
	{
		System.out.println("armstrong number");
	}
	else
	{
		System.out.println("not armstrong number");
	}
}	
}
