package com.cimb.utils.random;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static org.apache.commons.lang3.StringUtils.join;

public class Identification {

	private String birthdate;
	private String bpCode;
	private String randNumber;
	private int minAge;
	private int maxAge;

	private final Leads lead;

	protected Identification(Leads lead) {
		this.lead = lead;
		this.birthdate = "";
		this.bpCode = "";
		this.randNumber = "";
		this.minAge = 18;
		this.maxAge = 60;
	}

	private String generateNric(int minAge, int maxAge) {
		LocalDate birthdate = getRandomBirthDate(minAge, maxAge);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyMMdd");

		this.birthdate = f.format(birthdate);
		this.bpCode = getRandomBPCode();
		int rand = lead.random().generateRandomNumber(4);
		this.randNumber = Integer.toString(rand);

		return join(this.birthdate, this.bpCode, this.randNumber);
	}

	public String nric() {
		return generateNric(this.minAge, this.maxAge);
	}

	public String nric(int minAge, int maxAge) {
		return generateNric(minAge, maxAge);
	}

	public String nric(int age) {
		return generateNric(age, age);
	}

	public String nricWithDash(String nric) {
		String birth = nric.substring(0, 6);
		String code = nric.substring(7, 8);
		String num = nric.substring(9, 12);

		return join(birth, "-", code, "-", num);
	}

	public String nricWithDash() {
		if (birthdate.isEmpty() || bpCode.isEmpty() || randNumber.isEmpty())
			generateNric(this.minAge, this.maxAge);

		return join(this.birthdate, "-", this.bpCode, "-", this.randNumber);
	}

	private int getMaxDayOfMonth(int month, int year) {
		YearMonth ym = YearMonth.of(year, month);
		return ym.lengthOfMonth();
	}

	private LocalDate getRandomBirthDate(int minAge, int maxAge) {
		int currYear = LocalDate.now().getYear();
		int currMonth = LocalDate.now().getMonthValue();
		int currDay = LocalDate.now().getDayOfMonth();

		int minYear = currYear - minAge;
		int maxYear = currYear - maxAge;

		int year = lead.random().generateRandomNumber(maxYear, minYear + 1);
		int month = lead.random().generateRandomNumber(1, 13);
		int day = lead.random().generateRandomNumber(1, getMaxDayOfMonth(month, year) + 1);

		if (year == minYear) {
			if (month > currMonth)
				month = currMonth;

			if (day > currDay)
				day = currDay;
		}

		return LocalDate.of(year, month, day);
	}

	private String getRandomBPCode() {
		ArrayList<String> bpCode = new ArrayList<String>();

		for (int i = 1; i <= 16; i++) {
			String code = Integer.toString(i);
			if (i >= 1 && i < 10)
				code = "0" + code;
			bpCode.add(code);
		}

		for (int i = 21; i <= 59; i++) {
			bpCode.add(Integer.toString(i));
		}

		return bpCode.get(lead.random().getRandomIndex(bpCode.size()));
	}
}
