package com.limeroad_Defect_Busters.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.limeroad_Defect_Busters.base.BaseClass;


	
	
	
	
	
	

public class LoginPageImpl extends BaseClass implements LoginPage{
	
	public LoginPageImpl() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[text()='SHOP MEN']")						//span[text()='SHOP MEN']
	private WebElement ShopMen;


    @FindBy(id = shop_women)
     private WebElement element;
    
    
    
}