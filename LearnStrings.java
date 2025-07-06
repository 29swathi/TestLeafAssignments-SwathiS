package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName="TestLeaf";
		char nameArray[]=companyName.toCharArray();
		String rev="";
		for (int i=nameArray.length-1; i>=0;i--)
			rev+=nameArray[i];
		System.out.println(rev);
			
	}

}
