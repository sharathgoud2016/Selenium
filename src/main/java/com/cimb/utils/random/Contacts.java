package com.cimb.utils.random;

import static org.apache.commons.lang3.StringUtils.join;

public class Contacts {

	private String[] serviceProviderCode = { "10", "11", "12", "13", "14", "16", "17", "18" };
	private String[] emailDomain = { "gmail.com", "yahoo.com", "hotmail.com", "abc.co", "mybiz.biz", "test.info" };

	private final Leads lead;
	private String mobileNumber;
	private String mobileCode;

	protected Contacts(Leads lead) {
		this.lead = lead;
		this.mobileNumber = "";
		this.mobileCode = "";
	}

	public String mobileNumber() {
		generateMobileNumber();

		return join(mobileCode, mobileNumber);
	}

	public String email(String username) {
		int index = lead.random().getRandomIndex(emailDomain.length);
		String email = join(username, "@", emailDomain[index]);

		return email.replace("/", "");
	}

	public String getFullMobileNumberWithDash() {
		if (mobileCode.isEmpty() || mobileNumber.isEmpty())
			generateMobileNumber();

		return join("0", mobileCode, "-", mobileNumber);
	}

	private void generateMobileNumber() {
		mobileCode = lead.random().getRandomValue(serviceProviderCode);

		if (mobileCode == "11")
			mobileNumber = Integer.toString(lead.random().generateRandomNumber(8));
		else
			mobileNumber = Integer.toString(lead.random().generateRandomNumber(7));
	}

}
