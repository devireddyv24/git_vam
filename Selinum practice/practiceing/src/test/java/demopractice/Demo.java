package demopractice;




import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.text.html.parser.Element;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mongodb.MapReduceCommand.OutputType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
    
	     ExtentHtmlReporter htmlreporter;
	     ExtentReports extent;
	     WebDriver driver;
	
	
	@BeforeSuite
	public void test() {
		 htmlreporter=new ExtentHtmlReporter("extent.html");
		 extent=new ExtentReports();
		 extent.attachReporter(htmlreporter);
	  	  
	}
	
	@BeforeTest
	public void test31() {
		 WebDriverManager.chromedriver().setup();
	  	  driver=new ChromeDriver();
	  	// driver.get("http://www.amazon.com");
	  	 driver.manage().window().maximize();
	  	  
	}
	
	
	
	@Test(priority=4)
	public void Signin() throws Exception {
		//driver.get("http://www.amazon.com");
		ExtentTest test= extent.createTest("Amazon sigin","sample");
		test.log(Status.INFO, "Amazon signin functionality(status,details)");
		test.info("Amazon signin functionality(details)");
		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		
		
	  	//driver=new ChromeDriver();
	  	driver.get("https://www.amazon.com");
	  	//driver.manage().window().maximize();
	  	  
	  	WebElement signin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	  	Actions actions=new Actions(driver);
	  	actions.moveToElement(signin).perform();
	  	  
	  	WebElement sign=driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
	  	sign.click();
	    //Thread.sleep(60000);
	  	WebElement email=driver.findElement(By.id("ap_email"));
	  	email.sendKeys("bhaskarnallaganti@gmail.com");
	  	WebElement button=driver.findElement(By.id("continue"));
	  	button.click();
	  	WebElement password=driver.findElement(By.id("ap_password"));
	  	password.sendKeys("Bhaskar230@");
	  	WebElement btn=driver.findElement(By.id("signInSubmit"));
	  	btn.click();
	  	//driver.close();
	}
	
	@Test(priority=1)
	public void scrolldown() throws Exception {
		ExtentTest test= extent.createTest("Scrolldown","sample");
		test.log(Status.INFO, "Amazon application scrolldown(status,details)");
		test.info("Amazon application scrolldown(details)");
		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 */
	  	driver.get("http://www.amazon.com");
	  	driver.manage().window().maximize(); 
			  
	    WebElement ele=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
	    Actions actions=new Actions(driver);
		actions.moveToElement(ele).perform();
			 
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		actions.sendKeys(Keys.PAGE_UP).build().perform();			    
	}
	
	@Test(priority=0)
	public void dropdown() throws Exception {
		
		ExtentTest test= extent.createTest("Dropdown","sample");
		test.log(Status.INFO, "Amazon application scrolldown(status,details)");
		test.info("Amazon application scrolldown(details)");
		test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 */
	  	driver.get("http://www.amazon.com");
	  	driver.manage().window().maximize();
	  	  
	  	Select all=new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
	  	all.selectByVisibleText("Books");
	  	  
	  	WebElement search=driver.findElement(By.id("nav-search-submit-button"));
	  	search.click();
	}
	
	@Test(priority=2)
	public void test42() throws Exception {
		ExtentTest test= extent.createTest("Dropdown","sample");
		test.log(Status.INFO, "Amazon application scrolldown(status,details)");
		test.info("Amazon application scrolldown(details)");
		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 */
	    driver.get("http://www.amazon.com");
	  	driver.manage().window().maximize();
	  	  
	  	WebElement all=driver.findElement(By.id("nav-hamburger-menu"));
	  	all.click();
	  	Actions dragger = new Actions(driver);
	  	WebElement draggablePartOfScrollbar = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]"));
	  	int numberOfPixelsToDragTheScrollbarDown = 5000;
	  	dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
	  	//WebElement U_states=driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[23]/a"));
	  	//U_states.click();
	  	Select state=new Select(driver.findElement(By.xpath("//*[@id=\"icp-dropdown\"]/span/span/span")));
	  	state.selectByIndex(8);
	}
	
	@Test(priority=3)
	public void booking_bus() throws Exception {
		
		ExtentTest test= extent.createTest("Booking bus","sample");
		test.log(Status.INFO, "Booking bus (status,details)");
		test.info("Booking bus rtc(details)");
		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 */
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		WebElement from=driver.findElement(By.id("fromPlaceName"));
  	    from.sendKeys("HYDERABAD");
  	    from.sendKeys(Keys.TAB);
  	    Thread.sleep(3000);
  	  
        WebElement to=driver.findElement(By.id("toPlaceName"));
  	    to.sendKeys("RAJAMAHENDRAVARAM");
  	    to.sendKeys(Keys.TAB);
  	    Thread.sleep(3000);     	  
  	    WebElement date=driver.findElement(By.id("txtJourneyDate"));
  	    date.click();
  	    WebElement datepick=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[3]/a"));
  	    datepick.click();
  	    Thread.sleep(3000);
  	    WebElement retu=driver.findElement(By.id("txtReturnJourneyDate"));
  	    retu.click();
  	    Thread.sleep(3000);
  	    WebElement returndate=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[5]/a"));
  	    returndate.click();
  	    WebElement check=driver.findElement(By.id("searchBtn"));
  	    check.click();
  	    Thread.sleep(4000);
  	    Alert Alert=driver.switchTo().alert();
  	    Alert.accept();
		
	}
    
	@Test(priority=5)
	public void Excel() throws IOException {
		
		ExtentTest test= extent.createTest("Excel format","sample");
		test.log(Status.INFO, "Excel format (status,details)");
		test.info("Reading Excel format(details)");
		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 */
     	driver.get("http://www.uitestpractice.com/");
     	driver.manage().window().maximize();
     	
     	
     	
     	WebElement Form=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a"));
     	Form.click();
     	//driver.navigate().refresh();
     	
     	WebElement firstname=driver.findElement(By.xpath("//input[@id='firstname']"));
     	firstname.sendKeys(Readingdata_Bhaskar_Excel(0,0));
     	WebElement lastname=driver.findElement(By.id("lastname"));
     	lastname.sendKeys(Readingdata_Bhaskar_Excel(1,0));
     	WebElement status=driver.findElement(By.name("optradio"));
     	status.click();
     	WebElement hobby=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[4]/input"));
     	hobby.click();
     	Select country=new Select(driver.findElement(By.id("sel1")));
     	country.selectByIndex(19);
     	WebElement DOB=driver.findElement(By.id("datepicker"));
     	DOB.click();
     	WebElement date=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a"));
     	date.click();
     	//WebElement number=driver.findElement(By.id("phonenumber"));
     	//number.sendKeys(Readingdata_Bhaskar_Excel(2,0));
     	WebElement username=driver.findElement(By.id("username"));
     	username.sendKeys(Readingdata_Bhaskar_Excel(3,0));
     	WebElement email=driver.findElement(By.id("email"));
     	email.sendKeys(Readingdata_Bhaskar_Excel(4,0));
     	WebElement about=driver.findElement(By.id("comment"));
     	about.sendKeys(Readingdata_Bhaskar_Excel(5,0));
     	WebElement password=driver.findElement(By.id("pwd"));
     	password.sendKeys(Readingdata_Bhaskar_Excel(6,0));
     	WebElement submit=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[12]/div/button"));
     	submit.click();
     }
     
     public static String  Readingdata_Bhaskar_Excel(int rownum,int cellnum) throws IOException {
 		
 		//reading the data from excel sheet
 	  	  FileInputStream bhas=new FileInputStream("C:\\Users\\BhaskarNallaganti\\Desktop\\Testngframework\\Testng\\TestData\\UITest.xlsx");
 	  	//working with excel file like open, manage and update
 	  	  XSSFWorkbook wrkbook=new XSSFWorkbook(bhas);
 	  	//to work with specific sheet using get sheet method
 	  	  XSSFSheet wrksheet=wrkbook.getSheet("Bhaskar");
 	  	//working with row and cell and getting string value based on cell and row number
 	  	  return wrksheet.getRow(rownum).getCell(cellnum).getStringCellValue();
 	}
	
     @Test(priority=5)
	public void Selenium_tutorial() throws Exception {
    	 
    	ExtentTest test= extent.createTest("Selenium tutorial","sample");
 		test.log(Status.INFO, "Selenium tutorial (status,details)");
 		test.info("Selenium tutorial(details)");
 		test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
 		test.addScreenCaptureFromPath("screenshot.png");
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 */
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.id("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[1]/td[2]/input"));
		firstname.sendKeys("Bhaskar");
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[2]/td[2]/input"));
		lastname.sendKeys("Bhaskar");
		WebElement gender=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[1]"));
		gender.click();
		WebElement exp=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[4]/td[2]/span[1]/input"));
		exp.click();
		WebElement date=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[5]/td[2]/input"));
		date.sendKeys("01-02-2023");
		WebElement prof=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[6]/td[2]/span[2]/input"));
		prof.click();
		WebElement choosefile=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[7]/td[2]/input"));
		choosefile.sendKeys("C:\\Users\\BhaskarNallaganti\\Pictures\\Test Execution sheet..PNG");
		Thread.sleep(2000);
		WebElement flv_selenium=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[8]/td[2]/span[3]/input"));
		flv_selenium.click();
		Thread.sleep(2000);
		Select Continents=new Select(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[9]/td[2]/select")));
		Continents.selectByVisibleText("Europe");
		Thread.sleep(2000);
		WebElement commands=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[10]/td[2]/select/option[5]"));
		commands.click();
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[11]/td[2]/button"));
		button.click();	  
	}
     
     @Test(priority=6)
     public void drag_drop() throws Exception {
    	 
    	 ExtentTest test= extent.createTest("Drag & Drop","sample");
 		 test.log(Status.INFO, "Drag & Drop (status,details)");
 		 test.info("Reading Excel format(details)");
 		 test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
 		 test.addScreenCaptureFromPath("screenshot.png");
 		
			/*
			 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
			 */
         driver.get("http://www.uitestpractice.com/");
         driver.manage().window().maximize();
         
         WebElement drag=driver.findElement(By.id("draggable"));
         WebElement drop=driver.findElement(By.id("droppable"));
         Actions actions=new Actions(driver);
         actions.dragAndDrop(drag, drop).build().perform();
     }
     
     @Test(priority=8)
     public void test89() throws Exception {
    	 ExtentTest test= extent.createTest("Alerts","sample");
  		 test.log(Status.INFO, "Alerts (status,details)");
  		 test.info("Reading Excel format(details)");
  		 test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
  		 test.addScreenCaptureFromPath("screenshot.png");
			/*
			 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
			 */
         driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
         driver.manage().window().maximize();
         driver.findElement(By.id("promptBox")).click();
         Alert s=driver.switchTo().alert();
        
        
         System.out.println(s.getText());
         //Thread.sleep(1000);
         s.sendKeys("Bhaskar");
        
         s.accept();

         System.out.println(driver.findElement(By.id("output")).getText());
     }
     
     
     @Test(priority=7)
     public void Registration() throws Exception {
    	 
    	 ExtentTest test= extent.createTest("Selenium tutorial","sample");
  		 test.log(Status.INFO, "Selenium tutorial (status,details)");
  		 test.info("Selenium tutorial(details)");
  		 test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
  		 test.addScreenCaptureFromPath("screenshot.png");
			/*
			 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
			 */
    	 driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
    	 driver.manage().window().maximize();
    	 
    	 WebElement firstname=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[1]/input"));
    	 firstname.sendKeys("Bhaskar");
    	 Thread.sleep(2000);
    	 WebElement lastname=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[2]/input"));
    	 lastname.sendKeys("Bhaskar");
    	 Thread.sleep(2000);
    	 WebElement status=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[2]/div/label[1]/input"));
    	 status.click();
    	 Thread.sleep(2000);
    	 WebElement hobby=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[3]/div/label[3]/input"));
    	 hobby.click();
    	 Thread.sleep(2000);
    	 Select country=new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[4]/select")));
    	 country.selectByIndex(1);
    	 Thread.sleep(2000);
    	 Select month=new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[1]/select")));
    	 month.selectByIndex(1);
    	 Thread.sleep(2000);
    	 Select day=new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[2]/select")));
    	 day.selectByIndex(1);
    	 Thread.sleep(2000);
    	 Select year=new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[3]/select")));
    	 year.selectByIndex(1);
    	 Thread.sleep(2000);
    	 WebElement number=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[6]/input"));
    	 number.sendKeys("9346227048");
    	 WebElement username=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[7]/input"));
    	 username.sendKeys("bhaskar");
    	 WebElement email=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[8]/input"));
    	 email.sendKeys("bhaskar@gmail.com");
    	 WebElement choosefile=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[9]/input"));
 		 choosefile.sendKeys("C:\\Users\\BhaskarNallaganti\\Pictures\\Test Execution sheet..PNG");
 		 WebElement about=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[10]/textarea"));
 		 about.sendKeys("bhasksar");
 		 WebElement password=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[11]/input"));
 		 password.sendKeys("bhaskar");
 		 WebElement conform_password=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[12]/input"));
 		 conform_password.sendKeys("bhaskar");
 		 WebElement submit=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[13]/input"));
 		 submit.click();
    	 
     }
     
     @Test(priority=9)
     public void main_submenu() throws Exception {
    	 
    	 ExtentTest test= extent.createTest("Enhops mouse over","sample");
  		 test.log(Status.INFO, "Enhops Mouse over (status,details)");
  		 test.info("Selenium tutorial(details)");
  		 test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
  		 test.addScreenCaptureFromPath("screenshot.png");
  		 
			/*
			 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
			 */
 		 driver.get("https://enhops.com/");
 		 driver.manage().window().maximize();
 		
 		 WebElement mainmenu=driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/nav[1]/ul/li[2]/a"));
 		 Actions actions=new Actions(driver);
 		 actions.moveToElement(mainmenu);
 		 WebElement submenu=driver.findElement(By.xpath("/html/bod/header/div[1]/div/div[2]/nav[1]/ul/li[2]/ul/li[1]/a"));
 		 actions.moveToElement(submenu);
 		 WebElement digital=driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/nav[1]/ul/li[2]/ul/li[1]/ul/li[2]/a"));
 		 actions.moveToElement(digital);
 		 actions.click().build().perform();
     }
	@AfterSuite
	public void test2() {
		 extent.flush();
	}
	
}	
	
