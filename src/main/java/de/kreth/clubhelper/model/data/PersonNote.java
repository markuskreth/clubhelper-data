package de.kreth.clubhelper.model.data;

import java.io.Serializable;

public class PersonNote implements Serializable {

    private static final long serialVersionUID = -1205022633454190496L;

    private int id;

    private Person person;

    private String notekey = "";

    private String notetext = "";

    public PersonNote() {
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getNotekey() {
	return notekey;
    }

    public void setNotekey(String notekey) {
	this.notekey = notekey;
    }

    public String getNotetext() {
	return notetext;
    }

    public void setNotetext(String notetext) {
	this.notetext = notetext;
    }

    @Override
    public String toString() {
	return "PersonNote [id=" + id + ", person=" + person + ", notekey=" + notekey + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((notekey == null) ? 0 : notekey.hashCode());
	result = prime * result + ((notetext == null) ? 0 : notetext.hashCode());
	result = prime * result + ((person == null) ? 0 : person.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	PersonNote other = (PersonNote) obj;
	if (id != other.id) {
	    return false;
	}
	if (notekey == null) {
	    if (other.notekey != null) {
		return false;
	    }
	} else if (!notekey.equals(other.notekey)) {
	    return false;
	}
	if (notetext == null) {
	    if (other.notetext != null) {
		return false;
	    }
	} else if (!notetext.equals(other.notetext)) {
	    return false;
	}
	if (person == null) {
	    if (other.person != null) {
		return false;
	    }
	} else if (!person.equals(other.person)) {
	    return false;
	}
	return true;
    }

}
