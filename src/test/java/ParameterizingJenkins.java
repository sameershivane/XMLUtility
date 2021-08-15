import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.commons.math3.distribution.WeibullDistribution;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xml.security.utils.XalanXPathFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class ParameterizingJenkins {

	static WebDriver driver;

	@Test
	public void driverinitialization() throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\sameers14\\Sameerworkspace\\XMLdrivan\\prop.properties");
		prop.load(fis);

		String browsername = System.getProperty("browser");
		// String browsername = prop.getProperty("browser");
		System.out.println(browsername);

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\SAMEER BACKUP\\Software\\Drivers\\chromedriver_win32 (4)\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.get("https://www.google.com/");
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\SAMEER BACKUP\\Software\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

			driver.get("https://www.google.com/");
		} else {
			System.setProperty("webdriver.opera.driver", "D:\\SAMEER BACKUP\\Software\\Drivers\\operadriver.exe");
			driver = new OperaDriver();

			driver.get("https://www.google.com/");
		}
		driver.manage().window().maximize();

	}

}
