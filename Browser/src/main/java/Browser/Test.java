package Browser;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import com.microsoft.edge.seleniumtools.EdgeDriver;
import com.microsoft.edge.seleniumtools.EdgeOptions;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Simon\\workspace-tools\\Browser\\EdgeDriver\\msedgedriver.exe");
		EdgeOptions edgeOptions = new EdgeOptions();
		Path path = Paths.get(System.getenv("LOCALAPPDATA"), "Microsoft", "Edge", "User Data");
		edgeOptions.addArguments("user-data-dir=" + path);

		EdgeDriver edgeDriver =  new EdgeDriver(edgeOptions);
		
		System.out.println("TEST: " + edgeDriver.getTitle());
		
		edgeDriver.get("https://www.google.com/");
		edgeDriver.findElement(By.name("q")).sendKeys("BrowserStack Guide");
		
		//edgeDriver.close();
	}
}
