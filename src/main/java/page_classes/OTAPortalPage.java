package page_classes;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class OTAPortalPage extends Form {
	public OTAPortalPage() {
		super(getOTAPortalPageUniqueElementLocator(), "OTA Portal page unique element");
	}
	private static By getOTAPortalPageUniqueElementLocator() {
		return By.xpath("//div[contains (text(), 'OTA Portal')]");
	}

	public void clickContactUs(){
		getElementFactory().getButton(By.xpath("//span[contains (text(), 'Contact Us')]"),
				"Contact Us button").click();
	}
}