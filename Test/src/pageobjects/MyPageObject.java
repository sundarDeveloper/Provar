package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="testcon"
     )             
public class MyPageObject {

	@PageRow()
	public static class AccountSelectionTable {
		@TextType()
		@FindBy(xpath = ".//td[1]//input")
		public WebElement RadioButton;
	}
	@PageTable(row = AccountSelectionTable.class,firstRowContainsHeaders = true)
	@FindBy(xpath = "//div/table[contains(@class,'cAccountsSelectionTable')]/tbody/tr")
	public List<AccountSelectionTable> AccountSelectionTableList;


	@TextType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//input[@id='input-137']")
	public WebElement MPN;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//button[normalize-space(.)='Next']")
	public WebElement next_button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//lightning-radio-group[1]//label[normalize-space(.)='Yes']/span[1]")
	public WebElement yes;
	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//select[@name='level1Field']")
	public WebElement levl1;
	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//select[@name='level2Field']")
	public WebElement levle2;
	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//select[@name='level3Field']")
	public WebElement levle3;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//input[@id='input-32']")
	public WebElement MPN1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//input[@id='input-100']")
	public WebElement MPN2;
	@PageRow()
	public static class Data {

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('lightning-input').shadowRoot.querySelectorAll('span')[2]")
		public WebElement SelectCustomer;
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.data']")
	@PageTable(firstRowContainsHeaders = false, row = Data.class)
	public List<Data> data;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//input[@id='input-40']")
	public WebElement MPN3;


	@TextType()
	@FindBy(xpath = "//input[@name='fieldMPN']")
	public WebElement MPN4;


	@TextType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//div/div/div/div/div/div/div[normalize-space(.)='UserID is/are required.']")
	public WebElement requireLabel;
			
}
