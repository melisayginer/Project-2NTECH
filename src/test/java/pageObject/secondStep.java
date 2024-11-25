package pageObject;

import org.openqa.selenium.By;
public class secondStep {
    public final By clickTestEngineer = By.xpath("//div//span[contains(., 'Test Engineer')]");
    public final By clickGonderButton = By.xpath("//div[@class='flex justify-center items-center gap-4']//div[contains(., 'Gönder')]");

}
