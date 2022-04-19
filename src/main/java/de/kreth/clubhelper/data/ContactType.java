package de.kreth.clubhelper.data;

public enum ContactType {

    PHONE("Telefon"),
    MOBILE("Mobile"),
    EMAIL("Email");

    private final String name;

    private ContactType(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public static ContactType valueByName(String name) {
	if (name == null) {
	    return null;
	}
	for (ContactType element : values()) {
	    if (element.name.equals(name)) {
		return element;
	    }
	}
	return null;
    }
}