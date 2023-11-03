package week2.day4.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafCreateAcct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		

		driver.findElement(By.className("inputLogin")).sendKeys("demoCSR");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Selenium Autom4");
		
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		
		Select industry=new Select(industryDD);
		
		industry.selectByIndex(3);
		
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		
		Select owner=new Select(ownershipDD);
		
		owner.selectByVisibleText("S-Corporation");
	
		Thread.sleep(1000);
		WebElement sourceD = driver.findElement(By.name("dataSourceId"));
		
		Select source=new Select(sourceD);
		
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketDD = driver.findElement(By.id("marketingCampaignId"));
		Select market=new Select(marketDD);
		market.selectByIndex(6);
		
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state=new Select(stateDD);
		state.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();

		WebElement name = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span"));
		
		String s=name.getText();
		System.out.println(s);
		
		if(s.contains("Selenium")){
		System.out.println("Printed correct account name");
		
		driver.quit();

	}
		
	}
}


