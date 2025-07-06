package week3.day1;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1"; 
		String textArray[]=text.split(" ");
		System.out.println(Arrays.toString(textArray) );
		for(int i=0; i<textArray.length;i++)
		{
			for(int j=i+1;j<textArray.length;j++)
			{
				if(textArray[i].equalsIgnoreCase(textArray[j]))
					textArray[j]=" ";
			}
		}
		String output=String.join(" ", textArray);
		System.out.println(output );
	}

}
