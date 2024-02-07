package test_classes;

import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_classes.*;

import java.time.Duration;

public class DhiofurWebsiteTest extends BaseTest {
    HomePage homePage = new HomePage();
    AboutUsPage aboutUsPage = new AboutUsPage();
    ServicesPage servicesPage = new ServicesPage();
    OurConcernPage ourConcernPage = new OurConcernPage();
    BlogPage blogPage = new BlogPage();
    GalleryPage galleryPage = new GalleryPage();
    OTAPortalPage otaPortalPage = new OTAPortalPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    ConsultancyPage consultancyPage = new ConsultancyPage();
    @Test
    public void TestCase1() throws InterruptedException {
        Assert.assertTrue(homePage.state().isDisplayed(), "Home page isn't open");
        homePage.clickAboutUs();
        Assert.assertTrue(aboutUsPage.state().isDisplayed(), "About Us page isn't open");
        aboutUsPage.clickServices();
        Assert.assertTrue(servicesPage.state().isDisplayed(), "Services page isn't open");
        servicesPage.clickOurConcern();
        Assert.assertTrue(ourConcernPage.state().isDisplayed(), "Our Concern page isn't open");
        ourConcernPage.clickBlog();
        Assert.assertTrue(blogPage.state().isDisplayed(), "Blog page isn't open");
        blogPage.clickGallery();
        Assert.assertTrue(galleryPage.state().isDisplayed(), "Blog page isn't open");
        galleryPage.clickOTAPortal();
        Assert.assertTrue(otaPortalPage.state().isDisplayed(), "Blog page isn't open");
        otaPortalPage.clickContactUs();
        Assert.assertTrue(contactUsPage.state().isDisplayed(), "Contact Us page isn't open");
        contactUsPage.clickConsultancy();
        Assert.assertTrue(consultancyPage.state().isDisplayed(), "Consultancy page isn't open");
    }
}