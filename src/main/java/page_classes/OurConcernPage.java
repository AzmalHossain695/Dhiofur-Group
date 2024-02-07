package page_classes;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class OurConcernPage extends Form {
	public OurConcernPage() {
		super(getOurConcernPageUniqueElementLocator(), "Our Concern page unique element");
	}
	private static By getOurConcernPageUniqueElementLocator() {
		return By.xpath("//div[contains (text(), 'Our Concerns')]");
	}

	public void clickBlog(){
		getElementFactory().getButton(By.xpath("//span[contains (text(), 'Blog')]"),
				"Blog button").click();
	}
}