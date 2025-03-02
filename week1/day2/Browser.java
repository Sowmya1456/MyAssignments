package week1.day2;

public class Browser {
	
	String launchBrowser(String browserName) {
		System.out.println("Browser Launched Successfully");
		return browserName;
	}
	
	void loadURL() {
		System.out.println("Application URL loaded successfully");
	}

	public static void main(String[] args) {
		Browser browserObject = new Browser();
		System.out.println(browserObject.launchBrowser("Chrome"));
		browserObject.loadURL();		
	} 
}
