package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Crime {
    private static ArrayList<Crime> crimeInstances = new ArrayList<>();
    private int id;
    private String crime;
    private String location;
    private String reportedBy;
    private int contact;
    private LocalDateTime createdAt;
    private boolean status;

    public Crime(int id, String crime, String location, String reportedBy, int contact) {
        this.id = id;
        this.crime = crime;
        this.location = location;
        this.reportedBy = reportedBy;
        this.contact = contact;
        this.id= crimeInstances.size();
        this.createdAt = LocalDateTime.now();
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

    public static ArrayList<Crime> getCrimeInstances() {
        return crimeInstances;
    }

    public static void setCrimeInstances(ArrayList<Crime> crimeInstances) {
        Crime.crimeInstances = crimeInstances;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
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
                Objects.equals(createdAt, crime1.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, crime, location, reportedBy, contact, createdAt, status);
    }
}
