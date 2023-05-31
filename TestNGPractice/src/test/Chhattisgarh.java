package test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Chhattisgarh {
	@BeforeClass
	public void welcomeCG(){
		Reporter.log("\nWelcome to chhattisgarh.\n",true);
	}
	@AfterClass
	public void byeCG(){
		Reporter.log("\nCome again to chhattisgarh.\n",true);
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
	public void durg() {
		Reporter.log("I am from durg.",true);
	}
	@Test
	public void raipur() {
		Reporter.log("I am from raipur.",true);
	}
	@Test
	public void rj() {
		Reporter.log("I am from rajnandgao.",true);
	}
	@Test
	public void dhamtari() {
		Reporter.log("I am from dhamtari.",true);
	}
	@Test
	public void korba() {
		Reporter.log("I am from korba.",true);
	}
}
