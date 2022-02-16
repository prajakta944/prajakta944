//To handle Static Drop-down
package selenium.MavenSelProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	
   String url;
   public Checkbox(String uRL) {
		this.url = uRL;
	}


public boolean Isdisplay() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\MyWork\\JavaPractice\\SeleniumPractice\\src\\common\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		// Find the check-box and store in WebElement
		WebElement source = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		return source.isDisplayed(); // True
   }
   
   
	public String checkboxx() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\MyWork\\JavaPractice\\SeleniumPractice\\src\\common\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Find the check-box and store in WebElement
		WebElement source = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		System.out.println(source.isDisplayed()); // True
		System.out.println(source.isEnabled()); // True
		System.out.println(source.isSelected()); // False

		// Click Check-box for selection
		source.click();
		System.out.println(source.isSelected()); // True

		// count no. of Check-boxes. Find the common attribue and call size method on
		// same.
		int size = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(size);
//		driver.quit();
		return "TeastCase Pass";

	
	}
	public static void main(String[] args) throws InterruptedException {
//		Checkbox c = new Checkbox();
//		c.checkboxx();
	}
}
