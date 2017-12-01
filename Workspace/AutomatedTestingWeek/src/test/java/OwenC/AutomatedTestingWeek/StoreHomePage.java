package OwenC.AutomatedTestingWeek;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class StoreHomePage {

	@FindBy(css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
	private WebElement cartButton;

	@FindBy(css = "#center_column > p")
	private WebElement cartContents;

	@FindBy(css = "#header_logo > a > img")
	private WebElement pageLogo;

	@FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img")
	private WebElement featuredItemOne;

	@FindBy(css = "#group_1")
	private WebElement sizeDropDown;

	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement loginButton;

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getCartContents() {
		return cartContents;
	}

	public WebElement getPageLogo() {
		return pageLogo;
	}

	public WebElement getFeaturedItemOne() {
		return featuredItemOne;
	}

	public WebElement getSizeDropDown() {
		return sizeDropDown;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
