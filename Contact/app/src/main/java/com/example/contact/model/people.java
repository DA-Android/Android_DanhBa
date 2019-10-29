package com.example.contact.model;

import java.util.Arrays;

public class people implements Comparable<people> {
    private int ID ;
    private  byte[] HINH;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String ADDRESS;

    public people(int ID, byte[] HINH, String FIRST_NAME, String LAST_NAME, String ADDRESS) {
        this.ID = ID;
        this.HINH = HINH;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.ADDRESS = ADDRESS;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public byte[] getHINH() {
        return HINH;
    }

    public void setHINH(byte[] HINH) {
        this.HINH = HINH;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    @Override
    public int compareTo(people people) {
        return FIRST_NAME.compareToIgnoreCase(people.FIRST_NAME);
    }
}
