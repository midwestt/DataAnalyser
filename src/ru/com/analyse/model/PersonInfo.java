package ru.com.analyse.model;

public class PersonInfo {
    private String firstName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String addressCity;
    private String addressStreet;
    private String userAgent;

    public PersonInfo(String firstName, String fullName, String email, String phoneNumber, String addressCity, String addressStreet) {
        this.firstName = firstName;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addressCity = addressCity;
        this.addressStreet = addressStreet;
    }

    public PersonInfo() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserAgent() {
        return userAgent;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "firstName='" + firstName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", userAgent='" + userAgent + '\'' +
                '}';
    }
}
