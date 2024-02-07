package page_classes;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ConsultancyPage extends Form {
	public ConsultancyPage() {
		super(getConsultancyPageUniqueElementLocator(), "Consultancy page unique element");
	}
	private static By getConsultancyPageUniqueElementLocator() {
		return By.xpath("//div[contains (text(), 'Contact Us')]");
	}
}