package de.kreth.clubhelper.model.data;

import java.io.Serializable;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class Altersgruppe extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 126215772910869273L;

    private String bezeichnung;

    private int start;

    private int end;

    private Pflicht pflicht;

    private ClubEvent clubEvent;

    @Override
    public String toString() {
	return "Altersgruppe [bezeichnung=" + bezeichnung + ", pflicht=" + pflicht + ", jahre=" + start + " - " + end
		+ "]";
    }

    public boolean isBetween(Temporal startDate) {
	int year = startDate.get(ChronoField.YEAR);
	return year >= start && year <= end;
    }

    public String getBezeichnung() {
	return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
	this.bezeichnung = bezeichnung;
    }

    public int getStart() {
	return start;
    }

    public void setStart(int start) {
	this.start = start;
    }

    public int getEnd() {
	return end;
    }

    public void setEnd(int end) {
	this.end = end;
    }

    public Pflicht getPflicht() {
	return pflicht;
    }

    public void setPflicht(Pflicht pflicht) {
	this.pflicht = pflicht;
    }

    public ClubEvent getClubEvent() {
	return clubEvent;
    }

    public void setClubEvent(ClubEvent clubEvent) {
	this.clubEvent = clubEvent;
    }

    @Override
    public int hashCode() {
	final int prime = 107;
	int result = super.hashCode();
	result = prime * result;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	return super.equals(obj);
    }

}
