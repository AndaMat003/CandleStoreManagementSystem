package za.ac.cput.domain;

import za.ac.cput.domain.valueobject.Address;

public class ContactDetails {
    public String email;
    private String phoneNumber;
    private Address address;

    public ContactDetails(String email, String phoneNumber, Address address) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}