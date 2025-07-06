package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String ary[]=test.split(" ");
		for (int i = 0; i < ary.length; i++) {
			if(i%2==0)
				System.out.print(ary[i]+" ");
			else
			{
				char charAry[]=ary[i].toCharArray();
				String a="";
				for (int j = charAry.length-1; j >=0 ; j--) {
					a+=charAry[j];
				}
				System.out.print(a +" ");
			}
		}
	}

}
