package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Commonutils_trello;

public class trello_pagefactory extends Commonutils_trello {

	public trello_pagefactory() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user")
	private WebElement username;

	public WebElement getusername() {

		return username;
	}

	@FindBy(xpath = "//input[@class='button account-button button-green btn btn-success']")
	private WebElement Continue;

	public WebElement Continue() {

		return Continue;
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	public WebElement getpassword() {

		return password;
	}

	@FindBy(id = "login-submit")
	private WebElement login;

	public WebElement login() {

		return login;
	}

	@FindBy(xpath = "//li[@class='boards-page-board-section-list-item']")
	private WebElement newboard;

	public WebElement Newboard() {

		return newboard;
	}

	@FindBy(xpath = "//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")
	private WebElement boardtitle;

	public WebElement Boardtitle() {

		return boardtitle;
	}

	@FindBy(xpath = "//button[text()='Create']")
	private WebElement create;

	public WebElement Create() {

		return create;
	}

	@FindBy(xpath = "//span[text()='Add another list']")
	private WebElement addlist;

	public WebElement getAddlist() {

		return addlist;
	}

	@FindBy(xpath = "//input[@class='list-name-input']")
	private WebElement firstlist;

	public WebElement getFirstlist() {

		return firstlist;
	}

	@FindBy(xpath = "//input[@value='Add list']")
	private WebElement submit;

	public WebElement ClickSubmit() {

		return submit;
	}

	@FindBy(xpath = "//input[@class='list-name-input']")
	private WebElement seclist;

	public WebElement getseclist() {

		return seclist;
	}

	@FindBy(xpath = "(//div[@class='list js-list-content'])[5]")
	private WebElement dragA;

	public WebElement DragA() {

		return dragA;
	}

	@FindBy(xpath = "(//div[@class='list js-list-content'])[4]")
	private WebElement dragB;

	public WebElement DragB() {

		return dragB;
	}

}
