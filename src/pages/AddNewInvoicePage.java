package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AddNewInvoicePage extends PageObject{
	
	@FindBy(id="inv-form-back-btn")
	WebElement backBtn;
	
	@FindBy(id="click-to-enter")
	WebElement clickTitle;
	
	@FindBy(id="invoice-title-content")
	WebElement enterTitle;
	
	@FindBy(id="inv-form-status")
	WebElement formStatus;
	
	
	

	public AddNewInvoicePage(WebDriver driver) {
		super(driver);
	}
	
	public void backBtn() {
		wait.until(ExpectedConditions.visibilityOf(backBtn));
		
		backBtn.click();
		
	}
	
	public boolean checkAddNewInvoices() {
		wait.until(ExpectedConditions.visibilityOf(clickTitle));
		
		return clickTitle.isDisplayed();
		
	}
	
	public void enterTitle(String title) {
		wait.until(ExpectedConditions.visibilityOf(clickTitle));
		
		clickTitle.click();
		enterTitle.sendKeys(title);
		
		
		
	}
	
	

}
