package com.cimb.utils.random;

import static org.apache.commons.lang3.StringUtils.join;

public class Name {

	private String[] fullName = { "firstName-lastName", "firstName-middleName-lastName" };
	private String[] firstName = { "Nagaratnam", "Emily", "John", "Mei Ling", "Nurul Fatimah", "Mohd Hassan Ali",
			"Jessica Wei Xin", "Shun Dek", "Bee Leng", "Aaron", "Abdullah Haniz", "Adalberto", "Adeline", "Jonell",
			"Chew Yii", "Jackie", "William", "Kumar", "Muthu", "Fatimah", "Wan Hashimah", "Shrishti", "Idhant",
			"Medhasvini", "Yiu Chen", "Prisha" };
	private String[] middleName = { "bin", "binti", "a/l", "a/p", "a.k.a", "s/o", "d/o" };
	private String[] lastName = { "Manjit", "Tan", "Ahmad", "Suppiah", "Brown", "Wright", "Mitchell", "Abdullah",
			"Tun Hafiz", "Hashammudin", "Evans", "Cheah", "Yu", "Chuah", "Chew", "Robinson", "Muhammad Ismail",
			"Mohammad Amir", "Lwin", "Au Yang", "Ramasamy", "Yeo" };

	private final Leads lead;

	protected Name(Leads lead) {
		this.lead = lead;
	}

	public String firstName() {
		int index = lead.random().getRandomIndex(firstName.length);
		return join("AutoTest ", firstName[index]);
	}

	public String lastName() {
		int index = lead.random().getRandomIndex(lastName.length);
		return lastName[index];
	}

	public String middleName() {
		int index = lead.random().getRandomIndex(middleName.length);
		return middleName[index];
	}

	public String fullName() {
		String fName = "";

		int index = lead.random().getRandomIndex(fullName.length);
		String[] myName = fullName[index].split("-");

		for (int i = 0; i < myName.length; i++) {
			if (myName[i].equalsIgnoreCase("firstName"))
				fName = fName + firstName() + " ";

			if (myName[i].equalsIgnoreCase("middleName"))
				fName = fName + middleName() + " ";

			if (myName[i].equalsIgnoreCase("lastName"))
				fName = fName + lastName() + " ";
		}

		return fName.trim();
	}

	public String username() {
		return fullName().replace(" ", ".").toLowerCase();
	}

	public String username(String fullName) {
		if (fullName.length() > 30)
			fullName = fullName.substring(0, 29).trim();

		return fullName.replace(" ", ".").toLowerCase();
	}
}
