package execution;

import Baseclass.Commonutils_trello;
import PageFactory.trello_pagefactory;

public class Login_Trello extends Commonutils_trello{
	
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		Url("https://trello.com/en/login");
		maximize();
		
		trello_pagefactory page = new trello_pagefactory();
		
		implicitWait();
		
		sendKeys(page.getusername(),"thansari73@gmail.com");
		elementClick(page.Continue());
		threadSleep();
		sendKeys(page.getpassword(),"Ansarirabik@96");
		elementClick(page.login());	
		elementClick(page.Newboard());
		sendKeys(page.Boardtitle(), "Drag and Drop");
		elementClick(page.Create());
		elementClick(page.getAddlist());
		sendKeys(page.getFirstlist(), "List A");	            
		elementClick(page.ClickSubmit());
		implicitWait();              
		sendKeys(page.getseclist(), "List B");
		elementClick(page.ClickSubmit());
		  drag(page.DragB(), page.DragA());
		
	}

}
