package maranton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {

	public static void main(String[] args) throws Exception {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Select genre = new Select(driver.findElement(By.xpath("//select[@name='genre']")));
		genre.selectByVisibleText("All Genres");
		Select lang = new Select(driver.findElement(By.xpath("//select[@name='lang']")));
		lang.selectByVisibleText("TAMIL");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'Kannum')]/preceding-sibling::img")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(4000);
		WebElement cinema=driver.findElement(By.xpath("//select[@name='cinemaName']"));
		Select op = new Select(cinema);
		op.selectByIndex(2);
		WebElement preTime =driver.findElement(By.xpath("//select[@name='timings']"));
		Select time = new Select(preTime);
		time.selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("Abdul Rasak");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rasak0708@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8838938843");
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
