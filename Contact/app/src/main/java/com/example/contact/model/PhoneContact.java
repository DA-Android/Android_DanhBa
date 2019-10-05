package com.example.contact.model;

public class PhoneContact {
    private String number;
    private String kindNumber;

    public PhoneContact(String number, String kindNumber) {
        this.number = number;
        this.kindNumber = kindNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getKindNumber() {
        return kindNumber;
    }

    public void setKindNumber(String kindNumber) {
        this.kindNumber = kindNumber;
    }
}
