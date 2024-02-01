package com.limeroad_Defect_Busters.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageImpl implements ProductPage {
	
public WebDriver driver;
	
	@FindBy(xpath = click_on_men_xpath)
	private WebElement element;
	
	
	@FindBy(xpath = click_on_category_xpath)
    private WebElement men;
	
	@FindBy(xpath = click_on_jeans_xpath)
	private WebElement jeans;
	
	@FindBy(xpath = click_on_high_xpath)
	private WebElement high;
	
	@FindBy(xpath = click_on_pant_xpath)
	private WebElement pant;
	
	@FindBy(xpath = click_on_size_xpath)
	private WebElement size;
	
	@FindBy(xpath = click_on_cart_xpath)
	private WebElement cart;
	

	public ProductPageImpl(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getElement() {
		return element;
	}

	public WebElement getMen() {
		return men;
	}

	public WebElement getJeans() {
		return jeans;
	}

	public WebElement getHigh() {
		return high;
	}

	public WebElement getPant() {
		return pant;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getCart() {
		return cart;
	}


}
