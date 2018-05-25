package Rep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inspect extends Brows{
	
	//User Registration credentials
	
	static By signup=By.xpath("/html/body/nav/div[1]/div[2]/ul/li[2]/a");
	static By Fullname=By.name("name");
	static By Fathername=By.name("fathername");
	static By Dateofbirth=By.name("dateofbirth");
	static By Phone=By.name("phone");
	static By Address=By.name("address");
	static By City=By.name("city");
	static By Zipcode=By.name("zipcode");
	static By Technolgy=By.name("technology");
	static By College=By.name("college");
	static By Email=By.name("email");
	static By Password=By.name("password");
	static By Confirmpassword=By.name("confirmPassword");
	static By Register=By.cssSelector("#reg_form > fieldset:nth-child(4) > div:nth-child(4) > div > button.btn.btn-lg.btn-success");
	static By Reset=By.xpath("//*[@id=\"reg_form\"]/fieldset[2]/div[4]/div/button[2]");
	
	
	//Sign in Credentialss
	
	static By signin=By.xpath("/html/body/nav/div[1]/div[2]/ul/li[1]/a");
	static By email=By.name("email");
	static By password=By.name("password");
	static By signinclick=By.xpath("//*[@id=\"myModal2\"]/div/div/div/div/div[1]/form/div/input");
	
	//Sign in home credentials
	
	static By Home=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a/span");
	static By Profilex=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a/span");
	static By Exam=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a/span");
	static By Contact=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a/span");
	static By Myprofile=By.xpath("/html/body/nav/div[1]/div[2]/ul/li[1]/a");
	static By signout=By.xpath("/html/body/nav/div[1]/div[2]/ul/li[2]/a");
	static By Signoutex=By.xpath("//*[@id=\"myModal2\"]/div/div/div/div[1]/div/form/input");
	
	//Profile updation Credentials
	
	static By Profile=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a/span");
	static By NAME=By.name("name");
	static By FNAME=By.name("fathername");
	static By DOB=By.name("dateofbirth");
	static By PHONENO=By.name("phone");
	static By ADDRESS=By.name("address");
	static By CITY=By.name("city");
	static By ZIPCODE=By.name("zipcode");	
	static By TECHNOLOGY=By.name("state");
	static By COLLEGE=By.name("college");
	static By EMAIL=By.name("email");
	static By PASSWORD=By.name("password");
	static By CONFIRMPASSWORD=By.name("confirmPassword");
	static By Update=By.xpath("//*[@id=\"reg_form\"]/fieldset[2]/div[4]/div/button[1]");
	static By Resetex=By.xpath("//*[@id=\"reg_form\"]/fieldset[2]/div[4]/div/button[2]");
	

	// User Registration credentials
	
	public static WebElement Signup()
	{
		return driver.findElement(signup);
	}
	public static WebElement fullname()
	{
		return driver.findElement(Fullname);
	}
	public static WebElement fathername()
	{
	return driver.findElement(Fathername);
	
	}
	public static WebElement phone()
	{
	return driver.findElement(Phone);
	
	}
	public static WebElement dateofbirth()
	{
		return driver.findElement(Dateofbirth);
	}
	public static WebElement address()
	{
	return driver.findElement(Address);
	}
	public static WebElement city()
	{
		return driver.findElement(City);
	}
	public static WebElement zipcode()
	{
	return driver.findElement(Zipcode);
	
	}
	public static WebElement technology()
	{
		return driver.findElement(Technolgy);
	}
	public static WebElement college()
	{
	return driver.findElement(College);
	}
	public static WebElement email()
	{
	return driver.findElement(Email);
	}
	public static WebElement password()
	{
		return driver.findElement(Password);
	}
	public static WebElement confirmPassword()
	{
	return driver.findElement(Confirmpassword);
		
	}
	public static WebElement register()
	{
		return driver.findElement(Register);
	}
	public static WebElement reset()
	{
	return driver.findElement(Reset);
		
	}

	//User Sign in credentials
	
	public static WebElement Signin()
	{
		return driver.findElement(signin);
	}
	public static WebElement emailex()
	{
		return driver.findElement(email);
	}
	public static WebElement passwordex()
	{
		return driver.findElement(password);
	}
	public static WebElement signinclicks()
	{
		return driver.findElement(signinclick);
	}
	
	
	// Sign in home credentials
	
	public static WebElement home()
	{
	return driver.findElement(Home);
	
	}
	public static WebElement Profilex()
	{
		return driver.findElement(Profilex);
	}
	public static WebElement Examex()
	{
	return driver.findElement(Exam);
	}
	public static WebElement Contactex()
	{
	return driver.findElement(Contact);
	}
	public static WebElement Myprofilex()
	{
		return driver.findElement(Myprofile);
	}
	public static WebElement Signout()
	{
	return driver.findElement(signout);
	}
	public static WebElement Signoutex()
	{
	return driver.findElement(Signoutex);
	}
	
	//Profile updation credentials
	
	public static WebElement profile()
	{
		return driver.findElement(Profile);
	}
	public static WebElement name()
	{
		return driver.findElement(NAME);
	}
	public static WebElement Fname()
	{
	return driver.findElement(FNAME);
	
	}
	public static WebElement dob()
	{
	return driver.findElement(DOB);
	
	}
	public static WebElement phoneno()
	{
		return driver.findElement(PHONENO);
	}
	public static WebElement addressex()
	{
	return driver.findElement(ADDRESS);
	}
	public static WebElement cityex()
	{
		return driver.findElement(CITY);
	}
	public static WebElement zipcodeex()
	{
	return driver.findElement(ZIPCODE);
	
	}
	public static WebElement technologyex()
	{
		return driver.findElement(TECHNOLOGY);
	}
	public static WebElement collegeex()
	{
	return driver.findElement(COLLEGE);
	}
	public static WebElement emailex1()
	{
	return driver.findElement(EMAIL);
	}
	public static WebElement passwordex1()
	{
		return driver.findElement(PASSWORD);
	}
	public static WebElement confirmPasswordex()
	{
	return driver.findElement(CONFIRMPASSWORD);
	}
	public static WebElement UPDATE()
	{
		return driver.findElement(Update);
	}
	public static WebElement RESETEX()
	{
	return driver.findElement(Resetex);
	}
	

	}

	
	
	

