package page_classes;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ContactUsPage extends Form {
	public ContactUsPage() {
		super(getContactUsPageUniqueElementLocator(), "Contact Us page unique element");
	}
	private static By getContactUsPageUniqueElementLocator() {
		return By.xpath("//div[contains (text(), 'Contact Us')]");
	}

	public void clickConsultancy(){
		getElementFactory().getButton(By.xpath("//span[contains (text(), 'Consultancy')]"),
				"Consultancy button").click();
	}
}