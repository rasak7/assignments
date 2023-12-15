package maranton;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws Exception {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tatacliq.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Ask me later']")).click();
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(brands).perform();
		WebElement Watches = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryDetailsValue'])[4]"));
		Actions ac2 = new  Actions(driver);
		ac2.moveToElement(Watches).perform();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		WebElement Dropdown = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select op = new Select(Dropdown);
		op.selectByVisibleText("New Arrivals");
		driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
		List<WebElement> Price = driver.findElements(By.xpath("//div[@class='ProductModule__imageAndDescriptionWrapper']"));
		for (int i = 1; i < Price.size(); i++) {
			String text = driver.findElement(By.xpath("(//div[@class='ProductModule__imageAndDescriptionWrapper'])["+ i + "]")).getText();
			System.out.println(text);
		}
		//driver.findElement(By.xpath("(//h3[@class='ProductDescription__boldText'])[1]")).click();
		driver.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//h3[@class='ProductDescription__boldText'])[1]")));
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> addtobag = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(addtobag.get(1));
		Actions ac3 = new Actions(driver);
		WebElement Scroll = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		ac3.scrollToElement(Scroll).perform();
		Scroll.click();
		String text2= driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Count of cart is "+ text2);
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		Thread.sleep(3000);
		File scr=driver.getScreenshotAs(OutputType.FILE);
		File des = new File ("./Snaps/snap.png");
		FileUtils.copyFile(scr, des);
		driver.quit();
		
		
	
		
	}

}
