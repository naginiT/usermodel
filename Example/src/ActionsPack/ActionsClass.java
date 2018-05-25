package ActionsPack;


import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Rep.Inspect;

import Utilities.ExcelData;

public class ActionsClass extends ExcelData {
	
	
	static String s;
	static int i=1;
	public static void Register() throws Exception
	{
		//user registration credentials
		Inspect.Signup().click();
           
		ExcelData.Code("TestData for Registration page", "C:\\Users\\NAGESHWARI\\Desktop\\BookStoreSummary.xlsx");

		for(int i=1;i<=Sheet.getLastRowNum();i++)
        {
           	
        cell=Sheet.getRow(i).getCell(0);
		
        s=ExcelData.RowColumn1(i,1);
		Thread.sleep(3000);
		Inspect.fullname().sendKeys(s);
		s=ExcelData.RowColumn1(i,2);
		Thread.sleep(3000);
		Inspect.fathername().sendKeys(s);
		
		s=ExcelData.RowColumn1(i,3);
		Thread.sleep(3000);
		Inspect.dateofbirth().sendKeys(s);
		
		s=ExcelData.RowColumn1(i,4);
		Thread.sleep(3000);
		Inspect.phone().sendKeys(s);
		
		
		s=ExcelData.RowColumn1(i,5);
		Thread.sleep(3000);
		Inspect.address().sendKeys(s);
		
		s=ExcelData.RowColumn1(i,6);
		Thread.sleep(3000);
		Inspect.city().sendKeys(s);
		
		
		s=ExcelData.RowColumn1(i,7);
		Thread.sleep(3000);
		Inspect.zipcode().sendKeys(s);
		
		
		Select sel=new Select(Inspect.technology());
		sel.selectByVisibleText("Java");
		
		s=ExcelData.RowColumn1(i,9);
		Thread.sleep(3000);
		Inspect.college().sendKeys(s);
		
		s=ExcelData.RowColumn1(i,10);
		Thread.sleep(3000);
		Inspect.email().sendKeys(s);
		
		s=ExcelData.RowColumn1(i,11);
		Thread.sleep(3000);
		Inspect.password().sendKeys(s);
		
		s=ExcelData.RowColumn1(i,12);
		Thread.sleep(3000);
		Inspect.confirmPassword().sendKeys(s);
		Thread.sleep(3000);
		//Inspect.reset().click();
		Inspect.register().click();
      
	Screen sc=new Screen();
	Pattern p=new Pattern("C:\\Users\\NAGESHWARI\\Desktop\\cffdtdr.PNG");
	Thread.sleep(3000);
	sc.click(p);	
	}
	}
	//User sign in credentials
	
	public static void Signin() throws Exception
	{
	Inspect.Signin().click();
	ExcelData.Code(" Test Data for USER LOGIN", "C:\\Users\\NAGESHWARI\\Desktop\\BookStoreSummary.xlsx");
	s=ExcelData.RowColumn1(1,1);
	Thread.sleep(3000);
	Inspect.emailex().sendKeys(s);
	s=ExcelData.RowColumn1(1,2);
	Thread.sleep(3000);
	Inspect.passwordex().sendKeys(s);
	Thread.sleep(3000);
	Inspect.signinclicks().click();
	}
	
	//Sign in home page Credentials
	
	
	public static void Home() throws Exception
	{
		Inspect.home().click();
		Thread.sleep(8000);
		Inspect.Profilex().click();
		Thread.sleep(3000);
		Inspect.Examex().click();
		Thread.sleep(3000);
		Inspect.Contactex().click();
		Thread.sleep(3000);
		Inspect.Myprofilex().click();
		Thread.sleep(3000);
	//	Inspect.Signout().click();
		Thread.sleep(3000);
	//	Inspect.Signoutex().click();
	}	
	
	
	//Profile updation credentials
	
		public static void profileupdation() throws Exception
		{
			for(int i=1;i<=Sheet.getLastRowNum();i++)
	        {
	           	
	        cell=Sheet.getRow(i).getCell(0);
			
			
		Inspect.profile().click();
		ExcelData.Code("Test Data for Profile Updation", "C:\\Users\\NAGESHWARI\\Desktop\\BookStoreSummary.xlsx");
		Inspect.name().clear();
		s=ExcelData.RowColumn1(i,3);
		Thread.sleep(3000);
		Inspect.name().sendKeys(s);
		
		Inspect.Fname().clear();
		s=ExcelData.RowColumn1(i,4);
		Thread.sleep(3000);
		Inspect.Fname().sendKeys(s);
		Thread.sleep(3000);
		
		/*Inspect.dob().clear();
		s=ExcelData.RowColumn1(i,5);
		Thread.sleep(3000);
		Inspect.dob().sendKeys(s);*/
		
		Inspect.phoneno().clear();
		s=ExcelData.RowColumn1(i,6);
		Thread.sleep(3000);
		Inspect.phoneno().sendKeys(s);
		
		Inspect.addressex().clear();
		s=ExcelData.RowColumn1(i,7);
		Thread.sleep(3000);
		Inspect.addressex().sendKeys(s);
		
		Inspect.zipcodeex().clear();
		s=ExcelData.RowColumn1(i,8);
		Thread.sleep(3000);
		Inspect.zipcodeex().sendKeys(s);
		
		
		/*Inspect.technologyex().clear();
		Select sel=new Select(Inspect.technologyex());
		sel.selectByVisibleText("Java");*/
		
		/*Inspect.technologyex().clear();
		s=ExcelData.RowColumn1(i,9);
		Thread.sleep(3000);
		Inspect.technologyex().sendKeys(s);*/
		
		Inspect.collegeex().clear();
		s=ExcelData.RowColumn1(i,10);
		Thread.sleep(3000);
		Inspect.collegeex().sendKeys(s);
	
		
		/*//Inspect.emailex1().clear();
		s=ExcelData.RowColumn1(i,11);
		Thread.sleep(3000);
		Inspect.emailex1().sendKeys(s);
		*/
		Inspect.passwordex1().clear();
		s=ExcelData.RowColumn1(i,12);
		Thread.sleep(3000);
		Inspect.passwordex1().sendKeys(s);
		
		Inspect.confirmPasswordex().clear();
		s=ExcelData.RowColumn1(i,13);
		Thread.sleep(3000);
		Inspect.confirmPasswordex().sendKeys(s);
		
		
		Inspect.UPDATE().click();
		Inspect.RESETEX().click();
}

		}

}

