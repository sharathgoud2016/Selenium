package com.cimb.rma.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerInfoPage extends BasePage {

	/***************** PERSONAL DETAILS ******************/
	@FindBy(id = "name_personal_details")
	private WebElement txtFullName;

	@FindBy(id = "salutation_checkbox_personal_details-input")
	private WebElement chkboxSalutation;

	@FindBy(id = "salutation")
	private WebElement txtSalutation;

	@FindBy(css = "span.mat-option-text")
	private List<WebElement> dropDownSalutation;

	@FindBy(id = "nric_personal_details")
	private WebElement txtNric;

	@FindBy(id = "landing_page_email")
	private WebElement txtEmail;

	@FindBy(id = "address_line1_permanentAddress_personal_details")
	private WebElement txtAddr1;

	@FindBy(id = "address_line2_permanentAddress_personal_details")
	private WebElement txtAddr2;

	@FindBy(id = "address_line3_permanentAddress_personal_details")
	private WebElement txtAddr3;

	@FindBy(id = "city_permanentAddress_personal_details")
	private WebElement txtCity;

	@FindBy(id = "postcode_permanentAddress_personal_details")
	private WebElement txtPostcode;

	@FindBy(id = "state_permanentAddress_personal_details")
	private WebElement txtState;

	@FindBy(css = "div#state_permanentAddress_personal_details-panel span")
	private List<WebElement> dropDownState;

	@FindBy(css = "mat-slide-toggle.mat-slide-toggle")
	private WebElement mailingType;

	@FindBy(id = "countryOfBirth_personal_details")
	private WebElement txtCountryOfBirth;

	@FindBy(css = "div#countryOfBirth_personal_details-panel span")
	private List<WebElement> countryOfBirth;

	@FindBy(css = "div.race-status input")
	private List<WebElement> race;

	@FindBy(css = "div.marital-status input")
	private List<WebElement> maritalStatus;

	@FindBy(id = "submit_personal_details")
	private WebElement btnPersonalContinue;

	@FindBy(css = "div span.nric-error")
	private WebElement errorMsg;

	/**************** POP UPS **************************/
	@FindBy(css = "button#button-primary")
	private WebElement btnClosePopUp;

	@FindBy(css = "mat-dialog-container[role='dialog'] h3")
	private WebElement popUpDialogHeader;

	@FindBy(css = "mat-dialog-container[role='dialog'] p")
	private WebElement popUpDialogContent;

	@FindBy(css = "div.toast-message")
	private WebElement toastMsg;

	@FindBy(css = "img[alt='close-icon']")
	private WebElement toastMsgClose;

	/*********************************
	 * CONSTANTS
	 ************************************/

	public static final String OPTIONS_SAME_PERMANENT_ADDRESS = "Same as Permanent Address";
	public static final String OPTIONS_DIFF_PERMANENT_ADDRESS = "Not same as Permanent Address";

	public static final String MSG_SAVE_PERSONAL = "Personal Details added successfully";
	public static final String MSG_SAVE_EMPLOYMENT = "Employment Details added successfully";
	public static final String MSG_SAVE_ADDITIONAL = "Additional Details added successfully";

	public static final String HEADER_APPLICATION_UNSUCCESSFUL = "Application unsuccessful";
	public static final String CONTENT_APPLICATION_UNSUCCESSFUL = "We are unable to process your application online. Thank you for your interest in the product!";

	public static final String NRIC_INVALID = "Please enter a valid NRIC number";
	public static final String NRIC_AGE_VALIDATION = "Your age doesn't meet the requirement. This service is available for individuals aged between 18 and 99 years old";

	public AddCustomerInfoPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/******** Toast Message ********/
	public boolean isToastMsgPresent() {
		return isElementPresent(toastMsg);
	}

	public void waitUntilToastMsgInvisible() {
		waitUntilElementIsInvisible(toastMsg, 8);
	}

	public void closeToastMsg() {
		click(toastMsgClose);
		waitUntilToastMsgInvisible();
	}

	public String getToastMessage() {
		return toastMsg.getText();
	}

	/******************* Personal Details **********************/
	public void enterPersonalDetails(String fullName, String nric, String email, String houseNum, String buildingName,
			String city, String postcode, String state, String mailingType) {

		enterValue(txtFullName, fullName);
		enterNRIC(nric);
		enterValue(txtEmail, email);

		selectValueByRandom(this.race);
		selectValueByRandom(this.maritalStatus);

		// disable for wave 4.1, will be enabled in wave 4.2
		// txtCountryOfBirth.click();
		// selectValueByText("MALAYSIA");

		txtAddr1.sendKeys(houseNum);
		txtAddr2.sendKeys(buildingName);
		// txtAddr3
		txtCity.sendKeys(city);
		txtPostcode.sendKeys(postcode);

		txtState.click();
		selectValueByTextAndClass(state, "mat-option-text");

		if (mailingType.equals(OPTIONS_SAME_PERMANENT_ADDRESS))
			click(this.mailingType);

	}

	public void enterNRIC(String nric) {
		waitUntilElementIsClickable(txtNric, 35);
		txtNric.clear();
		txtNric.sendKeys(nric);
		txtNric.sendKeys(Keys.ENTER);
	}

	public void savePersonalDetails() {
		click(btnPersonalContinue);
	}

	/************************* Pop Up *****************************/

	public String getPopUpHeader() {
		return getTextMessage(popUpDialogHeader, 30);
	}

	public String getPopUpContent() {
		return getTextMessage(popUpDialogContent, 30);
	}

	public void closePopUp() {
		click(btnClosePopUp);
	}
}
