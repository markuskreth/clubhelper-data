package de.kreth.clubhelper.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Gender {

    MALE(1), FEMALE(2);

    private final int id;

    private Gender(int id) {
	this.id = id;
    }

    public int getId() {
	return id;
    }

    public static Gender valueOf(Integer id) {
	if (id != null) {
	    return valueOf(id.intValue());
	} else {
	    return null;
	}
    }

    @JsonCreator
    public static Gender valueOf(@JsonProperty("id") int id) {
	for (Gender g : values()) {
	    if (g.id == id) {
		return g;
	    }
	}
	throw new IllegalArgumentException("No Gender for id=" + id + " defined.");
    }

    public String localized() {
	switch (this) {
	case FEMALE:
	    return "Weiblich";
	case MALE:
	    return "Männlich";
	default:
	    break;
	}
	throw new IllegalStateException("No localized String for " + this);
    }
}
