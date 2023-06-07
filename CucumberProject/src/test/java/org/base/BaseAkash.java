package org.base;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class BaseAkash {
	public static WebDriver driver;

	public static void launchbrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}

	public static void winmaximize() {
	driver.manage().window().maximize();

	}

	public static void launchurl(String url) {
	driver.get(url);
	}

	public static void pagetitil() {
	String title = driver.getTitle();
	System.out.println(title);
	}

	public static void pageurl() {
	String url = driver.getCurrentUrl();
	System.out.println(url);
	}

	public static void passtext(String txt , WebElement ele) {
	 ele.sendKeys(txt);
	}

	public static void clossentirebrowser() {
	driver.quit();
	}

	public static void clickbtn(WebElement ele) {
	ele.click();
	}

	public static void screenshort(String imgName) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File image = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("location+imagename.png");
	FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void movethecursor(WebElement targetWebElement) {
	a = new Actions(driver);
	a.moveToElement(targetWebElement).perform();
	}

	public static void dragdrop(WebElement dragwebelement, WebElement dropwebelement) {
	a = new Actions(driver);
	a.dragAndDrop(dragwebelement, dropwebelement).perform();
	}

	public static JavascriptExecutor js;

	public static void javascriptexecutor(WebElement truewebelement) {
	js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].ScrollIntoView(true)", truewebelement);
	}

	public static void scroll(WebElement element) {
	js = (JavascriptExecutor) driver;
	js.executeScript("arguments {0}.ScrollIntoView(false)", element);
	}

	public static void excelread(String sheetname, int rownum, int cellnum) throws IOException {
	File f = new File("C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\BaseClass\\\\Excel\\\\newsheet.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet mysheet = wb.getSheet("datas");
	Row r = mysheet.getRow(rownum);
	Cell c = r.getCell(cellnum);
	int cellType = c.getCellType();
	String value = " ";
	if (cellType == 1) {
	String value2 = c.getStringCellValue();
	System.out.println(value2);
	} else if (DateUtil.isCellDateFormatted(c)) {
	Date dd = c.getDateCellValue();
	SimpleDateFormat s = new SimpleDateFormat(value);
	String value1 = s.format(dd);
	System.out.println(value1);
	} else {
	double d = c.getNumericCellValue();
	long l = (long) d;
	String valueOf = String.valueOf(l);
	System.out.println(valueOf);
	}
	}

	public static void createnewexcelfile(int rowNum, int cellNum, String writedata) throws IOException {
	File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\BaseClass\\Excel\\excelsheet1.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet newsheet = w.createSheet("Datas");
	Row newrow = newsheet.createRow(rowNum);
	Cell newcell = newrow.createCell(cellNum);
	newcell.setCellValue(writedata);
	FileOutputStream fos = new FileOutputStream(f);
	w.write(fos);
	}

	public static void createcell(int rownum, int cellnum, String newdata) throws IOException {
	File f = new File ("C:\\Users\\ELCOT\\eclipse-workspace\\BaseClass\\Excel\\excelsheet1.xlsx");
	FileInputStream fis =new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	Sheet s = w.getSheet("Datas");
	Row r = s.getRow(rownum);
	Cell c = r.getCell(cellnum);
	c.setCellValue(newdata);
	FileOutputStream fos = new FileOutputStream(f);
	w.write(fos);

	}

	public static void createrow(int crerow, int crecell, String newdata) throws IOException {
	File f = new File ("C:\\Users\\ELCOT\\eclipse-workspace\\BaseClass\\Excel\\excelsheet1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheet("Datas");
	Row r = s.getRow(crerow);
	Cell c = r.getCell(crecell);
	c.setCellValue(newdata);
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	}

	public static void updatedatatopurticularcell(int gettherow, int getthecell, String existingdata,
	String writenewdata) throws IOException {
	File f = new File("excel location .xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheet("datas");
	Row r = s.getRow(getthecell);
	Cell c = r.getCell(getthecell);
	String str = c.getStringCellValue();
	if (str.equals(existingdata)) {
	c.setCellValue(writenewdata);
	}
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	}

	}


