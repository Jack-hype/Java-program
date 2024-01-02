package program;

public class ReverseArray {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5,6,7,8,9};
	int b[]={1,2,3,4,5,6,7,8,9};
	for(int i=a.length-1; i>=0; i--)
	{
		b[i]=a[i];
		System.out.println(b[i]);
		//System.out.println(a[i]);
	}
     //System.out.println(a.length);
}
}
