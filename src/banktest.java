import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;


public class banktest {
	bankcvc mufasa;
	
	@Before
	public void setup(){
		mufasa = new bankcvc();
	}
	
	@Test
	public void testwithdraw() {
		mufasa.withdraw(0.01, 111);
		assertEquals(49.99, mufasa.getMoney(),0.00);
	}
	
	@Test
	public void testdeposit() {
		mufasa.withdraw(0.01, 111);
		mufasa.deposit(0.01);
		assertEquals(50.00, mufasa.getMoney(),0.00);
	}
	
	@Test
	public void testname() {
		AccountCheck ac= new AccountCheck();
		assertEquals(true, ac.checkname("clement"));
	}
	
	@Test
	public void testusername() {
		AccountCheck ac= new AccountCheck();
		assertEquals(true, ac.checkusername("clement6454"));
	}
	
	@Test
	public void testpassword() {
		AccountCheck ac= new AccountCheck();
		assertEquals(true, ac.checkpassword("azertyuiop"));
	}
	
	@Test
	public void testpassword2() {
		AccountCheck ac= new AccountCheck();
		assertEquals(true, ac.checksamepassword("azertyuiop","azertyuiop"));
	}
	
	@Test
	public void testdate() {
		AccountCheck ac= new AccountCheck();
		assertEquals(true, ac.checkdate("16/05/1997"));
	}
	
	@Test
	public void testcity() {
		AccountCheck ac= new AccountCheck();
		assertEquals(true, ac.checkcity("nancy"));
	}
	
	@Test
	public void testStreetAdress() {
		AccountCheck ac= new AccountCheck();
		assertEquals(true, ac.checkStreetadress("9ruedelameurthe"));
	}
	
	@Test
	public void testcountry() {
		AccountCheck ac= new AccountCheck();
		assertEquals(true, ac.checkcountry("france"));
	}
	
}
