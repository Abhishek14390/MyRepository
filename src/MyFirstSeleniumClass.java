import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstSeleniumClass {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		/*System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Sel\\Gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");*/
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Sel\\Gecko\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		/*String expValue="Welcome: Mercury Tours";
		String actValue=driver.getTitle();
		if(expValue.contentEquals(actValue))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		System.out.println(driver.getCurrentUrl());		
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		//System.out.println(driver.getTitle());
				
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");
		Thread.sleep(2000);
		username.clear();
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("tutorial");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.name("login"));
		//login.click();
		Thread.sleep(2000);*/
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
		//driver.findElement(By.partialLinkText("REGISTER")).click();
		
		/*List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText()+" URLs "+allLinks.get(i).getAttribute("href"));
		}*/
		
		/*driver.findElement(By.name("firstName")).sendKeys("Abhishek");
		driver.findElement(By.name("lastName")).sendKeys("Singh");
		driver.findElement(By.name("phone")).sendKeys("9999345038");
		driver.findElement(By.name("userName")).sendKeys("aksingh@cargoflash.com");
		driver.findElement(By.name("address1")).sendKeys("DLF Phase 3");
		driver.findElement(By.name("address2")).sendKeys("Gurugram");		
		driver.findElement(By.name("city")).sendKeys("Gurugram");
		driver.findElement(By.name("state")).sendKeys("Haryana");		
		driver.findElement(By.name("postalCode")).sendKeys("122010");
		
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("INDIA");		
		
		driver.findElement(By.name("email")).sendKeys("abhishek");
		driver.findElement(By.name("password")).sendKeys("abhishek");
		driver.findElement(By.name("confirmPassword")).sendKeys("abhishek");
		driver.findElement(By.name("register")).click();*/
				
		/*driver.findElement(By.name("Country")). sendKeys("INDIA");
		driver.findElement(By.name("Country")).sendKeys(Keys.ENTER);*/
		//select.
		
		//Ways to select option from drop down
		/*selectbyvisibleText
		selectbyvalue
		selectbyindex*/
		
		//How to print all items of drop down
		
		//Select dropdown=new Select(driver.findElement(By.name("country")));
		/*dropdown.selectByVisibleText("INDIA");
		List <WebElement> AllOptions=dropdown.getOptions();
		AllOptions.size();
		for(int i=0;i<AllOptions.size();i++)
		{
			System.out.println(AllOptions.get(i).getText());
		}*/
		/*Select dropdown=new Select(driver.findElement(By.name("country")));
			
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.getAllSelectedOptions();*/
		
		//OBJECT REPOSITORY(PROPERTIES FILE)
		
		/*FileInputStream fis= new FileInputStream("D:\\Eclipse\\SeleniumProject\\src\\OR.Properties");
		
		//FileInputStream  fis= System.getProperty(arg0)
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("PW"));
				
		driver.findElement(By.name(prop.getProperty("UN"))).sendKeys("tutorial");
		driver.findElement(By.name(prop.getProperty("PW"))).sendKeys("tutorial");*/
		
		//28th May : HOW TO INTEGRATE SELENIUM WITH EXCEL
		
		//3rd Party API : Apache-POI
		FileInputStream file=new FlieInputStream("<Path of Execl File>");
		XSSFWorkbook workbook=new Xssfworkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int totalRows=Sheet.getLastRowNum()+1;
		
		int colcount=Sheet.getRow(0).getLastCellNum();
		
		//TO CHECK WHETHER SHEET EXISTS IN WORKBOOK OR NOT
		
		int index=workbook.getSheetIndex("Sheet3");//IT WILL GIVE RESULT AS -1
		
		workbook.getSheetAt(index);
		
		XSSFRow row=sheet.getRow(2);
		row.getCell(1).getStringCellValue();
		row.getCell(1).getNumericCellValue();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
