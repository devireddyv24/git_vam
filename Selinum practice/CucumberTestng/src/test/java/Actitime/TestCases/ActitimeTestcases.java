package Actitime.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Actitime.ActitimePage;
import Actitime.TestCases.properties.ActitimeDatafeatch;
import io.qameta.allure.Description;
@Listeners(Screenshots.Listnersclass.class)
public class ActitimeTestcases extends ActitimeBaseclass {
@Test(priority = 1)
public void User_Able_to_Entertext_in_username_textbox() throws IOException {
	
	//Verifying username text box is accept data

	act.getusername(ActitimeDatafeatch.data("uname"));
	AssertJUnit.assertTrue(true);
	
}
@Test(priority = 2)
public void user_able_to_enter_text_in_pswbox() throws IOException {
	//Verifying password text box is accept data
	act.password(ActitimeDatafeatch.data("psw"));
	AssertJUnit.assertTrue(true);

}
@Test(priority = 3)
public void Validate_login_btn() throws InterruptedException, IOException {
	
	//enter valid user name
	
	act.getusername(ActitimeDatafeatch.data("uname"));
	
	//enter valid password
	
	act.password(ActitimeDatafeatch.data("psw"));

	//Click the login button
	
act.getlogin_bt();
//Verifying Logout button is available or not
AssertJUnit.assertEquals(act.Logout_btn.getText(),"Logout");
System.out.println(act.Logout_btn.getText());
}
@Test(priority = 4)
public void validate_the_keppme_Logged_button() throws InterruptedException {
	//Verifying the keep me logged check box is selecting or not
	
	
	AssertJUnit.assertTrue(act.getKeep_me_login().isSelected());
	
	Thread.sleep(4000);
}
@Test(priority = 5)
public void validate_Login_with_click_enter() throws InterruptedException, IOException {
	
	//enter valid user name
	
	act.getusername(ActitimeDatafeatch.data("uname"));
	
	//Enter valid password and Click on Enter button
	
	act.getpassword(ActitimeDatafeatch.data("psw"));
	Thread.sleep(5000);
	//Verifying Logout button is available
	AssertJUnit.assertEquals(act.Logout_btn.getText(),"Logout");
}
@Test(priority = 6)
public void Validate_Login_logout_login_when_Click_on_Keepme_looged_checkbox() throws InterruptedException, IOException {
	//enter valid username
	act.getusername(ActitimeDatafeatch.data("uname"));
	//enter valid password
	act.password(ActitimeDatafeatch.data("psw"));
	//click on keep me logged check box
	act.getKeep_me_login();
	//click  on login button
	act.getlogin_bt();
	//Click on logout button
	Thread.sleep(3000);
	act.getLogout();
	//click on login button
	act.getlogin_bt();
	//Verifying logout link is available or not
	AssertJUnit.assertEquals(act.Logout_btn.getText(),"Logout");
	
}
@Test(priority = 7)
public void validate_multitime_login_logout() throws InterruptedException, IOException {
	//Login and logout 3 times 
	for(int i=0;i<4;i++) {
	act.Login_functionality(ActitimeDatafeatch.data("uname"),ActitimeDatafeatch.data("psw"));
	}
	
	
	
}
@Test(dataProvider = "ActitimeInvaliddata",priority = 8)
public void invalidusername(String username) throws InterruptedException, IOException {
	//enter in valid user name
	act.getusername(username);
	
	//enter valid password
	
	act.password(ActitimeDatafeatch.data("psw"));
	Thread.sleep(5000);
	//click on check box
	act.getKeep_me_login();
	//click on login button
	act.getlogin_bt();
	try {
		//verifying logout button is click or not
		act.getLogout();
		AssertJUnit.assertTrue(false);
	}
	catch (NoSuchElementException e) {
		// TODO: handle exception
		AssertJUnit.assertTrue(true);
	}
}
@Test(dataProvider = "ActitimeInvaliddata",priority = 9)
public void inValidPassword(String s) throws InterruptedException, IOException {
	
	//enter valid  user name
	System.out.println(s);
	act.getusername(ActitimeDatafeatch.data("uname"));
	//enter in valid password
	
	act.password(s);
	Thread.sleep(5000);
	//clcik on check box
	act.getKeep_me_login();
	//click on login button
	act.getlogin_bt();
	try {
		//click on logout button
		act.getLogout();
		AssertJUnit.assertTrue(false);
	}
	catch (NoSuchElementException e) {
		// TODO: handle exception
		AssertJUnit.assertTrue(false);
	}
}
@Test(priority = 10)
public void blankusername() throws InterruptedException, IOException {
	//enter valid password  and blank username
	
	act.password(ActitimeDatafeatch.data("psw"));
	Thread.sleep(5000);
	act.getKeep_me_login();
	act.getlogin_bt();
	try {
		act.getLogout();
		AssertJUnit.assertTrue(false);
	}
	catch (NoSuchElementException e) {
		// TODO: handle exception
		AssertJUnit.assertTrue(true);
	}
}
@Test(priority = 11)
public void blankpassword() throws InterruptedException, IOException {
	//enter valid username and blank password
	act.getusername(ActitimeDatafeatch.data("uname"));
	
	Thread.sleep(5000);
	act.getKeep_me_login();
	act.getlogin_bt();
	try {
		act.getLogout();
		AssertJUnit.assertTrue(false);
	}
	catch (NoSuchElementException e) {
		// TODO: handle exception
		AssertJUnit.assertTrue(true);
	}
}

}
