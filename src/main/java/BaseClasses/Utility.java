package BaseClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Utility {

	@Test
	public void TC01() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\SOFTWARE TESTING\\Chrome  Driver\\Chrome98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Welcome to Test NG");
		driver.get("https://www.facebook.com/login.php/");
	}

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		System.out.println("this is main method");

		FileInputStream File = new FileInputStream("F:\\SOFTWARE TESTING\\TestCAseExcelFile\\testData.xlsx");
		String a = WorkbookFactory.create(File).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();

		System.out.println("Data From Excell Sheet::" + a);

	}
}
