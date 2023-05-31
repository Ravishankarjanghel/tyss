package test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Andhrapradesh {
	@BeforeClass
	public void welcomeAP(){
		Reporter.log("\nWelcome to Andhrapradesh.\n",true);
	}
	@AfterClass
	public void byeAP(){
		Reporter.log("\nCome again to Andhrapradesh.\n",true);
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
	public void vizianagaram() {
		Reporter.log("I am from vizianagaram.",true);
	}
	@Test
	public void visakhapatnam() {
		Reporter.log("I am from visakhapatnam.",true);
	}
	@Test
	public void guntur() {
		Reporter.log("I am from guntur.",true);
	}
	@Test
	public void kurnool() {
		Reporter.log("I am from kurnool.",true);
	}
	@Test
	public void tirupati() {
		Reporter.log("I am from tirupati.",true);
	}
}
