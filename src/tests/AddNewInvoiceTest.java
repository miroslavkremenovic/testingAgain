package tests;

import org.testng.annotations.Test;

import pages.AddNewInvoicePage;
import pages.InvoicesPage;
import pages.Util;

public class AddNewInvoiceTest extends InitTest{

	
	
	@Test(priority = 26)
	public void NewInvoicePage() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);
		
		addNewInvoice.checkAddNewInvoices();
		
		addNewInvoice.enterTitle(Util.proba);
	
		
	}
}
