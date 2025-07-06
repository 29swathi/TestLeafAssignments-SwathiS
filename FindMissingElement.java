package week3.day1;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {1, 4,3,2,8, 6, 7};
		for(int i=1; i<array1.length; i++) {
			int count=0;		
			for(int j=0; j<array1.length; j++)			
			{		
				if(array1[j]==i)
				{
					count++;	
					//System.out.println(array1[i]);
				}				
			}
			if(count==0)
			{
				System.out.println(i);
				break;
			}
			}	

	}

}
