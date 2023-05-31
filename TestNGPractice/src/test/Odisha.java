package test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Odisha {
	@BeforeClass
	public void welcomeOR(){
		Reporter.log("\nWelcome to Odisha.\n",true);
	}
	@AfterClass
	public void byeOR(){
		Reporter.log("\nCome again to Odisha.\n",true);
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
	public void bhuwaneshwar() {
		Reporter.log("I am from bhuwaneshwar.",true);
	}
	@Test
	public void katak() {
		Reporter.log("I am from katak.",true);
	}
	@Test
	public void sambalpur() {
		Reporter.log("I am from sambalpur.",true);
	}
	@Test
	public void balangir() {
		Reporter.log("I am from balangir.",true);
	}
	@Test
	public void kalinga() {
		Reporter.log("I am from kalinga.",true);
	}
}
