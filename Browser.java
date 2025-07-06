package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser br=new Browser();
		String brName=br.launchBrowser("Chrome");
		System.out.println(brName);
		br.loadUrl();

	}
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched sucessfully");
		return browserName;
		
	}
	public  void  loadUrl()
	
	{
		System.out.println("Application url loaded sucessfully");
	}

}
