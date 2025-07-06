package week3.day1;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {3, 5, 2, 6,3, 9, 2};
		//int  array2[]= { 4, 2, 9,8};
		for(int i=0; i<array1.length; i++) {
			for(int j=i+1; j<array1.length; j++) {
				if(array1[i]==array1[j])				
					System.out.println("duplicate value "+array1[i]);
			}
				
		}
}
}
