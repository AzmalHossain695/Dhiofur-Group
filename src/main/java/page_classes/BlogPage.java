package page_classes;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class BlogPage extends Form {
	public BlogPage() {
		super(getBlogPageUniqueElementLocator(), "Blog page unique element");
	}
	private static By getBlogPageUniqueElementLocator() {
		return By.xpath("//div[contains (text(), 'Our Blogs')]");
	}

	public void clickGallery(){
		getElementFactory().getButton(By.xpath("//span[contains (text(), 'Gallery')]"),
				"Gallery button").click();
	}
}