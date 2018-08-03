package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddNewInvoicePage;
import pages.InvoicesPage;
import pages.LoginPage;
import pages.Util;



public class LoginTest extends InitTest{
 
//@Test(priority = 0)
//  public void blank() {
//	LoginPage login = new LoginPage(driver);
//	
//	driver.get(Util.URL);
//	
//	
//	
//	login.fillInputs("", "");
//	login.sbumit();
//	Assert.assertTrue(login.errorMsgEmail());
//  }
//
//	@Test(priority = 1)
//	public void noPass() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs(Util.email, "");
//	login.sbumit();
//	Assert.assertTrue(login.errorMsgPass());
//}
//
//	@Test(priority = 2)
//	public void noEmail() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs("", Util.password);
//	login.sbumit();
//	Assert.assertTrue(login.errorMsgEmail());
//}
//	
//	@Test(priority = 3)
//	public void wrongEmailCorrectPass() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs("nesto@nesto.com", Util.password);
//	login.sbumit();
//	Assert.assertTrue(login.errorMsgLoginPass());
//}
//	
//	@Test(priority = 4)
//	public void correctEmailWrongPass() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs(Util.email, "123456789");
//	login.sbumit();
//	Assert.assertTrue(login.errorMsgLoginPass());
//}
//	
//	@Test(priority = 5)
//	public void emailWith2Monkeys() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs("nenad.b.krstic@@gmail.com", Util.password);
//	login.sbumit();
//	Assert.assertTrue(login.msgInvalidEmail());
//}
//	
//	@Test(priority = 6)
//	public void emailWithComma() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs("nenad.b.krstic@gmail,com", Util.password);
//	login.sbumit();
//	Assert.assertTrue(login.msgInvalidEmail());
//}
//	
//	@Test(priority = 7)
//	public void emailWith2Stops() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs("nenad.b.krstic@gmail..com", Util.password);
//	login.sbumit();
//	Assert.assertTrue(login.msgInvalidEmail());
//}
//	
//	@Test(priority = 8)
//	public void emailPasswordPasswordEmail() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs(Util.password, Util.email);
//	login.sbumit();
//	Assert.assertTrue(login.msgInvalidEmail());
//	Assert.assertTrue(login.msgTooMuchChar());
//}
//	
//	@Test(priority = 9)
//	public void correctEmailPasswordEmail() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs(Util.email, Util.email);
//	login.sbumit();
//	Assert.assertTrue(login.msgTooMuchChar());
//}
//	
//	@Test(priority = 10)
//	public void emailPasswordCorrectPassword() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs(Util.password, Util.password);
//	login.sbumit();
//	Assert.assertTrue(login.msgInvalidEmail());
//}
//
////	@Test(priority = 11)
////	public void uppercaseEmailLowercasePassword() {
////	LoginPage login = new LoginPage(driver);
////	driver.get(Util.URL);
////
////	
////	login.fillInputs("NENAD.B.KRSTIC@GMAIL.COM", Util.password);
////	login.sbumit();
////	//Assert.assertTrue(login.tooMuchChar());
////}
//	
//	@Test(priority = 11)
//	public void lowercaseEmailUppercasePassword() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs(Util.email, "QWE123");
//	login.sbumit();
//	Assert.assertTrue(login.errorMsgLoginPass());
//}
//	
//	@Test(priority = 12)
//	public void uppercaseEmailUppercasePassword() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs("NENAD.B.KRSTIC@GMAIL.COM", "QWE123");
//	login.sbumit();
//	Assert.assertTrue(login.errorMsgLoginPass());
//}
//	
//	@Test(priority = 13)
//	public void correctEmailPasswordWith5Character() {
//	LoginPage login = new LoginPage(driver);
//	driver.get(Util.URL);
//
//	
//	login.fillInputs(Util.email, "qwe12");
//	login.sbumit();
//	Assert.assertTrue(login.msgLessThanSixCharInPass());
//}
	
	@Test(priority = 14)
	public void correctEmailCorrectPassword() {
	LoginPage login = new LoginPage(driver);
	driver.get(Util.URL);

	
	login.fillInputs(Util.email, Util.password);
	login.visiblePass();
	login.sbumit();
	//Assert.assertTrue(login.errorLoginPass());
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	@Test(priority = 23)
	public void addNewInvoice() throws InterruptedException {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.addNewInvoice();
	
		Thread.sleep(5000);
	}
	
	@Test(priority = 24)
	public void previewInvoice() {
		InvoicesPage invoice = new InvoicesPage(driver);
		
		invoice.threeStops();
		invoice.previewInvoice();
	
		invoice.closePreview();
	
		
	}
	


	

	

	
}
