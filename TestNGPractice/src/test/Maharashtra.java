package test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Maharashtra {
	@BeforeClass
	public void welcomeMH(){
		Reporter.log("\nWelcome to Maharashtra.\n",true);
	}
	@AfterClass
	public void byeMH(){
		Reporter.log("\nCome again to Maharashtra.\n",true);
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
	public void mumbai() {
		Reporter.log("I am from mumbai.",true);
	}
	@Test
	public void nagpur() {
		Reporter.log("I am from nagpur.",true);
	}
	@Test
	public void vidarbh() {
		Reporter.log("I am from vidarbh.",true);
	}
	@Test
	public void nasik() {
		Reporter.log("I am from nasik.",true);
	}
	@Test
	public void pune() {
		Reporter.log("I am from pune.",true);
	}
}
