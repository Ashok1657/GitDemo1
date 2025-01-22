package Example;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class UIAutomation {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\chrome-win64\\chrome.exe");
		String baseURL = "https://www.ebay.com/";
		driver = new ChromeDriver();
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Search for anything']")).sendKeys("book");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[@value='Search']")));
		act.click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"item57870000cc\"]/div/div[2]/a")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]")).click();
		String cartValue = driver.findElement(By.xpath("//*[@class=\"badge\"]")).getText();
		Assert.assertEquals("1", "1");
		driver.close();
	}
}
