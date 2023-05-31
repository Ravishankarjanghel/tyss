package test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Madhyapradesh {
	@BeforeClass
	public void welcomeMP(){
		Reporter.log("\nWelcome to Madhyapradesh.\n",true);
	}
	@AfterClass
	public void byeMP(){
		Reporter.log("\nCome again to Madhyapradesh.\n",true);
	}
	@BeforeMethod
	public void welcomeToDist(){
		Reporter.log("\nWelcome to our District.",true);
	}
	@AfterMethod
	public void byeDist(){
		Reporter.log("Come again to our District.\n",true);
	}
	@Test
	public void bhopal() {
		Reporter.log("I am from bhopal.",true);
	}
	@Test
	public void indore() {
		Reporter.log("I am from indore.",true);
	}
	@Test
	public void jabalpur() {
		Reporter.log("I am from jabalpur.",true);
	}
	@Test
	public void reva() {
		Reporter.log("I am from reva.",true);
	}
	@Test
	public void balaghat() {
		Reporter.log("I am from balaghat.",true);
	}
}
