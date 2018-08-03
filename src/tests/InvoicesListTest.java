package tests;

import org.testng.annotations.Test;

import pages.InvoicesPage;

public class InvoicesListTest extends InitTest{
	
	@Test(priority = 15)
	public void userID(){
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.userID();
	
		
	}
	
	
//	@Test(priority = 16)
//	public void proba() {
//	//LoginPage login = new LoginPage(driver);
//	InvoicesPage invoice = new InvoicesPage(driver);
//
//	invoice.filterClient();
//	}
	
	@Test(priority = 17)
	public void dateFrom(){
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.filterFrom();
	
		
	}
	
	@Test(priority = 18)
	public void dateTo() {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.filterTo();
	
	}
	
	@Test(priority = 19)
	public void thisMonth() {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.filterPeriod();
		invoice.filterPeriodThisMonth();
	
		
	}
	
	@Test(priority = 20)
	public void lastMonth() {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.filterPeriod();
		invoice.filterPeriodLastMonth();


	}
	


	@Test(priority = 21)
	public void resetMonth() {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.filterPeriod();
		invoice.filterPeriodResetDates();
	
		
	}
	
	@Test(priority = 22)
	public void resetInvoices() {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.filterPeriod();
		invoice.filterPeriodReset();
	
		
	}
	

	
//	@Test(priority = 24)
//	public void editInvoice() throws InterruptedException {
//		InvoicesPage invoice = new InvoicesPage(driver);
//		
//		invoice.threeStops();
//		invoice.editInvoice();
//		
//		Thread.sleep(5000);
//	
//		
//	}
	
	@Test(priority = 23)
	public void previewInvoice() {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.threeStops();
		invoice.previewInvoice();
		invoice.closePreview();
	
		
	}
	
	
	@Test(priority = 25)
	public void addNewInvoice() {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.addNewInvoice();
	
		
	}
}
