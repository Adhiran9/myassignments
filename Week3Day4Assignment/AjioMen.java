package Week3Day4Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.Strings;

import net.bytebuddy.description.annotation.AnnotationValue.ForConstant;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class AjioMen {

	private static final WebElement WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.ajio.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search AJIO']"));
		
		search.sendKeys("bags");
 
		search.sendKeys(Keys.RETURN);
		//click Mens checkbox
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Menscb = driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
		Menscb.click();
		driver.navigate().refresh();
		//click Mens Fashionbags under category
		WebElement Fashionbagscb = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
		Fashionbagscb.click();
		Thread.sleep(2000);
		
		WebElement title=driver.findElement(By.xpath("//*[@id='products']/div[3]/div/div[1]"));
		
		String tit=title.getText();
		
		if(tit.contains("Items Found")){
		System.out.println(tit);

		//List  of Brand names
		List<WebElement> brand= driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> brands = new ArrayList<String>();
		
		System.out.println("The list of brand names: \n");

		for(int i=0; i<brand.size();i++)
		{
			WebElement brandlist=brand.get(i);
			String brandnew=brandlist.getText();
			brands.add(brandnew);
			
			System.out.println(brandnew);
		}
		
		System.out.println("\n=============================\n");
		System.out.println("Bag names list : \n");
		
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> names1 = new ArrayList<String>();
		
		for (int j =0; j< names.size(); j++) {
			WebElement names2 = names.get(j);
			String names3=names2.getText();
			names1.add(names3);
			System.out.println(names3);
		}
		driver.close();
	}

		
	}

}
