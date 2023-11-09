package com.cimb.rma.constant;

public enum LandingPage {
	PRODUCT_PAGE("RMA_SIT", "https://{env}.com/login"),
	RESUME_APPLICATION("Resume Application",
			"https://{env}.apps.tcteam.tech/api/sso/login"),
	ONBOARD("Onboard App", "https://{env}.apps.tcteam.tech/api/sso/login");

	private String partialUrl;
	private String pageName;

	LandingPage(String pageName, String partialUrl) {
		this.pageName = pageName;
		this.partialUrl = partialUrl;
	}

	public String getPartialUrl() {
		return partialUrl;
	}

	public String getPageName() {
		return pageName;
	}

}
