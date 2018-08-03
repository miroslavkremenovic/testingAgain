package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InvoicesPage extends PageObject{
	
	Actions builder = new Actions(driver);
	
	@FindBy(id="home-page-user")
	WebElement userID;
	
	@FindBy(xpath="//*[@id='app']/div[27]/main/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/label")
	WebElement filterClient;
	
	@FindBy(id="filter-from")
	WebElement filterFrom;
	
	@FindBy(id="filter-to")
	WebElement filterTo;
	
	@FindBy(id="filter-period")
	WebElement filterPeriod;
	
	@FindBy(id="this-month")
	WebElement filterPeriodThisMonth;
	
	@FindBy(id="last-month")
	WebElement filterPeriodLastMonth;
	
	@FindBy (id="reset-dates")
	WebElement filterPeriodResetDates;
	
	@FindBy(id="filter-reset")
	WebElement filterReset;
	
	@FindBy(id="add-new-invoice")
	WebElement addNewInvoice;
	
	@FindBy(id="context-356")
	WebElement threeStops;
	
	@FindBy(id="context-edit-356")
	WebElement editInvoice;
	
	@FindBy(id="context-preview-356")
	WebElement previewInvoice;
	
	@FindBy(id="context-delete-356")
	WebElement deleteInvoice;
	
	@FindBy(xpath="//*[text()[contains(.,'Preview Invoice')]]")
	WebElement preview;
	
	@FindBy(xpath="//*[text()[contains(.,'close')]]")
	WebElement closeBtnOnPreview;
	
	
	
	

	public InvoicesPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean userID() {
		wait.until(ExpectedConditions.visibilityOf(userID));
		return userID.isDisplayed();
		
	}
	
	public void filterClient() {
		wait.until(ExpectedConditions.visibilityOf(filterClient));
		filterClient.click();
		
	}
	
	public void filterFrom() {
		wait.until(ExpectedConditions.elementToBeClickable(filterFrom));
		
		filterFrom.click();
		
	}
	
	public void filterTo() {
		wait.until(ExpectedConditions.visibilityOf(filterTo));
		
		filterTo.click();
		
	}
	
	public void filterPeriod() {
		wait.until(ExpectedConditions.visibilityOf(filterPeriod));
		
		filterPeriod.click();
		
	}
	
	public void filterPeriodThisMonth() {
		wait.until(ExpectedConditions.visibilityOf(filterPeriodThisMonth));
		
		filterPeriodThisMonth.click();
		
	}
	
	public void filterPeriodLastMonth() {
		wait.until(ExpectedConditions.visibilityOf(filterPeriodLastMonth));
		
		filterPeriodLastMonth.click();
		
	}
	
	public void filterPeriodResetDates() {
		wait.until(ExpectedConditions.visibilityOf(filterPeriodResetDates));
		
		filterPeriodResetDates.click();
		
	}
	
	public void filterPeriodReset() {
		wait.until(ExpectedConditions.visibilityOf(filterReset));
		
		filterReset.click();
		
	}
	
	public void addNewInvoice() {
		
		wait.until(ExpectedConditions.elementToBeClickable(addNewInvoice));
//		
//		addNewInvoice.click();
		
		Action clickOnAddNew = builder
				.moveToElement(addNewInvoice)
				.click()
				.build();
		
		clickOnAddNew.perform();
		
	}
	
	public void threeStops() {
		wait.until(ExpectedConditions.elementToBeClickable(threeStops));
		
		threeStops.click();
		
	}
	
	public void editInvoice() {
		wait.until(ExpectedConditions.elementToBeClickable(editInvoice));
		
		editInvoice.click();
		
	}
	
	public void previewInvoice() {
		wait.until(ExpectedConditions.elementToBeClickable(previewInvoice));
		
		previewInvoice.click();
		
	}
	
	public void deleteInvoice() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteInvoice));
		
		deleteInvoice.click();
		
	}
	
	public void closePreview() {
		wait.until(ExpectedConditions.elementToBeClickable(closeBtnOnPreview));
		
		preview.isDisplayed();
		
		closeBtnOnPreview.click();
		
	}
	


}
