package week1.day2;

public class Browser {

	public static void main(String[] args) {
		
		Browser objectBrowser=new Browser();
		objectBrowser.launchBrowser("chrome");	

	}
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		 return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	

}
