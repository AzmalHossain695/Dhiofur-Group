package page_classes;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AboutUsPage extends Form {
	public AboutUsPage() {
		super(getAboutUsPageUniqueElementLocator(), "About Us page unique element");
	}
	private static By getAboutUsPageUniqueElementLocator() {
		return By.xpath("//div[@class='slide-text' and contains(text(),'About Us')]");
	}

	public void clickServices(){
		getElementFactory().getButton(By.xpath("//li[@class='menu-item-has-children'][.//a[.//span[contains(text(), 'Services')]]]"),
				"Services button").click();
	}
}