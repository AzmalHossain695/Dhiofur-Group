package page_classes;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class GalleryPage extends Form {
	public GalleryPage() {
		super(getGalleryPageUniqueElementLocator(), "Gallery page unique element");
	}
	private static By getGalleryPageUniqueElementLocator() {
		return By.xpath("//div[contains (text(), 'Gallery')]");
	}

	public void clickOTAPortal(){
		getElementFactory().getButton(By.xpath("//span[contains (text(), 'OTA Portal')]"),
				"OTA Portal button").click();
	}
}