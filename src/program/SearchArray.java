package program;

public class SearchArray {
	public static void main(String[] args) {
		int a[]= {10,15,15,20,22,33,12};
		int n=15;
		int count=0;
		for(int i=0;i<a.length; i++)
		{
			if(a[i]==n)
			{
				count++ ;
			}
		}
		if(count>0)
		{
			System.out.println("item found"+count);
		}
		else
		{
			System.out.println("not found");
		}
	}

}
