package page_classes;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ServicesPage extends Form {
	public ServicesPage() {
		super(getServicesPageUniqueElementLocator(), "Services page unique element");
	}
	private static By getServicesPageUniqueElementLocator() {
		return By.xpath("//div[contains (text(), 'Services')]");
	}

	public void clickOurConcern(){
		getElementFactory().getButton(By.xpath("//span[contains (text(), 'Our Concern')]"), "Our Concern Button").click();
	}
}