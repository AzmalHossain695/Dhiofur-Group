package page_classes;

import org.openqa.selenium.By;
import aquality.selenium.forms.Form;
public class HomePage extends Form {
	public HomePage() {
		super(getHomePageUniqueElementLocator(), "Home page unique element");
	}
	private static By getHomePageUniqueElementLocator() {
		return By.xpath("//div[@class='banner_img_div']");
	}

	public void clickAboutUs(){
		getElementFactory().getButton(By.xpath("//span[contains(text(), 'About us')]"), "About Us button").click();
	}
}