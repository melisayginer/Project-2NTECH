package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class firstStep {

    public final By nameSurname = By.xpath("//input[@name='name']");
    public final By birthDate = By.xpath("//input[@name='birth']");
    public final By idNumber = By.xpath("//input[@name='tcKimlik']");
    public final By phoneNumber = By.xpath("//input[@name='phone']");
    public final By eMail = By.xpath("//input[@name='email']");
    public final By installCV = By.xpath("//div[@class='flex items-center']");
    public final By educationInfoOnlisans = By.xpath("//button[contains(., 'Önlisans')]");
    public final By educationInfoLisans = By.xpath("//button[contains(., 'Lisans')]");
    public final By educationInfoYuksekLisans = By.xpath("//button[contains(., 'Yüksek')]");
    public final By educationInfoDoktora = By.xpath("//button[contains(., 'Doktora')]");
    public final By educationInfoLise = By.xpath("//button[contains(., 'Lise')]");
    public final By nextButton = By.xpath("//button[@aria-label='Go to the next step']");

}
