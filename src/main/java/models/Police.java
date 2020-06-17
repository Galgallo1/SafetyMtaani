package models;

import java.util.Objects;

public class Police {
    private String firstName;
    private String lastName;
    private String email;
    private Integer mobile;
    private int PoliceRegNumber;
    private int id;

    public Police(String firstName, String lastName, String email, Integer mobile, int policeRegNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        PoliceRegNumber = policeRegNumber;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public int getPoliceRegNumber() {
        return PoliceRegNumber;
    }

    public void setPoliceRegNumber(int policeRegNumber) {
        PoliceRegNumber = policeRegNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Police police = (Police) o;
        return id == police.id &&
                Objects.equals(firstName, police.firstName) &&
                Objects.equals(lastName, police.lastName) &&
                Objects.equals(email, police.email) &&
                Objects.equals(mobile, police.mobile) &&
                Objects.equals(PoliceRegNumber, police.PoliceRegNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, mobile, PoliceRegNumber, id);
    }
}
