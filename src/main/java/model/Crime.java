package model;

import java.sql.Timestamp;
import java.util.Objects;

public class Crime {

    private int id;
    private String crime;
    private String location;
    private String reportedBy;
    private int contact;
    private Timestamp time;
    private boolean status;

    public Crime(int id, String crime, String location, String reportedBy, int contact) {
        this.id = id;
        this.crime = crime;
        this.location = location;
        this.reportedBy = reportedBy;
        this.contact = contact;
        this.time = time;
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crime crime1 = (Crime) o;
        return id == crime1.id &&
                contact == crime1.contact &&
                status == crime1.status &&
                Objects.equals(crime, crime1.crime) &&
                Objects.equals(location, crime1.location) &&
                Objects.equals(reportedBy, crime1.reportedBy) &&
                Objects.equals(time, crime1.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, crime, location, reportedBy, contact, time, status);
    }
}
