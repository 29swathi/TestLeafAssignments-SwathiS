package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data=12321, a=data;
		
		int finalData=0;
		for (;a!=0;)
		{
			int i=a%10;
			finalData=finalData*10+i;
			 a=a/10;
		}
		if  (data==finalData)
			System.out.println("Palindrome");
		else
			System.out.println("not a Palindrome");
	}

}
