	import org.openqa.selenium.By;  
	import org.openqa.selenium.WebDriver;  
	import org.openqa.selenium.chrome.ChromeDriver;  
	public class Second {  
	  
	    public static void main(String[] args) {  
	        try {
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "A:\\chromedriver)\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.navigate().to("https://www.google.com/?gws_rd=ssl");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
          
    // Click on the search button  
    driver.findElement(By.name("btnK")).click();  
      	    }catch(Exception e)
	        {
      	    	System.out.println(e.getMessage());
	        }
} } 
