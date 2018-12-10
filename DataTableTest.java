package demo;

import java.util.List;

public class DataTableTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".demo/chromedriver.exe");
		WebDriver chrdriver=new ChromerDriver();
		chrdriver.get("https://datatables.net/");
		List<WebElement> listEle=findelement(By.xpath("//select[@name='example_length']"));
		////*[@value='50']
		for (int i=1;1<=50;i++) {
			////table[@id='example']/tr[1]td[1]
		}
		 
	}

}
