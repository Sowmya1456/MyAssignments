package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser edgeBrowser=new Browser();
		String launchBrowser = edgeBrowser.launchBrowser("Edge");
		System.out.println(launchBrowser);
		edgeBrowser.loadURL();
	}
}
