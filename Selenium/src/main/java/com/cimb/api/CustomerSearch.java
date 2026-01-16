package com.cimb.api;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CustomerSearch {

	private String baseURI = "https://api-uat.cimb.com:8065";

	public CustomerSearch() {
		RestAssured.baseURI = this.baseURI;
	}

	public boolean isETB(String strNRICNumber) {
		boolean isETB = false;

		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.addParam("trnUID", "1628673923682");
		builder.addParam("clientUID", "TCJR_MY");
		builder.addParam("searchMode", "N");
		builder.addParam("isIndFlag", "Y");
		builder.addParam("idIssueCountry", "new%20IC");
		builder.addParam("govtIssueIdType", "MYS");
		builder.addParam("govtIssueIdSerialNo", strNRICNumber);

		builder.setContentType(ContentType.JSON);
		builder.addHeader("KeyId", "b999fd3d-df3b-4e38-af84-ed0f54d686f0");

		RequestSpecification requestSpec = builder.build();

		Response response = given().spec(requestSpec).when().log().all().get("/my/customers/v1/search").then().extract()
				.response();

		System.out.println("response: " + response.asString());

		if (response.statusCode() == 200) {
			String message = response.jsonPath().getString("status.message");

			if (message.equalsIgnoreCase("Success"))
				isETB = true;

		}

		return isETB;
	}

}
