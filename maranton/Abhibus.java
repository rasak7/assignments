package maranton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Abhibus {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys("Madras");
		driver.findElement(By.xpath("//div[text()='Madras']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Tomorrow')]")).click();
		String Title=driver.findElement(By.xpath("//h5[text()='Orange Tours and Travels']")).getText();
		System.out.println(Title);
		driver.findElement(By.xpath("//button[contains(text(),'Show')]")).click();
		driver.findElement(By.xpath("//div[@class='label']/p")).click();
		driver.findElement(By.xpath("//div[@class='label']/p")).click();
		driver.findElement(By.xpath("//span[text()='U3']")).click();
		String busfare=driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println("busfare is "+busfare);
		String Seatno=driver.findElement(By.xpath("(//span[@class='text-primary'])[1]")).getText();
		System.out.println("Seat Number is "+Seatno);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
