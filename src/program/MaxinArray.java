package program;

public class MaxinArray {public static void main(String[] args) {

	int a[]= {5,6,2,15,21,14,18,20};
	int max=a[0];
	for(int i=1; i<a.length; i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
	
	System.out.println("======================");
	
	int min=a[0];
	for(int i=0; i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(min);
}

}
