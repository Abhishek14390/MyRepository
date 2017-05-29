package MyWork;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SLI_Booking {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Sel\\Gecko\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://gares3.bookmycargo.net/Account/GarudaLogin.cshtml);
		driver.navigate().to("http://45.cargoflash.com/sastest/Account/Login.cshtml"); 
		//driver.navigate().to("http://192.168.2.45/sastest/Account/Login.cshtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("cargoflashadmin");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("LogInBtn")).click();
		/*Alert alert=driver.switchTo().alert();
		alert.accept();*/
		
		String AWBNumber="88000065";
		/*String Agent="SHJ";
		String Dest="SHJ";
		String Account="RISHI";*/
		
		WebElement mnEle = driver.findElement(By.xpath("//*[@id='menu']/li/a")); 
		Actions builder = new Actions(driver);
		
		// Move cursor to the Main Menu Element
		builder.moveToElement(mnEle).build().perform();
		
		//Giving 5 Secs for submenu to be displayed
		Thread.sleep(3000);
		
		WebElement sbEle=driver.findElement(By.xpath("//*[@id='menu']/li/div/ul/li[1]/a"));
		
		builder.moveToElement(sbEle).click().perform();
		
		driver.switchTo().frame("iMasterFrame");
		
		Thread.sleep(3000);
		
		//CREATE NEW SLI *****************************************************
		
		driver.findElement(By.xpath(".//*[@id='btnNew']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iMasterFrame");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Text_CustomerType']")).click();
		driver.findElement(By.xpath("//*[@id='Text_CustomerType']")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Text_CustomerType']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id='Text_AirlineSNo']")).click();
		driver.findElement(By.xpath("//*[@id='Text_AirlineSNo']")).sendKeys("G9");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Text_AirlineSNo']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id='Text_AccountSNo']")).click();
		driver.findElement(By.xpath("//*[@id='Text_AccountSNo']")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Text_AccountSNo-list']/ul/li[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='AWBPrefix']")).clear();
		driver.findElement(By.xpath("//*[@id='AWBPrefix']")).sendKeys("514");
		driver.findElement(By.xpath("//*[@id='AWBNo']")).clear();
		//String AWBNumber="88000043";
		driver.findElement(By.xpath("//*[@id='AWBNo']")).sendKeys(AWBNumber);
		
		driver.findElement(By.xpath("//*[@id='Text_ChargeCode']")).click();
		driver.findElement(By.xpath("//*[@id='Text_ChargeCode']")).sendKeys("PP");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Text_ChargeCode']")).sendKeys(Keys.ENTER);
		
		WebElement Destination=driver.findElement(By.xpath("//*[@id='Text_DestinationAirportSNo']"));
		Destination.click();
		Destination.sendKeys(Keys.DOWN);
		//Thread.sleep(3000);
		Destination.sendKeys("S");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Text_DestinationAirportSNo-list']/ul/li[2]/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='Text_BookingType']")).click();
		driver.findElement(By.xpath("//*[@id='Text_BookingType']")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Text_BookingType']")).sendKeys("L");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Text_BookingType']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id='IDNumber']")).sendKeys("123456");
		
		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		Thread.sleep(5000);
				
		WebElement src=driver.findElement(By.xpath(".//*[@id='searchAWBNo']"));
		src.sendKeys(AWBNumber);
		src.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='btnSearch']")).click();
		Thread.sleep(5000);		
		
		//SAVE CUSTOMER INFORMATION *****************************************
		
		driver.findElement(By.xpath("//input[@value='C']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Text_SHIPPER_AccountNo']")).sendKeys("219");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Text_SHIPPER_AccountNo']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='Text_CONSIGNEE_AccountNo']")).sendKeys("261");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Text_CONSIGNEE_AccountNo']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		Thread.sleep(5000);		
		
		src.clear();
		src.sendKeys(AWBNumber);
		src.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='btnSearch']")).click();
		Thread.sleep(5000);
		
		//SAVE UNLOADING DETAILS ********************************************
		
		driver.findElement(By.xpath("//input[@value='U']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='Verified']")).click();
		driver.findElement(By.xpath("//input[@id='Verified_0']")).click();
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		Thread.sleep(5000);
		
		src.clear();
		src.sendKeys(AWBNumber);
		src.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='btnSearch']")).click();
		Thread.sleep(5000);
		
		//SAVE DIMENSION DETAILS ********************************************
		
		driver.findElement(By.xpath("//input[@value='D']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Pieces']")).sendKeys("10");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@id='_tempCapturedWeight']")).sendKeys("100");
		//driver.findElement(By.xpath("//input[@id='CapturedWeight']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_tempSLICBM']")).sendKeys("1");
		//driver.findElement(By.xpath("//input[@id='SLICBM']")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Text_PackingTypeSNo']")).click();
		driver.findElement(By.xpath(".//*[@id='Text_PackingTypeSNo']")).sendKeys("C");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Text_PackingTypeSNo']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//input[id='Text_PackingTypeSno']
		driver.findElement(By.xpath("//button[@id='btnSave']")).click();
		Thread.sleep(5000);
		
		src.clear();
		src.sendKeys(AWBNumber);
		src.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(".//*[@id='btnSearch']")).click();
		Thread.sleep(5000);
		
		//FINALIZE SLI ************************************************
		/*driver.findElement(By.xpath("//input[@id='faction']")).click();
		driver.findElement(By.xpath("//span[@class='actionSpan']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='actionSpan']")).getText());*/
		
		//input[@id='faction']
		
		//driver.close();
		
		
	}

}
