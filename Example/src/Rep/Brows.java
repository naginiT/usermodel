package Rep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brows {
	public static WebDriver driver;
	
	public static void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NAGESHWARI\\Desktop\\Nageshwari files\\jarfiles\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://localhost:9095/OnlineHibernate/");
		
	}
	
	
	
	public static void close() {
		driver.quit();
	}
	

}
