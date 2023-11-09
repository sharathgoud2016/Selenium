package com.cimb.utils.random;

public class Leads {

	private final RandomService randService;
	private final Contacts contact;
	private final Identification id;
	private final Address address;
	private final Name name;

	public Leads() {
		this(new RandomService());
	}

	public Leads(RandomService rand) {
		this.randService = rand;
		this.contact = new Contacts(this);
		this.id = new Identification(this);
		this.address = new Address(this);
		this.name = new Name(this);
	}

	public Contacts contacts() {
		return this.contact;
	}

	public Identification identity() {
		return this.id;
	}

	public Address address() {
		return this.address;
	}

	public Name name() {
		return this.name;
	}

	public RandomService random() {
		return this.randService;
	}

}
