package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int m=1;
		for (int i=1; i<=8;i++)
		{
			System.out.println(n);
			int l=n+m;
			m=n;
			n=l;
		}
	}

}
