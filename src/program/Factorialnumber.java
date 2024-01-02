package program;

public class Factorialnumber {public static void main(String[] args) {
	int n=15;
	//15=15*14*13*12*11*10*9*8*7*6*5*4*3*2*1=total
	int multi=1;
	for(int i=5; i>0; i--)
	{
		multi=multi*i;
	}
	System.out.println(multi);
}

}
