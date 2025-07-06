package week1.day2;

public class EdgeBowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser ebr=new Browser();
		String ebrName=ebr.launchBrowser("EdgeBrowser");
		System.out.println(ebrName);
		ebr.loadUrl();
	}

}
